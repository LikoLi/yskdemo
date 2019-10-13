package com.example.web.controller;

import com.alibaba.fastjson.JSONObject;
import lombok.Data;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/shop")
public class ShopController {

    @RequestMapping("/{id}")
    public String shop(@PathVariable("id") String id) {
        SKU sku = new SKU();
        sku.setId(id);
        sku.setStyle("Nick");
        sku.setColor("Red");
        sku.setSize("L");
        return JSONObject.toJSONString(sku);
    }


}

@Data
class SKU {
    private String id;
    private String style;
    private String color;
    private String size;
}

package com.example.client.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.client.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {

    @Autowired
    private ClientService service;

    @RequestMapping("/{id}")
    public String show(@PathVariable("id") String id) {
        return JSONObject.toJSONString(service.shop(id))    ;
    }
}


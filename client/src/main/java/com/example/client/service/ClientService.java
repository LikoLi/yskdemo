package com.example.client.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "client", url = "http://localhost:8080/shop")
public interface ClientService {

    @RequestMapping("/{id}")
    String shop(@PathVariable("id") String id);
}

package com.product_catalogue.product_app.controller;
import java.util.*;

import com.product_catalogue.product_app.model.ProductEntity;
import com.product_catalogue.product_app.repository.Product_repository;
import com.product_catalogue.product_app.service.Product_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class Product_controller {
    @Autowired
    Product_service service;

    @GetMapping("/id/{id}")
    public ProductEntity findById(@PathVariable long id){
        return service.findById(id);
    }

    @GetMapping("/color/{color}")
    public List<ProductEntity> findByColor(@PathVariable String color){
        return service.findByColor(color);
    }

    @PostMapping("/")
    public ProductEntity createOfType(@RequestBody ProductEntity body){
        System.out.println("req body, ---> "+body);
        return service.createOfType(body);
    }
}

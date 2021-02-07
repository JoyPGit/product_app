package com.product_catalogue.product_app.service;
import java.time.LocalDateTime;
import java.util.List;
import com.product_catalogue.product_app.model.ProductEntity;
import com.product_catalogue.product_app.repository.Product_repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Product_service{
    @Autowired
    private Product_repository repository;

    public ProductEntity findById(long id){
        return this.repository.getById(id);
    }

    public List<ProductEntity> findByColor(String color){
        return this.repository.getByColor(color);
    }

    // shirt -> req body
    public ProductEntity createOfType(ProductEntity body) {
        body.setCreatedAt(LocalDateTime.now());
        body.setUpdatedAt(LocalDateTime.now());
        return this.repository.save(body);
    }
}
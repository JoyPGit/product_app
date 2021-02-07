package com.product_catalogue.product_app.repository;

import com.product_catalogue.product_app.model.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.*;

// interface
@Repository
public interface Product_repository extends JpaRepository<ProductEntity, Long> {
    // these are all implemented by JpaRepository
    ProductEntity getById(long id);

    @Query(value = "Select * from ProductEntity p where p.color = :color", nativeQuery = true)
    List<ProductEntity> getByColor(String color);
}

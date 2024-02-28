package com.bancolombia.rest.product.service;

import com.bancolombia.rest.product.model.ProductEntity;
import org.springframework.http.ResponseEntity;

public interface ProductService {


    ResponseEntity<?> save(ProductEntity productEntity);

    ResponseEntity<?> findAll();

    ResponseEntity<?> findById(Long productId);

    ResponseEntity buscarNombre(String name);

}

package com.bancolombia.rest.product.service.impl;

import com.bancolombia.rest.product.model.ProductEntity;
import com.bancolombia.rest.product.repository.ProductRepository;
import com.bancolombia.rest.product.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;

    @Override
    public ResponseEntity<?> save(ProductEntity productEntity) {
        var  newProduct = this.productRepository.save(productEntity);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(newProduct);
    }

    @Override
    public ResponseEntity<?> findAll() {
        var products = this.productRepository.findAll();
        return ResponseEntity.ok(products);
    }

    @Override
    public ResponseEntity<?> findById(Long productId) {
        var products = this.productRepository.findById(productId);
        if(products.isPresent()){
            return ResponseEntity.ok(products.get());
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Product not found");
    }

    @Override
    public ResponseEntity buscarNombre(String name) {

        var prodcut = this.productRepository
                .findByName(name)
                .orElse(new ProductEntity());


        return  ResponseEntity.ok(prodcut);
    }

}

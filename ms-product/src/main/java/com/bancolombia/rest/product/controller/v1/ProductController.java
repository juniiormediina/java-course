package com.bancolombia.rest.product.controller.v1;

import com.bancolombia.rest.product.model.ProductEntity;
import com.bancolombia.rest.product.service.ProductService;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/product")
public class ProductController {

    private final ProductService productService;

    @PostMapping
    public ResponseEntity<?> create(@RequestBody ProductEntity productEntity){
        return  this.productService.save(productEntity);
    }

    @GetMapping()
    public ResponseEntity<?> findAll(){
        return this.productService.findAll();
    }

    @GetMapping("find-by-id/{productId}")
    public  ResponseEntity<?> findById(@PathVariable Long productId){
        return this.productService.findById(productId);
    }

}

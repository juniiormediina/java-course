package com.bancolombia.rest.product.controller.v2;

import com.bancolombia.rest.product.controller.v2.doc.ProductDoc;
import com.bancolombia.rest.product.model.ProductEntity;
import com.bancolombia.rest.product.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
public class ProductControllerV2 implements ProductDoc {

    private final ProductService productService;

    @Override
    public ResponseEntity<?> create(ProductEntity productEntity) {
        return  this.productService.save(productEntity);
    }

}

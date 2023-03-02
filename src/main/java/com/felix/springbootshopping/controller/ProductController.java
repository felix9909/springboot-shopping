package com.felix.springbootshopping.controller;


import com.felix.springbootshopping.dto.ProductRequest;
import com.felix.springbootshopping.model.Product;
import com.felix.springbootshopping.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/products/{productId}")
    public ResponseEntity<Product> getProduct(@PathVariable Integer productId) {
        Product product = productService.getProductById(productId);
        if (product != null) {
            return ResponseEntity.status(HttpStatus.OK).body(product);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }

    }

    @PostMapping("/products")
    public ResponseEntity<Product> createProduct(@RequestBody @Valid ProductRequest productRequest) {
        Integer productId = productService.createProduct(productRequest);

        Product product = productService.getProductById(productId);

        return ResponseEntity.status(HttpStatus.CREATED).body(product);
    }

    @PutMapping("/products/{productsId}")
    public ResponseEntity<Product> updateProduct(@PathVariable Integer productsId,
                                                 @RequestBody @Valid ProductRequest productRequest) {


        Product product = productService.getProductById(productsId);

        if (product == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();

        }


        productService.updateProduct(productsId, productRequest);

        Product updatedProduct = productService.getProductById(productsId);

        return ResponseEntity.status(HttpStatus.OK).body(updatedProduct);


    }

    @DeleteMapping("/products/{productId}")
    public ResponseEntity<?>deleteProduct(@PathVariable Integer productId){
        productService.deleteProductById(productId);

        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}

package com.felix.springbootshopping.service;

import com.felix.springbootshopping.dto.ProductRequest;
import com.felix.springbootshopping.model.Product;

public interface ProductService {
    Product getProductById (Integer productId);

    Integer createProduct(ProductRequest productRequest);
}

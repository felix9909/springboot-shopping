package com.felix.springbootshopping.service;

import com.felix.springbootshopping.dto.ProductQueryParams;
import com.felix.springbootshopping.dto.ProductRequest;
import com.felix.springbootshopping.model.Product;

import java.util.List;

public interface ProductService {


    Integer countProduct(ProductQueryParams productQueryParams);

    List<Product> getProducts(ProductQueryParams productQueryParams);

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}

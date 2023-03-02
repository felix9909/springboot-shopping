package com.felix.springbootshopping.service;

import com.felix.springbootshopping.constant.ProductCategory;
import com.felix.springbootshopping.dto.ProductRequest;
import com.felix.springbootshopping.model.Product;

import java.util.List;

public interface ProductService {


    List<Product>getProducts(ProductCategory category , String search);

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}

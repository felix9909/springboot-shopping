package com.felix.springbootshopping.dao;

import com.felix.springbootshopping.constant.ProductCategory;
import com.felix.springbootshopping.dto.ProductRequest;
import com.felix.springbootshopping.model.Product;

import java.util.List;

public interface ProductDao {

    List<Product> getProducts(ProductCategory category , String search);

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}

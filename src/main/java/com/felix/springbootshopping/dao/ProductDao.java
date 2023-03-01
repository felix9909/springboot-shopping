package com.felix.springbootshopping.dao;

import com.felix.springbootshopping.dto.ProductRequest;
import com.felix.springbootshopping.model.Product;

public interface ProductDao {

    Product getProductById (Integer productId);

    Integer createProduct(ProductRequest productRequest);
}

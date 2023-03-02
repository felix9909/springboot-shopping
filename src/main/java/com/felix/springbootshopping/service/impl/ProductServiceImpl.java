package com.felix.springbootshopping.service.impl;

import com.felix.springbootshopping.constant.ProductCategory;
import com.felix.springbootshopping.dao.ProductDao;
import com.felix.springbootshopping.dto.ProductRequest;
import com.felix.springbootshopping.model.Product;
import com.felix.springbootshopping.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class ProductServiceImpl implements ProductService {

    @Override
    public List<Product> getProducts(ProductCategory category ,String search) {
        return productDao.getProducts(category ,search);
    }

    @Autowired
    private ProductDao productDao;

    @Override
    public Product getProductById(Integer productId) {
        return productDao.getProductById(productId);
    }

    @Override
    public Integer createProduct(ProductRequest productRequest) {


        return productDao.createProduct(productRequest);
    }

    @Override
    public void updateProduct(Integer productId, ProductRequest productRequest) {
        productDao.updateProduct(productId, productRequest);

    }

    @Override
    public void deleteProductById(Integer productId) {
        productDao.deleteProductById(productId);
    }
}

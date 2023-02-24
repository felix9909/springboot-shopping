package com.felix.springbootshopping.service.impl;

import com.felix.springbootshopping.dao.ProductDao;
import com.felix.springbootshopping.model.Product;
import com.felix.springbootshopping.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public Product getProductById(Integer productId) {
        return productDao.getProductById(productId);
    }
}

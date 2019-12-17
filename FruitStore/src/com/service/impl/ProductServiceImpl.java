package com.service.impl;

import com.dao.ProductDao;
import com.dao.impl.ProductDaoImpl1;
import com.domain.Product;
import com.service.ProductService;

import java.util.List;

public class ProductServiceImpl implements ProductService {
    ProductDao productDao=new ProductDaoImpl1();

    @Override
    public int addProduct(Product product) {
        return productDao.addProduct(product);
    }

    @Override
    public List<Product> showAll() {
        return productDao.showAll();
    }

    @Override
    public Product findProduct(int id) {
        return productDao.findProduct(id);
    }

    @Override
    public int updateProduct(Product product) {
        return productDao.updateProduct(product);
    }

    @Override
    public int deleteProduct(int id) {
        return productDao.deleteProduct(id);
    }

    @Override
    public List<Product> queryProduct(String keyword) {
        return productDao.queryProduct(keyword);
    }
}

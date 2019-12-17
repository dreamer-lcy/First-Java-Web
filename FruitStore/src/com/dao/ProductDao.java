package com.dao;

import com.domain.Product;

import java.util.List;

public interface ProductDao {
    public int addProduct(Product product);
    public List<Product> showAll();
    public Product findProduct(int id);
    public int updateProduct(Product product);
    public int deleteProduct(int id);
    public List<Product> queryProduct(String keyword);

}

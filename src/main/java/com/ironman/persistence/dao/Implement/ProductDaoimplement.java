package com.ironman.persistence.dao.Implement;

import com.ironman.persistence.dao.ProductDao;
import com.ironman.persistence.entity.Product;

import java.util.List;

public class ProductDaoimplement implements ProductDao {

    @Override
    public List<Product> findAll() throws Exception {
        return List.of();
    }

    @Override
    public Product findById(Long aLong) throws Exception {
        return null;
    }

    @Override
    public int create(Product entity) throws Exception {
        return 0;
    }

    @Override
    public int update(Long aLong, Product entity) throws Exception {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) throws Exception {

    }
}

package com.ironman;

import com.ironman.dao.CategoryDao;
import com.ironman.entity.Category;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // 1.
        //        ConnectionCore connection= new ConnectionCore();
        //        connection.getConnection();
        //        System.out.println("Connection Successfull!!");

        // 2.
        CategoryDao categoryDao= new CategoryDao();
        List<Category> categoryList = categoryDao.findAll();
        System.out.println("Categories start");
        for (Category category : categoryList){
            System.out.println("CategoryName["+category.getId()+"]: "+ category.getName());
        }
        System.out.println("Categories end");
    }
}
package com.ironman;

import com.ironman.dao.CategoryDao;
import com.ironman.dao.Implement.CategoryDaoImplement;
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
//        CategoryDao categoryDao= new CategoryDao();
//        List<Category> categoryList = categoryDao.findAll();
//        System.out.println("Categories start");
//        for (Category category : categoryList){
//            System.out.println("CategoryName["+category.getId()+"]: "+ category.getName());
//        }
//        System.out.println("Categories end");

        // 3.
//      try{
//          CategoryDao categoryDao = new CategoryDao();
//          List<Category> categoryList = categoryDao.findAll();
//          System.out.println("Categories start");
//          for (Category category : categoryList) {
//              System.out.println("CategoryName[" + category.getId() + "]: " + category.getName());
//          }
//          System.out.println("Categories end");
//
//      }catch (Exception e){
//          // Para el usuario final no se debe mostrar datos sensibles como la ip
//          // Por ello es recomendable personalizar los mensajes de error
//          System.out.println("Error"+e.getMessage());
//      }

        // 3.
        try {
            CategoryDao categoryDao= new CategoryDaoImplement();

            Category category = categoryDao.findById(66L);

            System.out.println("CategoryName[" + category.getId() + "]: " + category.getName());

        } catch (Exception e) {
            System.out.println("Error" + e.getMessage());
        }

    }
}
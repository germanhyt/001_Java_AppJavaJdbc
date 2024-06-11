package com.ironman;

import com.ironman.persistence.dao.CategoryDao;
import com.ironman.persistence.dao.Implement.CategoryDaoImplement;

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

        // 4.
//        try {
//            CategoryDao categoryDao= new CategoryDaoImplement();
//
//            Category category = categoryDao.findById(66L);
//
//            System.out.println("CategoryName[" + category.getId() + "]: " + category.getName());
//
//        } catch (Exception e) {
//            System.out.println("Error" + e.getMessage());
//        }

        // 5.
//        try {
//            CategoryDao categoryDao= new CategoryStoreimplement();
//
//            Category category = categoryDao.findById(66L);
//
//            System.out.println("CategoryName[" + category.getId() + "]: " + category.getName());
//
//        } catch (Exception e) {
//            System.out.println("Error" + e.getMessage());
//        }

        // 6.
//        try {
//            CategoryDao categoryDao= new CategoryDaoImplement();
//
//            Category category = new Category();
//            category.setName("testCreate2");
//            category.setDescription("sin detalles");
//            category.setUrlKey("category-A");
//            category.setState("A");
//            category.setCreateAt(LocalDateTime.now());
//
//            int result= categoryDao.create(category);
//
//            System.out.println("Create: "+ result);
//
//        } catch (Exception e) {
//            System.out.println("Error" + e.getMessage());
//        }
//
        // 7.
//        try {
//            CategoryDao categoryDao = new CategoryDaoImplement();
//
//            Category category = new Category();
//            category.setName("TestCreate2");
//            category.setDescription("sin detalles");
//            category.setUrlKey("category-A");
//            category.setState("A");
//            category.setUpdateTime(LocalDateTime.now());
//
//            int result = categoryDao.update(120L, category);
//
//            System.out.println("Update: " + result);
//
//        } catch (Exception e) {
//            System.out.println("Error" + e.getMessage());
//        }

        // 8.
        try {
            CategoryDao categoryDao = new CategoryDaoImplement();

            categoryDao.deleteById(120L);
            System.out.println("DeletedId");

        } catch (Exception e) {
            System.out.println("Error" + e.getMessage());
        }

    }
}
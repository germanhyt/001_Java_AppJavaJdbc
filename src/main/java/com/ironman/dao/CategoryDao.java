package com.ironman.dao;

import com.ironman.entity.Category;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class CategoryDao {

    public List<Category> findAll(){
        // Attributes
        List<Category> categories= new ArrayList<>();

        Category category;
        String sqlQuery;
        Connection connection;
        ResultSet resultSet;
        PreparedStatement preparedStatement;

        // process
        try{
            // Definir las columnas en el select es recomendable
            sqlQuery = "select id, name, description , url_key , state , created_at , updated_at  from categories";

            // Get connection
            connection= new ConnectionCore().getConnection();

            // Preparte statement
            preparedStatement = connection.prepareStatement(sqlQuery);
            resultSet = preparedStatement.executeQuery();


            while(resultSet.next()){
                category= new Category();
                category.setId(resultSet.getLong("id"));
                category.setName(resultSet.getString("name"));
                category.setUrlKey(resultSet.getString("url_key"));
                category.setState(resultSet.getString("state"));

                Timestamp createdAt= resultSet.getTimestamp("created_at");
                if(createdAt!=null){
                    category.setCreateAt(createdAt.toLocalDateTime());
                }

                Timestamp updatedAt= resultSet.getTimestamp("updated_at");
                if(updatedAt!=null){
                    category.setUpdateTime(updatedAt.toLocalDateTime());
                }

                categories.add(category);
            }

        }catch (Exception e){
            System.out.println("CategoryDao::findAll:Error: "+e.getMessage());
        }

        // result
        return categories;
    }
}

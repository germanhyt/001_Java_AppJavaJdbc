package com.ironman.dao.Implement;

import com.ironman.dao.CategoryDao;
import com.ironman.dao.Core.ConnectionCore;
import com.ironman.entity.Category;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class CategoryDaoImplement extends ConnectionCore implements CategoryDao {

    @Override
    public List<Category> findAll() throws Exception {
        // Attributes
        List<Category> categories = new ArrayList<>();
        Category category;
        String sqlQuery;

        // sql query
        sqlQuery = "select id, name, description , url_key , state , created_at , updated_at  from categories";

        // process
        try (
                // Get connection
                Connection connection = getConnection();
                // Prepared statement
                PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
                //Resultset
                ResultSet resultSet = preparedStatement.executeQuery();
        ) {

            while (resultSet.next()) {
                category = mapResultSetToCategory(resultSet);

                categories.add(category);
            }

        }

        // result
        return categories;

    }

    @Override
    public Category findById(Long id) throws Exception {

        // Attributes
        Category category = null;
        String sqlQuery;

        // Process
        sqlQuery = "select id, name, description , url_key , state , created_at , updated_at  from categories where id=?";

        try (
                // Get connection
                Connection connection = getConnection();
                // Prepared statement
                PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);

        ) {

            // set parameter
            preparedStatement.setLong(1, id);

            try (
                    //Resultset
                    ResultSet resultSet = preparedStatement.executeQuery();

            ) {
                if (resultSet.next()) {
                    category = mapResultSetToCategory(resultSet);
                }
            }
        }

        // Result
        return category;
    }

    @Override
    public int create(Category category) throws Exception {
        // Attributes
        int result = 0;
        String sqlQuery = "";

        // Process

        sqlQuery = "insert into categories ( name, description , url_key , state , created_at) values (?,?,?,?,?)";
        try (
                Connection connection = getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);

        ) {

            // set parameter
            preparedStatement.setString(1, category.getName());
            preparedStatement.setString(2, category.getDescription());
            preparedStatement.setString(3, category.getUrlKey());
            preparedStatement.setString(4, category.getState());
            preparedStatement.setTimestamp(5, Timestamp.valueOf(category.getCreateAt()));

            // execute query
            result = preparedStatement.executeUpdate();

        }

        // Result
        return result;
    }

    @Override
    public int update(Long id, Category category) throws Exception {
        // Attributes
        int result = 0;
        String sqlQuery;


        // Process

        sqlQuery = "update categories set name = ?, description = ?, url_key = ?, updated_at =? where id = ? ";

        try (
                // Connection
                Connection connection = getConnection();

                // Prepare statement
                PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);

        ) {
            // set parameter
            preparedStatement.setString(1, category.getName());
            preparedStatement.setString(2, category.getDescription());
            preparedStatement.setString(3, category.getUrlKey());
            preparedStatement.setTimestamp(4, Timestamp.valueOf(category.getUpdateTime()));
            preparedStatement.setLong(5, id);

            // execute query
            result = preparedStatement.executeUpdate();
        }

        // Result
        return result;
    }

    @Override
    public void deleteById(Long id) throws Exception {
        // Attributes
        String sqlQuery;

        // Process

        sqlQuery = "delete from categories where id =?";

        try (
                // Connection
                Connection connection = getConnection();

                // Prepare statement
                PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);

        ) {
            // set parameter
            preparedStatement.setLong(1, id);

            // execute query
            preparedStatement.executeUpdate();
        }

        // Result
    }


    private Category mapResultSetToCategory(ResultSet resultSet) throws Exception {
        Category category = new Category();
        category.setId(resultSet.getLong("id"));
        category.setName(resultSet.getString("name"));
        category.setUrlKey(resultSet.getString("url_key"));
        category.setState(resultSet.getString("state"));

        Timestamp createdAt = resultSet.getTimestamp("created_at");
        if (createdAt != null) {
            category.setCreateAt(createdAt.toLocalDateTime());
        }

        Timestamp updatedAt = resultSet.getTimestamp("updated_at");
        if (updatedAt != null) {
            category.setUpdateTime(updatedAt.toLocalDateTime());
        }

        return category;
    }

}

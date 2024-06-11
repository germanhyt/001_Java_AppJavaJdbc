package com.ironman.persistence.dao;

import com.ironman.persistence.dao.Core.CrudDao;
import com.ironman.persistence.entity.Category;

public interface CategoryDao extends CrudDao<Category,Long> {

    // Utiliza los métodos de CategoryDaro<>

    /*
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
                Connection connection = new ConnectionCore().getConnection();
                // Prepared statement
                PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);
                //Resultset
                ResultSet resultSet = preparedStatement.executeQuery();
        ) {

            while (resultSet.next()) {
                category = new Category();
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

                categories.add(category);
            }

        }

        // result
        return categories;
    }

    public Category findById(Long id) throws Exception {
        // Attributes
        Category category = null;
        String sqlQuery;

        // Process
        sqlQuery = "select id, name, description , url_key , state , created_at , updated_at  from categories where id=?";

        try (
                // Get connection
                Connection connection = new ConnectionCore().getConnection();
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
                    category = new Category();
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
                }
            }
        }

        // Result
        return category;
    }

    */
}

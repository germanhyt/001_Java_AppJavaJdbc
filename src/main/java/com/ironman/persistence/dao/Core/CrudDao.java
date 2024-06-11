package com.ironman.persistence.dao.Core;
import java.util.List;

public interface CrudDao<T,ID>{
    List<T> findAll() throws Exception;
    T findById(ID id) throws Exception;

    int create(T entity) throws Exception;
    int update(ID id, T entity) throws Exception;
    void deleteById(ID id) throws Exception;
}

package com.ironman.application.service;

import com.ironman.application.dto.category.CategoryDto;
import com.ironman.application.dto.category.CategorySmallDto;
import java.util.List;

public interface CategoryService {

    List<CategorySmallDto> findAll() throws Exception;
    CategoryDto findById(Long id) throws Exception;

}

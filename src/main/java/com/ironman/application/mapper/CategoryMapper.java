package com.ironman.application.mapper;

import com.ironman.application.dto.category.CategoryDto;
import com.ironman.application.dto.category.CategorySmallDto;
import com.ironman.persistence.entity.Category;

public class CategoryMapper {

    public CategorySmallDto toSmallDto (Category category){
        CategorySmallDto dto= new CategorySmallDto();

        dto.setId(category.getId());
        dto.setName(category.getName());

        return dto;
    }

    public CategoryDto toDto(Category category){
        CategoryDto dto= new CategoryDto();

        dto.setId(category.getId());
        dto.setName(category.getName());
        dto.setDescription(category.getDescription());
        dto.setUrlKey(category.getUrlKey());
        dto.setState(category.getState());
        dto.setCreateAt(category.getCreateAt());
        dto.setUpdateTime(category.getUpdateTime());

        return dto;
    }

}

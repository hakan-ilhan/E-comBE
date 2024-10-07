package com.example.ecommerce.service;

import com.example.ecommerce.entity.Category;
import com.example.ecommerce.entity.Image;

import java.util.List;

public interface ImageService {
    List<Image> findAll();
    Image findById(long id);
    Image save(Category category);
    Image delete(long id);
}

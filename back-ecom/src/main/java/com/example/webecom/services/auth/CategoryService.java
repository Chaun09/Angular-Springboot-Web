package com.example.webecom.services.auth;

import com.example.webecom.entity.Category;
import com.example.webecom.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.*;


@Service
@RequiredArgsConstructor
public class CategoryService {
    private final CategoryRepository categoryRepository;

    public ResponseEntity<?> findAll() {
        List<Category> categories = categoryRepository.findAll();
        if (categories.isEmpty())
            return new ResponseEntity<>("No Category", HttpStatus.NOT_FOUND);
        return ResponseEntity.ok(categories);

    }

}

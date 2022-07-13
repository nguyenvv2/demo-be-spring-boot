package edu.poly.test_qlda.controller;


import edu.poly.test_qlda.infrastructure.response.CategoryResponse;
import edu.poly.test_qlda.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    // lấy danh sách category và các product của từng category tương ứng
    @GetMapping
    public ResponseEntity<List<CategoryResponse>> finAllProduct() {
        return new ResponseEntity<>(categoryService.getList(), HttpStatus.OK);
    }

}

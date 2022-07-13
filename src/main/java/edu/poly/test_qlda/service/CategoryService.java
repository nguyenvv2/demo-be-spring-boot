package edu.poly.test_qlda.service;

import edu.poly.test_qlda.infrastructure.response.CategoryResponse;

import java.util.List;

/**
 * @author nguyenvv4
 */
public interface CategoryService {

    List<CategoryResponse> getList();
}

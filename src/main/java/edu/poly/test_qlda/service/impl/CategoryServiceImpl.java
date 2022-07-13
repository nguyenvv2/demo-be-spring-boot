package edu.poly.test_qlda.service.impl;

import edu.poly.test_qlda.infrastructure.response.CategoryResponse;
import edu.poly.test_qlda.repository.CategoryRepository;
import edu.poly.test_qlda.repository.CategoryResponseRepository;
import edu.poly.test_qlda.repository.ProductRepository;
import edu.poly.test_qlda.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author nguyenvv4
 */
@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private CategoryResponseRepository categoryResponseRepository;

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<CategoryResponse> getList() {
        return categoryResponseRepository.getList();
    }
}

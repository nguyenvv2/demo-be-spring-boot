package edu.poly.test_qlda.service;

import edu.poly.test_qlda.infrastructure.request.ProductRequest;
import edu.poly.test_qlda.model.Products;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ProductService {
    String createProduct(ProductRequest request) ;

    String deleteProduct(Long id);

    Page<Products> findAllProduct(Pageable pageable);
}

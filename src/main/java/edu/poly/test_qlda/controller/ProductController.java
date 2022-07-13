package edu.poly.test_qlda.controller;

import edu.poly.test_qlda.infrastructure.request.ProductRequest;
import edu.poly.test_qlda.model.Products;
import edu.poly.test_qlda.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product/")
public class ProductController {
    @Autowired
    private ProductService productService;

    // lấy danh sách product có sử dụng phân trang mặc định của spring
    @GetMapping(value = "get-list")
    public ResponseEntity<Page<Products>> finAllProduct(Pageable pageable) {
        return new ResponseEntity<>(productService.findAllProduct(pageable), HttpStatus.OK);
    }

    @PostMapping(value = "add")
    public ResponseEntity<String> createProduct(@RequestBody ProductRequest request) {
        return new ResponseEntity<>(productService.createProduct(request), HttpStatus.CREATED);
    }

//    @PutMapping("/{id}")
//    public ResponseEntity<String> updateProduct(@RequestBody ProductRequest request, @PathVariable("id") Long id) {
//        String erro = productService.createProduct(request, id);
//        return new ResponseEntity<>(erro, HttpStatus.CREATED);
//    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<String> deleteProduct(@PathVariable("id") Long id) {
        String erro = productService.deleteProduct(id);
        return new ResponseEntity<>(erro, HttpStatus.OK);
    }
}

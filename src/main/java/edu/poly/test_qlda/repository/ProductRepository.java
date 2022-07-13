package edu.poly.test_qlda.repository;

import edu.poly.test_qlda.model.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * @author nguyenvv4
 */
public interface ProductRepository extends JpaRepository<Products, Long> {

    @Query(value = "SELECT id , produce_name , color ,quantity ,sell_price ,origin_price ,description " +
            " FROM product p  WHERE subcate_id =1" ,nativeQuery = true)
    List<Products> getByCategoryId();
}

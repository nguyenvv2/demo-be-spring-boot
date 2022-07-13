package edu.poly.test_qlda.repository;

import edu.poly.test_qlda.infrastructure.response.CategoryResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * @author nguyenvv4
 */
@Repository
public interface CategoryResponseRepository extends JpaRepository<CategoryResponse, Long> {

    @Query(value = " SELECT  category.id as id, category.cate_code, " +
            " category.cate_name, product.produce_name  " +
            " from category left join sub_category ON category.id = sub_category.cate_id \n" +
            " left join product on sub_category.id = product.subcate_id ",
            nativeQuery = true)
    List<CategoryResponse> getList();

}

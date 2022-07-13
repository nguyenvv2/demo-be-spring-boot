package edu.poly.test_qlda.repository;

import edu.poly.test_qlda.model.Categories;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Categories, Long>{
}

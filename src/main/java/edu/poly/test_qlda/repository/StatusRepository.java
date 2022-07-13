package edu.poly.test_qlda.repository;

import edu.poly.test_qlda.model.Status;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author nguyenvv4
 */
public interface StatusRepository extends JpaRepository<Status, Long> {
}

package edu.poly.test_qlda.service;

import edu.poly.test_qlda.infrastructure.request.StatusRequest;
import edu.poly.test_qlda.model.Status;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * @author nguyenvv4
 */
public interface StatusService {

    Page<Status> getList(Pageable pageable);

    Status addNew(StatusRequest status);

    Status update(StatusRequest statusRequest, Long id);

    Boolean delete(Long id);

}

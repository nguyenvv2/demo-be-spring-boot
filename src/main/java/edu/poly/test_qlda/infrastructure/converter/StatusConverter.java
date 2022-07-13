package edu.poly.test_qlda.infrastructure.converter;

import edu.poly.test_qlda.infrastructure.request.StatusRequest;
import edu.poly.test_qlda.model.Status;
import org.springframework.stereotype.Component;

/**
 * @author nguyenvv4
 */

@Component
public class StatusConverter {
    public Status converter(StatusRequest request) {
        Status entity = new Status();
        entity.setStatusName(request.getStatusName());
        return entity;
    }
}

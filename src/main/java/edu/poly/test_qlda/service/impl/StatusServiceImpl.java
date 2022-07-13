package edu.poly.test_qlda.service.impl;

import edu.poly.test_qlda.infrastructure.converter.StatusConverter;
import edu.poly.test_qlda.infrastructure.exception.ApiException;
import edu.poly.test_qlda.infrastructure.request.StatusRequest;
import edu.poly.test_qlda.model.Status;
import edu.poly.test_qlda.repository.StatusRepository;
import edu.poly.test_qlda.service.StatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * @author nguyenvv4
 */
@Service
public class StatusServiceImpl implements StatusService {

    @Autowired
    private StatusRepository statusRepository;

    @Override
    public Page<Status> getList(Pageable pageable) {
        return statusRepository.findAll(pageable);
    }

    @Override
    public Status addNew(StatusRequest status) {
        Status statusNew = new StatusConverter().converter(status);
        return statusRepository.save(statusNew);

    }

    @Override
    public Status update(StatusRequest statusRequest, Long id) {

        Optional<Status> status = statusRepository.findById(id);
        if (!status.isPresent()) {
            throw new ApiException("Khong ton tai status");
        } else {
            status.get().setStatusName(statusRequest.getStatusName());
            return statusRepository.save(status.get());
        }
    }

    @Override
    public Boolean delete(Long id) {
        Optional<Status> status = statusRepository.findById(id);
        if (!status.isPresent()) {
            throw new ApiException("Khong ton tai status de xoa");
        }
        statusRepository.delete(status.get());
        return true;

    }


}

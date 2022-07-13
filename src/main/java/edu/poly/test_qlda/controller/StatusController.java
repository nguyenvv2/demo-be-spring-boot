package edu.poly.test_qlda.controller;

import edu.poly.test_qlda.infrastructure.request.StatusRequest;
import edu.poly.test_qlda.model.Status;
import edu.poly.test_qlda.service.StatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author nguyenvv4
 */

@RestController
@RequestMapping("/status/")
public class StatusController {
    @Autowired
    private StatusService statusService;

    @GetMapping(value = "get-list")
    public ResponseEntity<Page<Status>> finAllProduct(Pageable pageable) {
        return new ResponseEntity<>(statusService.getList(pageable), HttpStatus.OK);
    }

    @PostMapping(value = "add")
    public ResponseEntity<Status> addNew(@RequestBody StatusRequest statusRequest) {
        return new ResponseEntity<>(statusService.addNew(statusRequest), HttpStatus.OK);
    }

    @PutMapping(value = "update/{id}")
    public ResponseEntity<Status> update(@RequestBody StatusRequest statusRequest,
                                         @PathVariable("id") Long statusId) {
        return new ResponseEntity<>(statusService.update(statusRequest, statusId), HttpStatus.OK);
    }

    @DeleteMapping(value = "delete/{id}")
    public ResponseEntity delete(@PathVariable("id") Long statusId) {
        return new ResponseEntity<>(statusService.delete(statusId), HttpStatus.OK);
    }
}

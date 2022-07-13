package edu.poly.test_qlda.infrastructure.response;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author nguyenvv4
 */


@Data
@Entity
public class CategoryResponse {

    @Id
    private Long id;

    private String cateCode;

    private String cateName;

    private String produceName;

}

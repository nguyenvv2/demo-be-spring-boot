package edu.poly.test_qlda.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "product")
public class Products implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "subcate_id")
    private Long subcateId;

    @Column(name = "produce_name")
    private String productName;

    private String color;

    private int quantity;

    @Column(name = "sell_price")
    private double sellPrice;

    @Column(name = "origin_price")
    private double originPrice;

    private String description;

}

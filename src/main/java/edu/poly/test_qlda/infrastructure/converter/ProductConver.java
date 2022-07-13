package edu.poly.test_qlda.infrastructure.converter;

import edu.poly.test_qlda.infrastructure.request.ProductRequest;
import edu.poly.test_qlda.model.Products;
import org.springframework.stereotype.Component;

@Component
public class ProductConver {
    public Products ConverProductDTOToEntity(ProductRequest request) {
        Products entity = new Products();
        entity.setProductName(request.getProduceName());
        entity.setColor(request.getColer());
        entity.setQuantity(request.getQuantity());
        entity.setSellPrice(request.getSellPDrice());
        entity.setOriginPrice(request.getOriginPrice());
        entity.setDescription(request.getDescription());
        return entity;
    }

    public Products ConverProductDTOToEntity(Products entity, ProductRequest request) {
        entity.setProductName(request.getProduceName());
        entity.setColor(request.getColer());
        entity.setQuantity(request.getQuantity());
        entity.setSellPrice(request.getSellPDrice());
        entity.setOriginPrice(request.getOriginPrice());
        entity.setDescription(request.getDescription());
        return entity;
    }
}

package edu.poly.test_qlda.service.impl;

import edu.poly.test_qlda.infrastructure.converter.ProductConver;
import edu.poly.test_qlda.infrastructure.exception.ApiException;
import edu.poly.test_qlda.infrastructure.request.ProductRequest;
import edu.poly.test_qlda.model.Products;
import edu.poly.test_qlda.repository.ProductRepository;
import edu.poly.test_qlda.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private ProductConver productConver;

    @Override
    public String createProduct(ProductRequest request) {
        String erro = "";
        if (request.getProduceName().isBlank()) {
            throw new ApiException("khong duoc null");
        }
//        boolean check = true;
//        if (Objects.isNull(request)) {
//            throw new ApiException("không được để trống thông tin");
//        } else {
//            if (request.getProduceName().isEmpty()) {
//                throw new ApiException("không được để trống thông tin12");
//            }
//            if (request.getColer().isEmpty()) {
//                erro += "không để trông Color\n";
//                check = false;
//            }
//            if (request.getDescription().isEmpty()) {
//                erro += "không để trông Description\n";
//                check = false;
//            }
//            if ((Math.ceil(request.getQuantity()) != Math.floor(request.getQuantity())) || request.getQuantity() < 0) {
//                erro += "Quantity phải là số nguyên dương\n";
//                check = false;
//            }
//            if (request.getSellPDrice() < request.getOriginPrice()) {
//                erro += "SellPDrice phải lớn hơn OriginPrice\n";
//                check = false;
//            }
//            Optional<SubCategoryEntity> subCategoryEntity = subCategoryRepository.findById(request.getSubcateId());
//            if (!subCategoryEntity.isPresent()) {
//                erro += "subcate_id không tồn tại trong list sub_category\n";
//                check = false;
//            }
//
//            if (check == true) {
//                Products entity = new Products();
//                if (id == null) {
//                    entity = productConver.ConverProductDTOToEntity(request);
//                    erro = "lưu thành công product";
//                } else {
//                    Optional<Products> productEntity = productRepository.findById(id);
//                    entity = productConver.ConverProductDTOToEntity(productEntity.get(), request);
//                    erro = "Update thành công product";
//                }
//                List<BrandEntity> brandEntityList1 = brandRepository.findAllById(request.getBrandId());
//                entity.setBrands(brandEntityList1);
//                entity.setSubCateId(subCategoryEntity.get());
//                entity.setStatusId(statusEntity.get());
//                productRepository.save(entity);
//            }
//    }
//        return erro;
        return null;
    }

    @Override
    public String deleteProduct(Long id) {
        Optional<Products> entity = productRepository.findById(id);
        if (!entity.isPresent()) {
            return "id không tồn tại trong product";
        } else {
            productRepository.delete(entity.get());
            return "xóa thành công";
        }
    }

    @Override
    public Page<Products> findAllProduct(Pageable pageable) {
        Page<Products> list = productRepository.findAll(pageable);
        return list;
    }
}

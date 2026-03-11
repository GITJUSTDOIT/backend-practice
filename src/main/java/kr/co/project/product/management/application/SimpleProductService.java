package kr.co.project.product.management.application;

import kr.co.project.product.management.domain.Product;
import kr.co.project.product.management.infrastructure.ListProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SimpleProductService {

    private ListProductRepository listProductRepository;

    @Autowired
    SimpleProductService (ListProductRepository listProductRepository) {
        this.listProductRepository = listProductRepository;
    }

    public Product add(Product product) {
        Product saveProduct = listProductRepository.add(product);
        return saveProduct;
    }
}

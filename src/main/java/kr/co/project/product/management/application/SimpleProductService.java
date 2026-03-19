package kr.co.project.product.management.application;

import kr.co.project.product.management.domain.Product;
import kr.co.project.product.management.infrastructure.ListProductRepository;
import kr.co.project.product.management.presentation.ProductDto;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SimpleProductService {

    private ListProductRepository listProductRepository;

    private ModelMapper modelMapper;

    @Autowired
    SimpleProductService (ListProductRepository listProductRepository, ModelMapper modelMapper) {
        this.listProductRepository = listProductRepository;
        this.modelMapper = modelMapper;
    }

    public ProductDto add(ProductDto productDto) {

        // ProductDto를 Product로 변환
        Product product = modelMapper.map(productDto, Product.class);

        // 레포지토리를 호출하는 코드
        Product savedProduct = listProductRepository.add(product);

        // Product를 ProductDto로 변환하는 코드
        ProductDto savedProductDto = modelMapper.map(savedProduct, ProductDto.class);

        return savedProductDto;
    }
}

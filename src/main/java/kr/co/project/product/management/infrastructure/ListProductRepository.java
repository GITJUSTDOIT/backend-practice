package kr.co.project.product.management.infrastructure;


import kr.co.project.product.management.domain.Product;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@Repository
public class ListProductRepository {
    //스레드 세이프한 환경을 위해서 코드를 사용하였다
    private List<Product> products = new CopyOnWriteArrayList<>();

    public Product add(Product product) {
        products.add(product);
        return product;
    }
}

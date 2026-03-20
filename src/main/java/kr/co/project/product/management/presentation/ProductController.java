package kr.co.project.product.management.presentation;

import kr.co.project.product.management.application.SimpleProductService;
import kr.co.project.product.management.domain.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    private SimpleProductService simpleProductService;

    @Autowired
    ProductController(SimpleProductService simpleProductService) {
        this.simpleProductService = simpleProductService;
    }

    @RequestMapping(value = "/products", method = RequestMethod.POST)
    public Product createProduct(@RequestBody Product product) {
        return product;
    }

    @RequestMapping(value = "products/{id}", method = RequestMethod.GET)
    public ProductDto findProductById(@PathVariable long id) {
        return simpleProductService.findById(id);
    }

    @RequestMapping(value = "/products", method = RequestMethod.GET)
    public List<ProductDto> findAllProducts() {
        return  simpleProductService.findAll();
    }

    @RequestMapping(value = "/products", method = RequestMethod.GET)
    public List<ProductDto> findProducts(
            @RequestParam(required = false) String name
    ) {
        if (null == name)
            return simpleProductService.findAll();
        return  simpleProductService.findByNameContaining(name);
    }
}

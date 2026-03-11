package kr.co.project.product.management.presentation;

<<<<<<< HEAD
import jakarta.validation.constraints.NotNull;
=======
>>>>>>> origin/main
import kr.co.project.product.management.domain.Product;

import java.util.Objects;

public class ProductDto {
    private Long id;
<<<<<<< HEAD

    @NotNull
    private String name;
    @NotNull
    private Integer price;
    @NotNull
=======
    private String name;
    private Integer price;
>>>>>>> origin/main
    private Integer amount;

    public Long getId() {
        return id;
    }

<<<<<<< HEAD

=======
>>>>>>> origin/main
    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public Integer getPrice() {
        return price;
    }

    public Integer getAmount() {
        return amount;
    }


    public Boolean sameId(Long id) {
        return this.id.equals(id);
    }

    public Boolean containsName(String name) {
        return this.name.contains(name);
    }


}

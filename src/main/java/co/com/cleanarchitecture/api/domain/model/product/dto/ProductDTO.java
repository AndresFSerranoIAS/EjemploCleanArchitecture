package co.com.cleanarchitecture.api.domain.model.product.dto;

import co.com.cleanarchitecture.api.domain.model.product.Product;
import co.com.cleanarchitecture.api.domain.model.product.ProductId;
import co.com.cleanarchitecture.api.domain.model.product.ProductName;
import co.com.cleanarchitecture.api.domain.model.product.ProductPrice;

public class ProductDTO {

    private Integer id;
    private String name;
    private Integer price;

    public ProductDTO(Integer id, String name, Integer price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getPrice() {
        return price;
    }

    public static ProductDTO fromDomain(Product product){
        return new ProductDTO(product.getId().getValue(),
                product.getName().getValue(),
                product.getPrice().getValue());
    }

    public static Product toDomain(ProductDTO productDTO){
        return new Product(new ProductId(productDTO.getId()),
                new ProductName(productDTO.getName()),
                new ProductPrice(productDTO.getPrice()));
    }
}

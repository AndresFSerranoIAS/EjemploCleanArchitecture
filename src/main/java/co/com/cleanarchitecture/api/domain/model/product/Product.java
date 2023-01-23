package co.com.cleanarchitecture.api.domain.model.product;

public class Product {

    private final ProductId id;
    private final ProductName name;
    private final ProductPrice price;

    public Product(ProductId id, ProductName name, ProductPrice price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public ProductId getId() {
        return id;
    }

    public ProductName getName() {
        return name;
    }

    public ProductPrice getPrice() {
        return price;
    }
}

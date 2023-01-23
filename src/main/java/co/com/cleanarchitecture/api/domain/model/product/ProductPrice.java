package co.com.cleanarchitecture.api.domain.model.product;

public class ProductPrice {

    private final Integer value;

    public ProductPrice(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }
}

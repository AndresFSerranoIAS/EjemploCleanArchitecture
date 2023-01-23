package co.com.cleanarchitecture.api.domain.model.product;

public class ProductId {

    private final Integer value;

    public ProductId(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }
}

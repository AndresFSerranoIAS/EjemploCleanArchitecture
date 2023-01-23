package co.com.cleanarchitecture.api.domain.model.gateways;

import co.com.cleanarchitecture.api.domain.model.product.Product;
import co.com.cleanarchitecture.api.domain.model.product.dto.ProductDTO;

public interface ProductRepository {

    public Product saveProduct(Product product);
}

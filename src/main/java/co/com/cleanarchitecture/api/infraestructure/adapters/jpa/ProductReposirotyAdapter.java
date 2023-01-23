package co.com.cleanarchitecture.api.infraestructure.adapters.jpa;

import co.com.cleanarchitecture.api.domain.model.gateways.ProductRepository;
import co.com.cleanarchitecture.api.domain.model.product.Product;
import co.com.cleanarchitecture.api.infraestructure.adapters.jpa.entity.ProductDBO;
import org.springframework.stereotype.Service;

@Service
public class ProductReposirotyAdapter implements ProductRepository {
    private final ProductAdapterRepository productAdapterRepository;

    public ProductReposirotyAdapter(ProductAdapterRepository productAdapterRepository) {
        this.productAdapterRepository = productAdapterRepository;
    }

    @Override
    public Product saveProduct(Product product) {
        return ProductDBO.toDomain(productAdapterRepository.save(ProductDBO.fromDomain(product)));
    }
}

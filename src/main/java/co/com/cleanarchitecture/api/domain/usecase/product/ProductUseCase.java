package co.com.cleanarchitecture.api.domain.usecase.product;

import co.com.cleanarchitecture.api.domain.model.gateways.ProductRepository;
import co.com.cleanarchitecture.api.domain.model.product.dto.ProductDTO;

public class ProductUseCase {
    private final ProductRepository productRepository;

    public ProductUseCase(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public ProductDTO saveProduct(ProductDTO productDTO){
        return ProductDTO.fromDomain(productRepository.saveProduct(ProductDTO.toDomain(productDTO)));
    }
}

package co.com.cleanarchitecture.api.application.configuration;

import co.com.cleanarchitecture.api.domain.model.gateways.ProductRepository;
import co.com.cleanarchitecture.api.domain.usecase.product.ProductUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UseCaseBeanConfig {

    @Bean("productService")
    public ProductUseCase productUseCase (ProductRepository productRepository){
        return new ProductUseCase(productRepository);
    }
}

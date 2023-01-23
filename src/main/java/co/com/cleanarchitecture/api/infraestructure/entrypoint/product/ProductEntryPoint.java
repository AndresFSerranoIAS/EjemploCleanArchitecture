package co.com.cleanarchitecture.api.infraestructure.entrypoint.product;

import co.com.cleanarchitecture.api.domain.model.product.dto.ProductDTO;
import co.com.cleanarchitecture.api.domain.usecase.product.ProductUseCase;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class ProductEntryPoint {

    private final ProductUseCase productUseCase;

    @PostMapping("/product/")
    public ProductDTO saveProduct(@RequestBody ProductDTO productDTO){
        return productUseCase.saveProduct(productDTO);
    }
}

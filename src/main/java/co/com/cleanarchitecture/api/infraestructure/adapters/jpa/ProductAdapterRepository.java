package co.com.cleanarchitecture.api.infraestructure.adapters.jpa;

import co.com.cleanarchitecture.api.infraestructure.adapters.jpa.entity.ProductDBO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductAdapterRepository extends JpaRepository<ProductDBO, Integer> {
}

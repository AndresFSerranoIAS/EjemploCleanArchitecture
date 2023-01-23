package co.com.cleanarchitecture.api.infraestructure.adapters.jpa.entity;

import co.com.cleanarchitecture.api.domain.model.product.Product;
import co.com.cleanarchitecture.api.domain.model.product.ProductId;
import co.com.cleanarchitecture.api.domain.model.product.ProductName;
import co.com.cleanarchitecture.api.domain.model.product.ProductPrice;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "products")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductDBO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private Integer price;


    public static Product toDomain(ProductDBO productDBO){
        return new Product(new ProductId(productDBO.id),
                new ProductName(productDBO.name),
                new ProductPrice(productDBO.price));
    }

    public static ProductDBO fromDomain(Product product){
        return new ProductDBO(product.getId().getValue(),
                product.getName().getValue(),
                product.getPrice().getValue());
    }
}

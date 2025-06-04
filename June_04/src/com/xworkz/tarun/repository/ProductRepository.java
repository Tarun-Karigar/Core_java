package repository;

import com.xworkz.tarun.dto.ProductDto;

public interface ProductRepository {
    boolean persist(ProductDto productDto);
}
package repository;

import com.xworkz.tarun.dto.ProductDto;

public class ProductRepositoryImpl implements repository.ProductRepository {
    public ProductRepositoryImpl() {
        System.out.println("Constructor created");
    }

    @Override
    public boolean persist(ProductDto productDto) {
        if (productDto != null) {
            System.out.println("The details saved successfully");
        } else {
            System.err.println("The details not saved successfully");
        }
        System.out.println("Successfully running in repo");
        return true;
    }
}
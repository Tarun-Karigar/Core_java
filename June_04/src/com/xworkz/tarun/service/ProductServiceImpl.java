package com.xworkz.tarun.service;

import com.xworkz.tarun.dto.ProductDto;
import com.xworkz.tarun.exception.*;
import repository.ProductRepository;
import repository.ProductRepositoryImpl;

public class ProductServiceImpl implements ProductService {

    @Override
    public boolean save(ProductDto productDto) {
        if (productDto == null) {
            System.out.println("DTO is null");
        }

        String productId = productDto.getProductId();
        if (productId == null || !productId.matches("\\d+") || Integer.parseInt(productId) <= 0) {
            throw new ProductId("Product ID must be a positive integer.");
        }

        String productName = productDto.getProductName();
        if (productName == null || productName.trim().isEmpty() || productName.length() < 3 || productName.length() > 50) {
            throw new ProductName("Product name must be between 3 and 50 characters.");
        }

        double price = productDto.getPrice();
        if (price <= 0 || price > 100000) {
            throw new ProductPrice("Price must be greater than 0 and not exceed 100,000.");
        }

        String category = productDto.getCategory();
        if (category == null || !(category.equalsIgnoreCase("Electronics") || category.equalsIgnoreCase("Clothing")
                || category.equalsIgnoreCase("Books") || category.equalsIgnoreCase("Home"))) {
            throw new ProductCategory("Category must be one of: Electronics, Clothing, Books, Home.");
        }

        int quantity = productDto.getQuantity();
        if (quantity < 0 || quantity > 5000) {
            throw new ProductQuantity("Quantity must be between 0 and 5000.");
        }

        System.out.println("Product is valid and ready to save.");
        ProductRepository productRepository = new ProductRepositoryImpl();
        boolean saved = productRepository.persist(productDto);

        System.out.println("Executed save method");
        return saved;
    }
}
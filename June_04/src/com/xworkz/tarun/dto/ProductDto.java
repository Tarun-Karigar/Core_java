package com.xworkz.tarun.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductDto {
    private String productId;
    private String productName;
    private double price;
    private String category;
    private int quantity;
}
package com.xworkz.tarun.service;

import com.xworkz.tarun.dto.Clothdto;

public class ClothingServiceImpl implements ClothingService {

    @Override
    public boolean save(Clothdto clothDto) {
        if (clothDto != null) {
            System.out.println("DTO is not null");

            String name = clothDto.getName();
            if (name != null && name.length() > 2 && name.length() < 21) {
                System.out.println("Valid Name");
            } else {
                System.err.println("Invalid Name");
                return false;
            }

            String type = clothDto.getType();
            if (type != null && type.length() > 2 && type.length() < 21) {
                System.out.println("Valid Type");
            } else {
                System.err.println("Invalid Type");
                return false;
            }

            double incomingPrice = clothDto.getIncomingPrice();
            if (incomingPrice > 1 && incomingPrice < 100) {
                System.out.println("Valid Incoming Price");
            } else {
                System.err.println("Invalid Incoming Price");
                return false;
            }

            double sellingPrice = clothDto.getSellingPrice();
            if (sellingPrice > 1 && sellingPrice < 100) {
                System.out.println("Valid Selling Price");
            } else {
                System.err.println("Invalid Selling Price");
                return false;
            }

            double mrp = clothDto.getMrp();
            if (mrp > 1 && mrp < 100) {
                System.out.println("Valid MRP");
            } else {
                System.err.println("Invalid MRP");
                return false;
            }

            String description = clothDto.getDescription();
            if (description != null && description.length() > 2 && description.length() < 21) {
                System.out.println("Valid Description");
            } else {
                System.err.println("Invalid Description");
                return false;
            }

            String brand = clothDto.getBrand();
            if (brand != null && brand.length() > 2 && brand.length() < 21) {
                System.out.println("Valid Brand");
            } else {
                System.err.println("Invalid Brand");
                return false;
            }

            int quantity = clothDto.getQuantity();
            if (quantity > 1 && quantity < 100) {
                System.out.println("Valid Quantity");
            } else {
                System.err.println("Invalid Quantity");
                return false;
            }

            String color = clothDto.getColor();
            if (color != null && color.length() > 2 && color.length() < 21) {
                System.out.println("Valid Color");
            } else {
                System.err.println("Invalid Color");
                return false;
            }

            double weight = clothDto.getWeight();
            if (weight > 0 && weight < 500) {
                System.out.println("Valid Weight");
            } else {
                System.err.println("Invalid Weight");
                return false;
            }


            String manufDate = clothDto.getManufDate();
            if (manufDate != null && manufDate.length() > 2 && manufDate.length() < 21) {
                System.out.println("Valid Manufacture Date");
            } else {
                System.err.println("Invalid Manufacture Date");
                return false;
            }

            String warranty = clothDto.getWarranty();
            if (warranty != null && warranty.length() > 2 && warranty.length() < 21) {
                System.out.println("Valid Warranty");
            } else {
                System.err.println("Invalid Warranty");
                return false;
            }

            boolean returnPolicy = clothDto.isReturnPolicy();
            System.out.println("Return Policy: " + returnPolicy);

        } else {
            System.err.println("DTO is null");
            return false;
        }

        System.out.println("Executed save method");
        return true;
    }
}

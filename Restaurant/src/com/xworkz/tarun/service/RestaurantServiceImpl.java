package com.xworkz.tarun.service;

import com.xworkz.tarun.dto.RestaurantDto;
import com.xworkz.tarun.exception.*;

import java.time.LocalTime;

public class RestaurantServiceImpl implements RestaurantService {
    @Override
        if (restaurantDto == null) {
            System.out.println("DTO is null");
            return false;
        }


        String name = restaurantDto.getName();
        if (name == null || name.trim().isEmpty()) {
        } else if (name.length() <= 3) {
        } else if (name.length() > 25) {
        } else if (Character.isDigit(name.charAt(0))) {
        } else {
            System.out.println("Name is valid: " + name);
        }


        float rating = restaurantDto.getRating();
        if (rating <= 3) {
        } else {
            System.out.println("Valid rating: " + rating);
        }


        LocalTime openingTime = LocalTime.from(LocalTime.from(restaurantDto.getOpeningTime()));
        if (openingTime == null) {
        } else if (openingTime.isBefore(LocalTime.of(21, 0)) || openingTime.isAfter(LocalTime.of(23, 59))) {
        } else {
            System.out.println("Valid opening time: " + openingTime);
        }


        LocalTime closingTime = restaurantDto.getClosingTime();
        if (closingTime == null) {
        } else if (!closingTime.equals(LocalTime.MIDNIGHT)) {
        } else {
            System.out.println("Valid closing time: " + closingTime);
        }

        String[] foodMenu = restaurantDto.getFoodMenu();
        if (foodMenu == null) {
        } else if (foodMenu.length != 5) {
        } else {
            System.out.println("Valid food menu with 5 items");
        }

        return true;
    }
}

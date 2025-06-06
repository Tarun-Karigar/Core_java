package com.xworkz.tarun.service;

import com.xworkz.tarun.dto.RestaurantDto;
import com.xworkz.tarun.exception.*;

import java.time.LocalTime;

public class RestaurantServiceImpl implements RestaurantService {
    @Override
    public boolean save(RestaurantDto restaurantDto) throws NameException, RatingException, OpeningTimeException, ClosingTimeException, FoodMenuException {
        if (restaurantDto == null) {
            System.out.println("DTO is null");
            return false;
        }


        String name = restaurantDto.getName();
        if (name == null || name.trim().isEmpty()) {
            throw new NameException("Name should not be null or empty");
        } else if (name.length() <= 3) {
            throw new NameException("The length of the name should be more than 3 characters");
        } else if (name.length() > 25) {
            throw new NameException("The length of the name should not exceed 25 characters");
        } else if (Character.isDigit(name.charAt(0))) {
            throw new NameException("Name should not start with a number");
        } else {
            System.out.println("Name is valid: " + name);
        }


        float rating = restaurantDto.getRating();
        if (rating <= 3) {
            throw new RatingException("Rating should be greater than 3");
        } else {
            System.out.println("Valid rating: " + rating);
        }


        LocalTime openingTime = LocalTime.from(LocalTime.from(restaurantDto.getOpeningTime()));
        if (openingTime == null) {
            throw new OpeningTimeException("Opening time should not be null");
        } else if (openingTime.isBefore(LocalTime.of(21, 0)) || openingTime.isAfter(LocalTime.of(23, 59))) {
            throw new OpeningTimeException("Opening time should be between 9:00 PM and 11:59 PM");
        } else {
            System.out.println("Valid opening time: " + openingTime);
        }


        LocalTime closingTime = restaurantDto.getClosingTime();
        if (closingTime == null) {
            throw new ClosingTimeException("Closing time should not be null");
        } else if (!closingTime.equals(LocalTime.MIDNIGHT)) {
            throw new ClosingTimeException("Closing time must be exactly at 12:00 AM (midnight)");
        } else {
            System.out.println("Valid closing time: " + closingTime);
        }

        String[] foodMenu = restaurantDto.getFoodMenu();
        if (foodMenu == null) {
            throw new FoodMenuException("Food menu should not be null");
        } else if (foodMenu.length != 5) {
            throw new FoodMenuException("Food menu must contain exactly 5 items");
        } else {
            System.out.println("Valid food menu with 5 items");
        }

        return true;
    }
}

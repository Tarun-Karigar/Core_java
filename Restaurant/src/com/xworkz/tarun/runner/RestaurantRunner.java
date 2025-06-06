package com.xworkz.tarun.runner;

import com.xworkz.tarun.dto.RestaurantDto;
import com.xworkz.tarun.exception.*;
import com.xworkz.tarun.service.RestaurantService;
import com.xworkz.tarun.service.RestaurantServiceImpl;

import java.time.LocalDate;
import java.time.LocalTime;

public class RestaurantRunner {
    public static void main(String[] args) {
        RestaurantDto dto = new RestaurantDto();

        dto.setName("DharwadHotel");
        dto.setLocation("Hubli");
        dto.setContactDetails("1234567890");
        dto.setEmail("tandoori@food.com");
        dto.setRating(4.5f);
        dto.setFoodMenu(new String[]{"Biryani", "Paneer", "Roti", "Dal", "Sweet"});
        dto.setFoodType("Veg");

        dto.setOpeningTime(LocalTime.of(21, 15));
        dto.setClosingTime(LocalTime.of(0,0));

        dto.setBokeddate(LocalDate.now());
        dto.setBookedTime(LocalTime.now());
`
        RestaurantService service = new RestaurantServiceImpl();

        try {
            boolean valid = service.save(dto);
            if (valid) {
                System.out.println(" Restaurant DTO is valid and saved successfully.");
            }
        } catch (Exception e) {
            System.err.println(" Validation failed: " + e.getMessage());
        }
    }
}

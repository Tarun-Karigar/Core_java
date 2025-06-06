package com.xworkz.tarun.dto;
import java.time.LocalDate;
import java.time.LocalTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import java.time.LocalTime;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RestaurantDto {
    private String name;
    private String location;
    private String contactDetails;
    private String email;
    private float  rating;
    private String foodMenu[];
    private String foodType;
    private LocalTime openingTime;
    private LocalTime closingTime;
    private LocalDate bokeddate;
    private LocalTime bookedTime;


}

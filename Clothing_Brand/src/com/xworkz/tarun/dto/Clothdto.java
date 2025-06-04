package com.xworkz.tarun.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Clothdto {
    private String name;
    private String type;
    private double incomingPrice;
    private double sellingPrice;
    private double mrp;
    private String description;
    private String brand;
    private int quantity;          // changed to int
    private String color;
    private double weight;
    private String manufDate;
    private String warranty;
    private boolean returnPolicy;

}

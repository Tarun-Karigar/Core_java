package com.xworkz.tarun.dto;

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

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setIncomingPrice(double incomingPrice) {
        this.incomingPrice = incomingPrice;
    }

    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public void setMrp(double mrp) {
        this.mrp = mrp;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setQuantity(int quantity) {   // changed parameter type to int
        this.quantity = quantity;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setManufDate(String manufDate) {
        this.manufDate = manufDate;
    }

    public void setWarranty(String warranty) {
        this.warranty = warranty;
    }

    public void setReturnPolicy(boolean returnPolicy) {
        this.returnPolicy = returnPolicy;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public double getIncomingPrice() {
        return incomingPrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public double getMrp() {
        return mrp;
    }

    public String getDescription() {
        return description;
    }

    public String getBrand() {
        return brand;
    }

    public int getQuantity() {    // now returns int
        return quantity;
    }

    public String getColor() {
        return color;
    }

    public double getWeight() {
        return weight;
    }

    public String getManufDate() {
        return manufDate;
    }

    public String getWarranty() {
        return warranty;
    }

    public boolean isReturnPolicy() {
        return returnPolicy;
    }

    @Override
    public String toString() {
        return "Clothdto{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", incomingPrice=" + incomingPrice +
                ", sellingPrice=" + sellingPrice +
                ", mrp=" + mrp +
                ", description='" + description + '\'' +
                ", brand='" + brand + '\'' +
                ", quantity=" + quantity +
                ", color='" + color + '\'' +
                ", weight='" + weight + '\'' +
                ", manufDate='" + manufDate + '\'' +
                ", warranty='" + warranty + '\'' +
                ", returnPolicy=" + returnPolicy +
                '}';
    }
}

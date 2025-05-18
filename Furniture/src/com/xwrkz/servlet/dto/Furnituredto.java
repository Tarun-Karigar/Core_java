package com.xwrkz.servlet.dto;


public class Furnituredto {
    private String brand;
    private String material;
    private String size;
    private String model_Name;
    private String product_Benefits;

    public void setBenefits(String Product_Benefits) {
        this.product_Benefits = product_Benefits;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setModel(String model_Name) {
        this.model_Name = model_Name;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getBenefits()
    {
        return product_Benefits;
    }

    public String getBrand() {
        return brand;
    }

    public String getMaterial() {
        return material;
    }

    public String getModel() {

        return model_Name;
    }

    public String getSize() {

        return size;
    }

    @Override
    public String toString() {
        return "FurnitureDto{" +
                "brand='" + brand + '\'' +
                ", material='" + material + '\'' +
                ", size='" + size + '\'' +
                ", model='" + model_Name + '\'' +
                ", benefits='" + product_Benefits + '\'' +
                '}';
    }
}
package models;

import Bridge.CarPurpose;

public class Car {
    private String brand;
    private double price;
    private CarPurpose purpose;
    private int year;
    public String model;
    public String color;
    public String engineType;

    public String getPurpose1() {
        return purpose1;
    }

    public void setPurpose1(String purpose1) {
        this.purpose1 = purpose1;
    }

    public String type;
    private String purpose1;

    public Car(String brand, double price, String purpose, int year) {
        this.brand = brand;
        this.price = price;
        this.purpose1=purpose;
        this.year = year;
    }

    public Car(){}

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public CarPurpose getPurpose() {
        return purpose;
    }

    public void setPurpose(CarPurpose purpose) {
        this.purpose = purpose;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", purpose='" + purpose1 + '\'' +
                ", year=" + year +
                '}';
    }

    public void displayDetails(){}


}



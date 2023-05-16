package com.liuliang.reflect;

/**
 * <p>Description: </p>
 *
 * @author <a href="mail to: lliang@outlook.com" rel="nofollow">liu liang</a>
 * @version v1.0, 2023/5/13 - 20:23
 */
public class Car {
    private String brand;
    private int seats;
    private String color;

    public Car() {
    }

    public Car(String brand, int seats, String color) {
        this.brand = brand;
        this.seats = seats;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    private void run() {
        System.out.println("Car run...");
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", seats=" + seats +
                ", color='" + color + '\'' +
                '}';
    }
}

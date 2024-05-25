package com.mirea.kt.mylistofcars;

import androidx.annotation.NonNull;

public class Car {
    private String brand;
    private String number;
    private int year;

    public Car(String brand, String number, int year){
        this.brand = brand;
        this.number = number;
        this.year = year;
    }

    @NonNull
    @Override
    public String toString() {
        return "Car{" + "brand='" + brand + '\'' + ", number='" + number + '\'' + ", year=" + year + '}';
    }

    public String getBrand()
    {
        return brand;
    }

    public String getNumber()
    {
        return number;
    }

    public int getYear()
    {
        return year;
    }

}

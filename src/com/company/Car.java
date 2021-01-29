package com.company;

import java.net.PortUnreachableException;
import java.time.Year;

public class Car {
    private String logo;
    private String model;
    private int year;
    private int wheels;
    private CountryOfOrigin countryOfOrigin;
    private CarBody carBody;


    public Car(String logo, String model, int year, int wheels, CarBody carBody) {
        this.logo = logo;
        this.model = model;
        this.year = year;
        this.wheels = wheels;
        this.carBody = carBody;
    }

    public CarBody getCarBody() {
        return carBody;
    }

    public void setCarBody(CarBody carBody) {
        this.carBody = carBody;
    }

    public CountryOfOrigin getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public String getLogo() {
        return logo;
    }
    public int getWheels() {
        return wheels;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }


}

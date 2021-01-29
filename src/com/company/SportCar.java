package com.company;

public final class SportCar extends LKW{
    private int acceleration;
    private int maxSpeed;
    private CarBody carBody;


    public SportCar(String logo, String model, int year, int wheels, int volume,
                    String suspension, CarBody carBody, int acceleration, int maxSpeed) {
        super(logo, model, year, wheels, volume, suspension, carBody);
        this.acceleration = acceleration;
        this.maxSpeed = maxSpeed;
        this.carBody = carBody;
    }


    public int getAcceleration() {
        return acceleration;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }
    public String getInfo(){
        return "Logo: " + getLogo() + "; Model: " + getModel() + "; Year: " + getYear() +
                "; Wheels: " + getWheels() + "; Volume: " + getVolume() +
                "; Suspension: " + getSuspension() + "; CarBody: " + carBody +
                "; Acceleration: " + getAcceleration() + "M/S" + "; MaxSpeed: " + getMaxSpeed() +
                "Km/h";
    }
    public String getInfo1(){
        return "Logo: " + getLogo() + "; Model: " + getModel() + "; Year: " + getYear() +
                "; Wheels: " + getWheels() + "; Volume: " + getVolume() +
                "; Suspension: " + getSuspension() + "; CarBody: " + carBody +
                "; MaxSpeed: " + getMaxSpeed() +
                "Km/h";
    }

}

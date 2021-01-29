package com.company;

public class LKW extends Car{
    private int volume;
    private String suspension;

    public LKW(String logo, String model, int year, int wheels,
                int volume, String suspension,CarBody carBody) {
        super(logo, model, year, wheels, carBody);
        this.volume = volume;
        this.suspension = suspension;
    }

    public String getSuspension() {
        return suspension;
    }

    public int getVolume() {
        return volume;
    }
    public void horsePower(int num, String horsePower){
        for (int i = 0; i < num; i++) {
            System.out.println(horsePower);

        }
    }
    public final void horsePower(String horsePower, int num){
        for (int i = 0; i < num; i++) {
            System.out.println(horsePower);

        }
    }

    public String getInfo(){
        return "Logo: " + getLogo() + "; Model: " + getModel() + "; Year: " + getYear() +
                "; Wheels: " + getWheels() + "; Volume: " + getVolume() +
                "; Suspension: " + getSuspension() + "; CarBody: " + getCarBody() + "; Country: " +
               getCountryOfOrigin().getCountry() + "; Company: " +
                getCountryOfOrigin().getCompany();
    }

}

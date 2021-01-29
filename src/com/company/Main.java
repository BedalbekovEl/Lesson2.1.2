package com.company;

public class Main {

    public static void main(String[] args) {


        CountryOfOrigin countryOfOrigin = new CountryOfOrigin("Germany ","Mercedes");
        LKW lkw = new LKW("Mercedes","GellendWagen",2008, 6,
                5,"Multi-Link",CarBody.PICKUP);
        System.out.println(lkw.getInfo());
        lkw.horsePower(1, "700 HP");

        CountryOfOrigin countryOfOrigin1 = new CountryOfOrigin("USA", "Tesla");
        SportCar sportCar = new SportCar("Tesla", "Model S", 2018, 4, 5,
                "Multi-link", CarBody.SEDAN, 2, 325);
        System.out.println(sportCar.getInfo() + "; Country: " + countryOfOrigin1.getCountry() +
                "; Company: " + countryOfOrigin1.getCompany());
        sportCar.horsePower("450 HP",1);

        CountryOfOrigin countryOfOrigin2 = new CountryOfOrigin("Italy", "Lamborgini");
        SportCar sportCar1 = new SportCar("Lamborgini", "Sesto Elemento", 2010,
                4, 5, "Multi-Link", CarBody.KUPE, 3, 400);
        System.out.println(sportCar1.getInfo1() + "; Country: " + countryOfOrigin2.getCountry() +
                "; Company: " + countryOfOrigin2.getCompany());
        sportCar.horsePower("562 HP",1);




    }
}

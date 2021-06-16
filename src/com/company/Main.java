package com.company;

public class Main {

    public static void main(String[] args) {

        Garage garage1 = new Garage();
        Garage garage2 = new Garage();

        Car car1 = new Car("Porsche 935");
        Car car2 = new Car("Porsche 911 GT2");
        Car car3 = new Car("Porsche 911 GT1");

        Motorcycle motorcycle1 = new Motorcycle("Ducati Panigale V4");
        Motorcycle motorcycle2 = new Motorcycle("BMW S1000RR");
        Motorcycle motorcycle3 = new Motorcycle("Honda CBR1000RR-R Fireblade SP");

        garage1.addToGarage(car1);
        garage1.addToGarage(car2);
        garage1.addToGarage(car3);

        garage2.addToGarage(motorcycle1);
        garage2.addToGarage(motorcycle2);
        garage2.addToGarage(motorcycle3);

        garage1.showGarage();
        System.out.println();
        garage2.showGarage();


    }

}

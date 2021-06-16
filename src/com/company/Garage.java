package com.company;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Garage {

    List<Vehicle> garage = new ArrayList<>();

    public void addToGarage (Vehicle vehicle) {

        garage.add(vehicle);

    };

    public void showGarage () {

        Iterator iter = garage.iterator();
        Vehicle token;

        while (iter.hasNext()) {
            token = (Vehicle) iter.next();
            System.out.println(token.toString());
        };

    }



}

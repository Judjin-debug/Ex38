package com.company;

public class Car extends Vehicle {

     public Car (String name) {
         super(name);
     };

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                '}';
    }
}

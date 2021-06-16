package com.company;

abstract class Vehicle {

    String name;

    public Vehicle (String name) {
        this.name = name;
    };

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                '}';
    };

}

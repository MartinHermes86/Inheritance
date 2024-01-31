package com.github.martinhermes86;

/*
Create a new Java project and implement the following steps to practice inheritance and classes in Java.

Step 1: Create a base class "Vehicle" with properties like "Manufacturer", "Model", and "Year of Manufacture".
Step 2: Create a derived class "Car" that inherits from "Vehicle" and has additional properties like "Number of Doors".
Step 3: Implement a method in the "Vehicle" class that outputs information about the vehicle.
Step 4: Override the method from step 3 in the "Car" class to also output the number of doors.
Step 5: Create instances of the "Vehicle" and "Car" classes and call the methods to output the information.
Please post the link to your GitHub repo here, where you have solved this task together.

Create another derived class from "Vehicle" called "Motorcycle". Add appropriate properties to this class.
Implement a method in the "Motorcycle" class that returns the type of motorcycle (e.g. Chopper, Sportbike, Cruiser).
Create instances of both "Car" and "Motorcycle" and call the methods to output the information.
Discuss together how inheritance was applied in this scenario and what advantages it offers.
 */

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle("Fendt", "211 Vario", 2015);
        System.out.println(vehicle1);

        Car car1 = new Car("Opel", "Corsa", 2001, 3);
        System.out.println(car1);

        Motorcycle motorcycle1 = new Motorcycle("BMW", "R 18", 2020, false,"Cruiser");
        System.out.println(motorcycle1);
    }
}
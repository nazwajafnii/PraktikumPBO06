/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inherintance;

/**
 *
 * @author Nazwajafni
 */
class Vehicle {
    String brand;
    Vehicle(String brand) {
        this.brand = brand;
    }

    void start() {
        System.out.println("vehicle starts");
    }
}

class Car extends Vehicle {
    Car(String brand) {
        super(brand);
    }

    @Override
    void start() {
        System.out.println(brand + " Car starts");
    }
}

class Motorcycle extends Vehicle {
    Motorcycle(String brand) {
        super(brand);
    }

    @Override
    void start() {
        System.out.println(brand + " Motorcycle starts");
    }
}

public class MainKendaraan {
    public static void main(String[] args) {
        Vehicle[] garage = {
            new Car("Toyota"),
            new Motorcycle("Yamaha"),
            new Car("BMW"),
            new Motorcycle("Honda")
        };

        for (Vehicle v : garage) {
            v.start(); 
        }
    }
}

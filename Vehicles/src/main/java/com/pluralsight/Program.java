package com.pluralsight;

public class Program {
    public static void main(String[] args) {
        Moped slowRide = new Moped("red", 2, 0, 0, 0, 0, 0, 0, 0, 10);
        Car sedanCar = new Car("blue", 4, 0, 0, 0, 0, 0, 0, 0, 100);
        SemiTruck bigTruck = new SemiTruck("green", 2, 0, 0, 0, 0, 0, 0, 0, 10000);
        Hovercraft hoverCraft = new Hovercraft("yellow", 2, 0, 0, 0, 0, 0, 0, 0, 10000);

        System.out.println("Vehicle Details:");
        System.out.println("Moped Color: " + slowRide.getColor());
        System.out.println("Car Color: " + sedanCar.getColor());
        System.out.println("Truck Color: " + bigTruck.getColor());
        System.out.println("Hovercraft Color: " + hoverCraft.getColor());
    }
}


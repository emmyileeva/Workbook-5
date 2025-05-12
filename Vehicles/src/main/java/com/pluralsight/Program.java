package com.pluralsight;

public class Program {
    public static void main(String[] args) {
        Moped slowRide = new Moped();
        slowRide.setColor("Red");
        slowRide.setFuelCapacity(5);
        slowRide.setCargoCapacity(15);
        slowRide.setNumberOfPassengers(1);

        Car dailyDriver = new Car();
        dailyDriver.setColor("Blue");
        dailyDriver.setFuelCapacity(12);
        dailyDriver.setCargoCapacity(25);
        dailyDriver.setNumberOfPassengers(4);

        SemiTruck bigRig = new SemiTruck();
        bigRig.setColor("Black");
        bigRig.setFuelCapacity(100);
        bigRig.setCargoCapacity(1000);
        bigRig.setNumberOfPassengers(2);

        Hovercraft hover = new Hovercraft();
        hover.setColor("Green");
        hover.setFuelCapacity(50);
        hover.setCargoCapacity(200);
        hover.setNumberOfPassengers(6);

        System.out.println("Vehicle Details:");
        System.out.println("Moped: " + slowRide.getColor() + ", Fuel Capacity: " + slowRide.getFuelCapacity() + ", Cargo Capacity: " + slowRide.getCargoCapacity() + ", Passengers: " + slowRide.getNumberOfPassengers());
        System.out.println("Car: " + dailyDriver.getColor() + ", Fuel Capacity: " + dailyDriver.getFuelCapacity() + ", Cargo Capacity: " + dailyDriver.getCargoCapacity() + ", Passengers: " + dailyDriver.getNumberOfPassengers());
        System.out.println("SemiTruck: " + bigRig.getColor() + ", Fuel Capacity: " + bigRig.getFuelCapacity() + ", Cargo Capacity: " + bigRig.getCargoCapacity() + ", Passengers: " + bigRig.getNumberOfPassengers());
        System.out.println("Hovercraft: " + hover.getColor() + ", Fuel Capacity: " + hover.getFuelCapacity() + ", Cargo Capacity: " + hover.getCargoCapacity() + ", Passengers: " + hover.getNumberOfPassengers());
    }
}


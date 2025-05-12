package com.pluralsight;

public class Program {
    public static void main(String[] args) {
        Moped slowRide = new Moped();
        slowRide.setColor("Red");
        slowRide.setFuelCapacity(5);
        slowRide.setCargoCapacity(15);
        slowRide.setNumberOfPassengers(1);
        slowRide.setCurrentSpeed(0);
        slowRide.setAcceleration(5);
        slowRide.setBrakingPower(2);
        slowRide.setTurningRadius(2);
        slowRide.setWeight(200);
        slowRide.setMaxSpeed(30);

        Car dailyDriver = new Car();
        dailyDriver.setColor("Blue");
        dailyDriver.setFuelCapacity(12);
        dailyDriver.setCargoCapacity(25);
        dailyDriver.setNumberOfPassengers(4);
        dailyDriver.setCurrentSpeed(0);
        dailyDriver.setAcceleration(10);
        dailyDriver.setBrakingPower(5);
        dailyDriver.setTurningRadius(5);
        dailyDriver.setWeight(1500);
        dailyDriver.setMaxSpeed(120);

        SemiTruck bigRig = new SemiTruck();
        bigRig.setColor("Black");
        bigRig.setFuelCapacity(100);
        bigRig.setCargoCapacity(1000);
        bigRig.setNumberOfPassengers(2);
        bigRig.setCurrentSpeed(0);
        bigRig.setAcceleration(5);
        bigRig.setBrakingPower(10);
        bigRig.setTurningRadius(20);
        bigRig.setWeight(8000);
        bigRig.setMaxSpeed(80);

        Hovercraft hover = new Hovercraft();
        hover.setColor("Green");
        hover.setFuelCapacity(50);
        hover.setCargoCapacity(200);
        hover.setNumberOfPassengers(6);
        hover.setCurrentSpeed(0);
        hover.setAcceleration(15);
        hover.setBrakingPower(8);
        hover.setTurningRadius(10);
        hover.setWeight(3000);
        hover.setMaxSpeed(60);

        System.out.println("Moped Color: " + slowRide.getColor());
        System.out.println("Car Color: " + dailyDriver.getColor());
        System.out.println("SemiTruck Color: " + bigRig.getColor());
        System.out.println("Hovercraft Color: " + hover.getColor());
    }
}


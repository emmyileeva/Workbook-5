package com.pluralsight;

import java.time.LocalDate;

public class Vehicle extends Asset {
    private String makeModel;
    private int year;
    private int odometer;

    public Vehicle(String description, String dateAcquired, double originalCost, String makeModel, int year, int odometer) {
        super(description, dateAcquired, originalCost);
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    @Override
    public double getValue() {
        // Calculate the age of the vehicle
        int currentYear = LocalDate.now().getYear();
        int age = currentYear - year;
        double depreciationRate;

        // Calculate depreciation based on the age of the vehicle
        // if the vehicle is less than or equal to 3 years old, it depreciates at 3% per year
        // if the vehicle is between 4 and 6 years old, it depreciates at 6% per year
        // if the vehicle is between 7 and 10 years old, it depreciates at 8% per year
        // if the vehicle is older than 10 years, it has a fixed value of $1000
        if (age <= 3) {
            depreciationRate = getOriginalCost() * Math.pow(0.97, age);
        } else if (age <= 6) {
            depreciationRate = getOriginalCost() * Math.pow(0.94, age - 3) * Math.pow(0.97, 3);
        } else if (age <= 10) {
            depreciationRate = getOriginalCost() * Math.pow(0.92, age - 6) * Math.pow(0.94, 3) * Math.pow(0.97, 3);
        } else {
            depreciationRate = 1000;
        }
        if (odometer > 100000 && !(makeModel.toLowerCase().contains("honda") || makeModel.toLowerCase().contains("toyota"))) {
            depreciationRate *= 0.75;
        }
        return depreciationRate;
    }
}

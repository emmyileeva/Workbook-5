package com.pluralsight;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Asset> assets = new ArrayList<>();

//        Asset myAsset = new Asset("My Asset", "2023-01-01", 1000);

        assets.add(new House("My House", "2023-01-01", 300000, "123 Main St", 1, 2000, 5000));
        assets.add(new House("My Vacation House", "2023-02-01", 250000, "456 Elm St", 2, 1500, 3000));

        assets.add(new Vehicle("Emmy's car", "2018-03-01", 40000, "Audi A4", 2017, 45000));
        assets.add(new Vehicle("John's truck", "2020-04-01", 30000, "Ford F-150", 2018, 80000));

        for (Asset asset : assets) {
            System.out.println("====================================");
            System.out.println("Description: " + asset.getDescription());
            System.out.println("Date Acquired: " + asset.getDateAcquired());
            System.out.println("Original Cost: " + asset.getOriginalCost());
            System.out.println("Current Value: " + asset.getValue());
            System.out.println("------------------------------------");

            if (asset instanceof House) {
                House house = (House) asset;
                System.out.println("Address: " + house.getAddress());
                System.out.println("Condition: " + house.getCondition());
                System.out.println("Square Footage: " + house.getSquareFoot());
                System.out.println("Lot Size: " + house.getLotSize());
            } else if (asset instanceof Vehicle) {
                Vehicle vehicle = (Vehicle) asset;
                System.out.println("Make/Model: " + vehicle.getMakeModel());
                System.out.println("Year: " + vehicle.getYear());
                System.out.println("Odometer: " + vehicle.getOdometer());
            }
            System.out.println("====================================\n");
        }
    }
}
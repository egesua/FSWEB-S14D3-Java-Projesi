package com.workintech.Companies.RDCompany;

public class Factory {
    public static void main(String[] args) {
        CarSkeleton electricCar = new ElectricCar("Tesla", "Electrical Car", 100 ,4);
        CarSkeleton hybridCar = new HybridCar("TEST", "test", 0.08, 100,4);
    }
}

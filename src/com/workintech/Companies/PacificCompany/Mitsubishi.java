package com.workintech.Companies.PacificCompany;

public class Mitsubishi extends Car {

    private int justMitsubishi;
    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        super.startEngine();
        return getName() + " engine is starting";
    }

    @Override
    public String accelerate() {
        super.accelerate();
        return getName() + " car is accelerating";
    }

    @Override
    public String brake() {
        super.brake();
        return getName() + " car is braking.";
    }
}

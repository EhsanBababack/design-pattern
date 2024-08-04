package org.example;

public class LandCruiser extends SUVCar {
    private String name;

    public LandCruiser(String name) {
        this.name = name;
    }

    @Override
    public String getSUVName() {
        return name;
    }

    @Override
    public String getSUVFeatures() {
        return "LandCruiser Features";
    }
}

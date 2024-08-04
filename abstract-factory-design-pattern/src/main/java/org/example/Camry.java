package org.example;

public class Camry extends SedanCar {
    private String name;

    public Camry(String name) {
        this.name = name;
    }


    @Override
    public String getSedanName() {
        return name;
    }

    @Override
    public String getSedanFeatures() {
        return "Camry Features";
    }
}

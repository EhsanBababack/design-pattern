package org.example;

public class S300 extends SedanCar {
    private String name;

    public S300(String name) {
        this.name = name;
    }


    @Override
    public String getSedanName() {
        return name;
    }

    @Override
    public String getSedanFeatures() {
        return "Features S300";
    }
}

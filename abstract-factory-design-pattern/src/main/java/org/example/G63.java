package org.example;

public class G63 extends SUVCar{
    private String name;

    public G63(String name) {
        this.name = name;
    }

    @Override
    public String getSUVName() {
        return "G63";
    }

    @Override
    public String getSUVFeatures() {
        return "Feature G63";
    }
}

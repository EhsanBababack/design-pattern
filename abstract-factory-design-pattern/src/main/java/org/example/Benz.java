package org.example;

public class Benz extends VehicleFactory {
    public SUVCar getSUVCar() {
        return new G63("G63");
    }

    public SedanCar getSedanCar() {
        return new S300("S300");
    }
}

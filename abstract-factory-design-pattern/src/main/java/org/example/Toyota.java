package org.example;

public class Toyota extends VehicleFactory {
    public SUVCar getSUVCar() {
        return new LandCruiser("LandCruiser");
    }

    public SedanCar getSedanCar() {
        return new Camry("Camry");
    }
}

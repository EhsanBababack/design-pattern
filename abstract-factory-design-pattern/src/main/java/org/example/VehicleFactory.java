package org.example;

public abstract class VehicleFactory {
    public static final String LUXURY_VEHICLE = "Luxury";
    public static final String NON_LUXURY_VEHICLE = "Non-Luxury";

    public abstract SUVCar getSUVCar();

    public abstract SedanCar getSedanCar();

    public static VehicleFactory getVehicleFactory(String type) {
        if (type.equals(VehicleFactory.LUXURY_VEHICLE)) {
            return new Benz();
        }
        if (type.equals(VehicleFactory.NON_LUXURY_VEHICLE)) {
            return new Toyota();
        }
        return new Toyota();
    }
}

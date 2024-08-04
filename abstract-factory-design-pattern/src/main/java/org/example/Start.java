package org.example;

import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("please enter type of brand");
        String vhCategoryFromUser = scanner.next();
        String vhCategory = null;
        if (vhCategoryFromUser.equals("benz")) {
            vhCategory = VehicleFactory.LUXURY_VEHICLE;
        }
        if (vhCategoryFromUser.equals("toyota")) {
            vhCategory = VehicleFactory.NON_LUXURY_VEHICLE;
        }
        VehicleFactory vf = VehicleFactory.getVehicleFactory(vhCategory);

        System.out.println("please enter type of car");
        String vhType = scanner.next();

        if (vhCategory.equals(VehicleFactory.LUXURY_VEHICLE)) {
            if ("sedan".equals(vhType)) {
                SedanCar sedanCar = vf.getSedanCar();
                System.out.println(sedanCar.getSedanName());
            }
            if ("suv".equals(vhType)) {
                SUVCar suvCar = vf.getSUVCar();
                System.out.println(suvCar.getSUVName());
            }
        }
        if (vhCategory.equals(VehicleFactory.NON_LUXURY_VEHICLE)) {
            if ("sedan".equals(vhType)) {
                SedanCar sedanCar = vf.getSedanCar();
                System.out.println(sedanCar.getSedanName());
            }
            if ("suv".equals(vhType)) {
                SUVCar suvCar = vf.getSUVCar();
                System.out.println(suvCar.getSUVName());
            }

        }
    }
}

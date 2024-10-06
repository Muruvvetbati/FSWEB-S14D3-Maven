package org.example.arge;

public class CarFactory {
    public static void main(String[] args) {
        CarSkeleton electricCar = new ElectricCar("tesla","tesla desc",300,2000);
        CarSkeleton hybridCar  =new HybridCar("honda","honda dsc",300,6,5);
        CarSkeleton gasPower = new GasPoweredCar("woswo","woswo des",300,50);
        startEngine(electricCar);
        startEngine(hybridCar);
        startEngine(gasPower);
    }

    public static void startEngine(CarSkeleton carSkeleton){
        System.out.println(carSkeleton.startEngine());
    }
}

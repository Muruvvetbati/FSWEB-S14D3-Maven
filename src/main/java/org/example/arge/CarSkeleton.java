package org.example.arge;

public class CarSkeleton {
 private String name;
 private String description;

    public CarSkeleton() {
    }

    public CarSkeleton(String name, String description) {
        this.name = name;
        this.description = description;
    }
    public String startEngine(){
        System.out.println("className:"+ getClass().getSimpleName());
        return getName()+ " starting engine.";
    }

    public String drive(){
        runEngine(this);
        return getName()+ "is driving...";
    }
    protected String runEngine(CarSkeleton carSkeleton){

    if(carSkeleton instanceof ElectricCar){
       double avgKmPerChange = ((ElectricCar) carSkeleton).getAvgKmPerCharge();
        int batterySize = ((ElectricCar) carSkeleton).getBatterySize();
        System.out.println("The car engine is starting with electric. Per charge: " + avgKmPerChange + " battery size: " + batterySize);
        
    } else if (carSkeleton instanceof  HybridCar) {
        HybridCar hybridCar = (HybridCar) carSkeleton;
        System.out.println("The car engine is starting with electric. Per charge: " + hybridCar.getAvgKmPerLiter() + " battery size: " + hybridCar.getBatterySize());


    } else if (carSkeleton instanceof GasPoweredCar) {
        GasPoweredCar gasPoweredCar = (GasPoweredCar) carSkeleton;
        System.out.println("The car engine is starting with electric. Per charge: " + gasPoweredCar.getAverageKmPerLiter() );

    }else {
        System.out.println("invalid car type!");
    }
        return "";
    }

        public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}

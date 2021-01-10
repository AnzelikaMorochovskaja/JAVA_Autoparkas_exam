package PetrolStation;

abstract class AutoVehicle {
    protected String carNum;
    protected int fuelLeft;
    protected int tankCapacity;
    protected FuelType fuelType;

    public AutoVehicle(String carNum, int fuelLeft, int tankCapacity, FuelType fuelType) {
        this.carNum = carNum;
        this.fuelLeft = fuelLeft;
        this.tankCapacity = tankCapacity;
        this.fuelType = fuelType;
    }

    public String toString() {
        return "Number: " + carNum + " Fuel left: " + fuelLeft + " Tank capacity: " + tankCapacity + " Fuel type: " + fuelType;
    }
}

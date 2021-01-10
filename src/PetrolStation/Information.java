package PetrolStation;

import java.io.Serializable;

public class Information implements Serializable {
    private String carNum;
    private int litresOfFuel;
    private int fuelLeft;
    private int tankCapacity;
    private FuelType fuel;

    public Information(String carNum, int litresOfFuel, int fuelLeft, int tankCapacity, FuelType fuel) {
        this.carNum = carNum;
        this.litresOfFuel = litresOfFuel;
        this.fuelLeft = fuelLeft;
        this.tankCapacity = tankCapacity;
        this.fuel = fuel;
    }

    public String toString() {
        return "Car number: " + carNum + " \nLitres of fuel filled: " + litresOfFuel +
                "\nLitres of fuel in the beginning:" + fuelLeft + "\nMaximum tank capacity: " +
                tankCapacity + "\nType of fuel: " + fuel;
    }
}

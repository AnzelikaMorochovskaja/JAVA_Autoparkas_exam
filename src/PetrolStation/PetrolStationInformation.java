package PetrolStation;

public class PetrolStationInformation {
    private static Information[] storage = new Information[750];

    public static void informationStorage(String carNum, int litresOfFuel, int fuelLeft, int tankCapacity, FuelType fuel) {
        for (int i = 0; i < storage.length; i++) {
            if (storage[i] == null) {
                storage[i] = new Information(carNum, litresOfFuel, fuelLeft, tankCapacity, fuel);
                break;
            }
        }
    }

    public static Information[] report() {
        return storage;
    }
}

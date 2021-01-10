package PetrolStation;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class PetrolStation {
    public static final int PETROL_MAX_VOLUME = 10000;
    public static final int DIESEL_MAX_VOLUME = 9500;

    protected static int petrol = 10000;
    protected static int diesel = 9500;

    protected int nrOfReport = 1;

    public void fillFuel(int litresOfFuel, AutoVehicle car) throws NoMoreStorageInTank {
        FuelType fuel = car.fuelType;
        if (fuel.equals(FuelType.PETROL)) {
            ifEnoughStorageInTank(litresOfFuel, car);
            petrol -= litresOfFuel;
            PetrolStationInformation.informationStorage(car.carNum, litresOfFuel, car.fuelLeft, car.tankCapacity, fuel);
        } else if (fuel.equals(FuelType.DIESEL)) {
            ifEnoughStorageInTank(litresOfFuel, car);
            diesel -= litresOfFuel;
            PetrolStationInformation.informationStorage(car.carNum, litresOfFuel, car.fuelLeft, car.fuelLeft, fuel);
        } else {
            System.out.println("Error.");
        }
    }

    private void ifEnoughStorageInTank(int litresOfFuel, AutoVehicle car) throws NoMoreStorageInTank {
        if ((car.fuelLeft + litresOfFuel) > car.tankCapacity) {
            System.out.println(" Tank capacity: " + car.tankCapacity + "Fuel left in tank: " + car.fuelLeft + " Litres of fuel filled: " + litresOfFuel + " Total fuel in tank: " + (car.fuelLeft + litresOfFuel));
            throw new NoMoreStorageInTank();
        }
    }

    public void acceptTanker(Tanker car) {
        car.petrolStationRefill();
    }

    public Information[] info() throws NoMorePetrolInStation {
        System.out.println("\nReport of the petrol station Nr: " + nrOfReport + "\n");
        ++nrOfReport;
        System.out.println("Total capacity of the petrol: " + PETROL_MAX_VOLUME + " litres");
        System.out.println("Total capacity of the diesel: " + DIESEL_MAX_VOLUME + " litres");
        System.out.println("\n");

        Information[] checkList = PetrolStationInformation.report();
        for (int i = 0; i < checkList.length; i++) {
            if (checkList[i] != null) {
                System.out.println((i + 1) + "." + checkList[i].toString());
                System.out.println("\n");
                if (petrol < 0 || diesel < 0) {
                    throw new NoMorePetrolInStation();
                }
            }
        }
        System.out.println("Total capacity of the petrol: " + petrol + " litres");
        System.out.println("Total capacity of the diesel: " + diesel + " litres");

        return checkList;
    }

    public void saveDataToFile() throws SavingException {
        try {
            FileOutputStream fileOutput = new FileOutputStream("/C:/Users/amoro/Documents/IdeaProjects/exam.autoparkas/PetrolStationInfo.txt");
            ObjectOutputStream objectOutput = new ObjectOutputStream(fileOutput);
            Information[] informationStorage = info();
            for (Information informationInput : informationStorage) {
                if (informationInput != null) {
                    objectOutput.writeObject(informationInput.toString());
                }
            }
            System.out.println("\nInformation saved to the \"PetrolStationInfo.txt\" file.");
            objectOutput.flush();
            objectOutput.close();
        } catch (Exception k) {
            throw new SavingException();
        }
    }
}

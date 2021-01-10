package PetrolStation;

public class PetrolStationMain {


    public static void main(String[] args) {
        PetrolStation petrol = new PetrolStation();

        SportCar car1 = new SportCar("ABC123", 200, 500, FuelType.PETROL);
        SportCar car2 = new SportCar("SKL690", 300, 500, FuelType.DIESEL);
        Bus car3 = new Bus("QWE147", 25, 450, FuelType.PETROL);
        Tractor car4 = new Tractor("TR777", 56, 1000, FuelType.PETROL);
        Truck car5 = new Truck("WP9254", 34, 550, FuelType.DIESEL);
        Tanker tanker = new DieselTanker();

        try {
            petrol.fillFuel(15, car1);
            petrol.fillFuel(57, car2);
            petrol.fillFuel(150, car3);
            petrol.fillFuel(200, car4);
            petrol.fillFuel(260, car5);
            petrol.acceptTanker(tanker);
            petrol.info();
            petrol.saveDataToFile();
        } catch (NoMorePetrolInStation k) {
            System.out.println(k.getError());
        } catch (NoMoreStorageInTank k) {
            System.err.println(k.getError());
        } catch (SavingException k) {
            System.err.println(k.getError());
        } catch (Exception k) {
            System.err.println("Unknown error!");
        }
    }
}

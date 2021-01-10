package PetrolStation;

abstract class Tanker {
    public void petrolStationRefill() {
        while (PetrolStation.petrol < PetrolStation.PETROL_MAX_VOLUME) {
            PetrolStation.petrol++;
        }
        while (PetrolStation.diesel < PetrolStation.DIESEL_MAX_VOLUME) {
            PetrolStation.diesel++;
        }
    }
}

package PetrolStation;

import PetrolStation.PetrolStation;

public class PetrolTanker {
    public void stationRefill(){
        while (PetrolStation.petrol < PetrolStation.PETROL_MAX_VOLUME){
            PetrolStation.petrol++;
        }
    }
}

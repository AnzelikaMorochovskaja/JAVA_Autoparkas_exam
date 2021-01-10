package PetrolStation;

public class DieselTanker extends Tanker {
    public void petrolStationRefill(){
        while (PetrolStation.diesel < PetrolStation.DIESEL_MAX_VOLUME){
            PetrolStation.diesel++;
        }
    }
}

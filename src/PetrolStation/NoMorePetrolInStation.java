package PetrolStation;

public class NoMorePetrolInStation extends Exception {
    public String error;

    public NoMorePetrolInStation(String error) {
        super(error);
    }

    public NoMorePetrolInStation() {
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}

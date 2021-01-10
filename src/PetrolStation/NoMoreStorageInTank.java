package PetrolStation;

public class NoMoreStorageInTank extends Exception {
    public String error;

    public NoMoreStorageInTank(String error) {
        super(error);
    }

    public NoMoreStorageInTank() {
    }

    public String getError() {
        return "Error! No more storage in the tank to fill fuel\n";
    }
}

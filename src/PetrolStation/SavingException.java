package PetrolStation;

public class SavingException extends Exception {
    public String error;

    public SavingException(String error) {
        super(error);
    }

    public SavingException() {
    }

    public String getError() {
        return "Error! Data not saved.\n";
    }
}

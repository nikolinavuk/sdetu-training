package oop;

public class LoanAccount implements IRate {

    @Override
    public void setRate() {
        System.out.println("Rate");

    }

    @Override
    public void increaseRate() {
        System.out.println("Increase Rate");

    }

    public void setTerm (int terms) {
        System.out.println("Setting the term: " + terms + " years.");
    }

    public void setAmortisation() {
        System.out.println("Amortisation schedule: ");
    }
}

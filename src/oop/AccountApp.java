package oop;

public class AccountApp {

    public static void main (String [] args) {
        LoanAccount loanAccount1 = new LoanAccount();
        loanAccount1.increaseRate();
        loanAccount1.setRate();
        loanAccount1.setAmortisation();
        loanAccount1.setTerm(20);

        //Polymorphism changes where we are pointing
        IRate account1 = new LoanAccount();
        account1.increaseRate();
        account1.setRate();

    }

}

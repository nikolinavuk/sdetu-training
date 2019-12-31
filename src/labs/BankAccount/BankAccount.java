package labs.BankAccount;


public class BankAccount implements IInterest{

    //Properties of bank account
    private static int ID = 1000; //Internal ID - our own internal bank ID to idenfty customers
    private String accountNumber; //ID + random 2 digit number + first 2 of the SSN
    private static final String routingNumber = "005400657";
    private String name;
    private String SSN;
    private double balance;

    //Constructor
    public BankAccount (String SSN, double initDeposit) {
        balance = initDeposit;
        this.SSN=SSN;
        ID++;
        System.out.println("ID: " + ID);
        setAccountNumber();
    }

    private void setAccountNumber () {
        int randomNumber = (int)(Math.random() * 100);
        accountNumber= ID + ""+ randomNumber + SSN.substring(0,2);
        System.out.println("Your account number is: " + accountNumber);
        System.out.println();
    }

    public void setName (String name) {
        this.name = name;
    }

    public String getName () {
        return name;
    }

    public void payBill (double amount) {
        balance = balance - amount;
        displayBalance();
    }

    public void makeDeposit (double amount) {
        balance = balance + amount;
        System.out.println("Making a deposit " + amount);
        displayBalance();
    }

    public void displayBalance () {
        System.out.println("Your balance is " + balance);
    }

    @Override
    public void accrue () {
        balance = balance * ((rate/100) + 1);
        System.out.printf("Your balance is %.2f %n", balance);
    }

    @Override
    public String toString () {
        return "[Name: " + name + "] \n[Account number: " + accountNumber +"]\n" + "[Routing Number: " + routingNumber +
                "]\n" + "[Balance: " + balance + "]";

    }
}

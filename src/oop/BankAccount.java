package oop;

public class BankAccount implements IRate{
    //Define variables
    private String name;
    private String SSN;
    private String accountNumber;
    private static final String routingNumber = "123456";
    private String accountType;
    private double balance;

    BankAccount () {
        accountType = "Checking account";
        System.out.println("NEW ACCOUNT CREATED:" + accountType);
    }

    //Allow the user to define the name
    public void setName(String name) {
        this.name = name;
    }

    public String getName (){
        return name;
    }

    public void setSSN (String SSN) {
        this.SSN = SSN;
    }

    public String getSSN() {
        return SSN;
    }

    public void setAccountNumber (String accountNumber) {
        this.accountNumber = accountNumber ;
    }

    public String getAccountNumber () {
        return accountNumber;
    }

    public void setAccountType (String accountType) {
        this.accountType = accountType;
    }

    public String getAccountType () {
        return accountType;
    }

    public void setBalance (double balance){
        this.balance = balance;
    }

    public double getBalance () {
        return balance;
    }

    //Interface methods
    public void setRate () {
        System.out.println("Setting rate.");
    }

    public void increaseRate() {
        System.out.println("Increasing rate.");
    }



    BankAccount (String accountType) {
        System.out.println("ACCOUNT TYPE: " + accountType);
    }

    BankAccount (String accountType, double initialDeposit) {
        System.out.println("ACCOUNT TYPE: " + accountType);
        System.out.println("INITIAL DEPOSIT $: " + initialDeposit);
        String message = null;
        if (initialDeposit < 5000) {
            message = "ERROR: Minimum deposit must be over $ 5000";
        } else {
            message = "Thank you for your initial deposit.";
        }
        System.out.println(message);
        balance = initialDeposit;
    }

    //Getters and Setters for private variables/attributes



    void deposit(double amount) {
        balance = balance + amount;
        showActivity("DEPOSIT");

    }

    void withdraw (double amount) {
        balance = balance - amount;
        showActivity("WITHDRAW");

    }

    void checkBalance() {

    }

    //Private: can only be called from within the class
    private void showActivity(String activity) {

        System.out.println("Your recent transaction: " + activity);
        System.out.println("Your new balance is " + balance);
    }

    void getStatus() {

    }

    @Override
    public String toString () {
        return "[ NAME: "  + name + ". ACCOUNT NUMBER: " +accountNumber + " ROUTING NUMBER: " +  routingNumber + " BALANCE: "  + balance+ "]";

    }
}

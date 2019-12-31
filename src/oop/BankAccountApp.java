package oop;

public class BankAccountApp {

    public static void main (String [] args) {
    //Creating a new bank account - instantiate an object

        BankAccount account1 = new BankAccount();

        //With encapsulation
        account1.setName("Georg");
        System.out.println("ACCOUNT: " + account1.getName());

        account1.setSSN("25698");
        System.out.println("SSN: "+ account1.getSSN());

        account1.setAccountNumber("123456");
        System.out.println("ACCOUNT NUMBER: " + account1.getAccountNumber());

        account1.setAccountType("Checking");
        System.out.println("ACCOUNT TYPE: " + account1.getAccountType());

        account1.setBalance(2300);
        System.out.println("ACCOUNT BALANCE $: " + account1.getBalance());


       // System.out.println(account1.accountNumber.toString());
        System.out.println(account1.toString());

        account1.setRate();
        account1.increaseRate();
        account1.deposit(1500);
        account1.deposit(3000);
        account1.deposit(12345);
        account1.withdraw(300);


//        BankAccount account2 = new BankAccount("Savings account");
//        account2.accountNumber = "234567";
//
//        BankAccount account3 = new BankAccount("Checking account", 23000);
//        account3.accountNumber = "345678";
//        account3.checkBalance();

//        //Demo fo inheritance
//        CDAccount cd1 = new CDAccount();
//        cd1.balance = 3000;
//        cd1.name = "Juan";
//        cd1.accountNumber = "15698";
//        cd1. accountType = "CD Account";
//        System.out.println(cd1.toString());
//        cd1.compound();





    }

}

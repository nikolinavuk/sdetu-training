package labs.BankAccount;

public class BankAccountApp {

    public static void main (String args[]) {

        BankAccount account1 = new BankAccount("123456789", 1000);


        account1.setName("Nikolina");
        System.out.println("Name: " + account1.getName());

        account1.makeDeposit(500);
        account1.payBill(600);
        account1.accrue();
        System.out.println(account1.toString());



    }
}

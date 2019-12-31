package basics;

public class Strings {

    public static void main (String args[]) {
    String bookTitle = "Lord of the Rings";
    String wordChoice = "Ring";

    if (bookTitle.contains("Ring")) {
        System.out.println("The book contains the word " + wordChoice + ".");
    }

    String browser = "Chrome";
    if (browser.equalsIgnoreCase("chrome")) {
        System.out.println("The browser is " + browser );
    }

    String firstName = "Nikolina";
    String lastName = "Vukelic";
    String SSN = "123456";

        System.out.print(firstName.substring(0,1));
        System.out.print(lastName.substring(0,3));
        System.out.println(SSN.substring(5));


        System.out.println("There are " + SSN.length() + " digits in your SSN");


    }

}

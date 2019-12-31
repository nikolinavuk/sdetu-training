package basics;

public class NumbersCalc {

    public static void main (String args []) {
        System.out.println("Program is starting");
        printName();

        int numA = 10;
        int numB = 20;
        addNumbers(numA, numB);
        multiplyNumbers (numA, numB);
        int product = multiplyNumbers(numA, numB);
        System.out.println(multiplyNumbers(numA, numB));
    }

    static void printName() {
        System.out.println("My name is Nikolina");
    }

    static void addNumbers(int numberA, int numberB) {
        //this function will add two numbers
        int sum = numberA+numberB;
        System.out.println("Number A " + numberA + " and " + numberB + " is " + sum);
    }


    static int multiplyNumbers(int valueA, int valueB) {
        int product = valueA*valueB;
        addNumbers(product, product);
        return product;
    }


}

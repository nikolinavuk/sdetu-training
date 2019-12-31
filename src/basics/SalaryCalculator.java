package basics;

public class SalaryCalculator {

    public static void main (String args []) {
        //Compute our annual salary
        //rate * hoursPerWeek * weeksPerYear

        //Declare a variable
        String career;
        System.out.println("Program is starting");
        career = "software developer";
        System.out.println("My carrer is: " + career);

        int hourserWeek = 40;
        int weeksPerYar = 50;
        double rate = 42.50;

        double salary = hourserWeek*weeksPerYar*rate;
        System.out.println("My salary as a " + career + " at the rate of $ " + salary);
    }
}

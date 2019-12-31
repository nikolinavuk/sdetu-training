package basics;

import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;

import java.util.Arrays;

public class FibonnaciApp {

    public static void main (String [] args) {
        //Fibonnaci is defined by the numer of the previous 2 numbers ()
        // fib(0) = 0
        //fib(1) = 1
        //fib(2) = fib(0) + fib(1) = 1
        //fib(3) = fib(2) + fib(1) = 1 +1 = 2
        //fib (4) = fib(3) + fib(2)  = 2 + 1 = 3

        System.out.print("RETURN N VALUE: " +returnValue(5));
        System.out.println();
        System.out.print("FACTORIAL: " + factorial());
        System.out.println();
        System.out.println("RANDOM NUMBER: " + Arrays.toString(findValue()));
        System.out.println("MAX: " + returnMaximum());
        System.out.println("MIN: " + returnMinimum());
        System.out.println("AVG: " + returnAverage());

    }

    public static int fib (int n) {
        if (n == 0) {
            return 0;
        }
        else if (n == 1) {
            return 1;
        }
        return (fib (n-1) + fib (n-2));
    }

    public static int returnValue ( int n) {
        n = 0;
        int output = 0;

        for (int i=0; i< 5; i++) {
            output = (output + (n+1));
            n++;
        }
        return output;
    }

    public static int factorial () {
        int f =1;
        int factorialValue = 1;
        for (int i = 0; i < 5; i++) {
            factorialValue = f * factorialValue;
            f++;
        }
        return factorialValue;
    }

    public static int[] findValue () {
        int[] findValue = new int[5];
        for (int i = 0; i < findValue.length; i++) {
            findValue[i] = (int) randomNumber();
        }
        return findValue;
    }

    public static int returnMaximum() {
        int [] list = findValue();
        System.out.println(Arrays.toString(list));
        int maximum = list[0]; //initialise the maximum

        for (int i=0; i < list.length; i++) {
            if (list[i] > maximum) {
                maximum = list[i];
            }
        }
        return maximum;
    }


    public static int returnMinimum () { //finds the minimum of a given array (creates a new array)
        int[] candidates = findValue();
        System.out.println(Arrays.toString(candidates));
        int minimum = candidates[0];

        for (int i =0; i < candidates.length; i++) {
            if (candidates[i] > minimum) {
                minimum = candidates[i];
            }
        }
        return minimum;
    }


    public static double returnAverage () {
    int [] candidatesAverage =  findValue();
        System.out.println(Arrays.toString(candidatesAverage));
    double average = candidatesAverage[0];

    for (int i =0; i < candidatesAverage.length; i++) {
        average=candidatesAverage.length;
    }

    return average;

    }


    public static double randomNumber() {
        double randomNumber = Math.random();
        return randomNumber*100;
    }

}

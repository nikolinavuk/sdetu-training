package basics;

public class Cities {

    public static void main (String args []) {
        String[] cities = {"Rjeka", "Pula", "Zagreb", "Split"};

//        System.out.println(cities[0]);
//        System.out.println(cities[1]);
//        System.out.println(cities[2]);

        //Declare array
        String[] countries;

        //Define the array
        countries = new String[3];
        countries[0] = "Norway";
        countries[1] = "Sweden";
        countries[2] = "Finland";
//        System.out.println(countries[2]);

        String[] states = new String[5];
        states[0] = "Primorska";
        states[1] = "Zagrebacka";
        states[2] = "Istarska";
        states[3] = "Kninska";
        states[4] = "Krapinska";

        int i = 0;

        //Do loop enters the loop then tests condition
        do {
            System.out.println("STATE: " + states[i]);
            i = i + 1;
        }
        while ( i< 5);

        //while loop, tests condition first then enters loop
        int n = 0;
        boolean stateFound = false;
        while (! stateFound) {
            String state = states[n];
            if (state == "Primorska") {
                System.out.println("State found!");
                stateFound = true;
            }
            n++;
        }

        //For loop: best structure for iterating through an array

        System.out.println("Printing with for loop");
        for (int x = 0; x < states.length; x++) {
            System.out.println(states[x]);
        }



    }
}

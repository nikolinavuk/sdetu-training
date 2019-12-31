package basics;

public class Weather {

    public static void main (String args []){

        int temperature = 65;
        String sunCondition = "sunny";

        if (temperature > 80) {
            System.out.println("Its pleasant, wear shorts and t-shirt");
        }
        else if (temperature > 60 &&(sunCondition == "sunny") ) {
            System.out.println("Its a little cooler, perhaps wear a long sleeve shirt and jeans.");
            System.out.println("Wear a heat to keep the sun out of your eyes");
        }
        else {
            System.out.println("Looks like a cold day, bring a sweater.");
        }
    }
}

package oop;

public class Demo {

    public static void main (String [] args) {
        //Instantiating an object
        Person person1 = new Person();
        person1.name = "Nikolina";
        person1.email = "nikolina@test.com";
        person1.phoneNumber = "12345";

    }

    static void walking (String name){
        System.out.println(name + " is walking");
    }


}

class Person {
    String name;
    String email;
    String phoneNumber;

    void walk () {
        System.out.println(name + " is walking.");
    }

    void eat() {
        System.out.println(name + " i eating.");
    }

    void sleep() {
        System.out.println(name + " is sleeping.");
    }
}

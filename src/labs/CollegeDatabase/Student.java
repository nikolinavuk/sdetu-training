package labs.CollegeDatabase;

import javax.swing.*;
import java.sql.SQLOutput;

public class Student {

    private String name;
    private String SSN;
    private String email;
    private static int ID = 0;
    private String userID;
    private String course = "";
    private static final int costOfCourse = 800; //could be an interface
    private int balance = 0;

    public Student (String name, String SSN){
        ID++;
        this.name = name;
        this.SSN = SSN;
        setUserID();
        setEmai();
    }

    private void setEmai () {
        email = name.toLowerCase() + "." + ID + "@sdetuniversity.com";
        System.out.println("Your email is: " + email);
    }

    private void setUserID (){
        int max = 9000;
        int min = 1000;
        int randomNumber = (int)(Math.random()* ((max -min)));
        randomNumber  = randomNumber + min;
        System.out.println(randomNumber);
        userID = ID + "" + randomNumber  + SSN.substring(5);
    }

    public void enroll (String course){
        this.course = this.course + "\n" + course;
        balance = balance + costOfCourse;

    }

    public void payTuition (int amount){
        System.out.println("Payment: $" + amount);
        balance = balance - amount;
    }

    public void checkBalance(){
        System.out.println("Balance: $" + balance);

    }

    public void showCourses () {
        System.out.println(course);

    }

    public String toString () {
    return "[Name: " + name + "]\n[Courses: " + course +"]\n[Balance: " + balance +" ]";
    }

}

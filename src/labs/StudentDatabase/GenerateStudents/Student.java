package labs.StudentDatabase.GenerateStudents;

public class Student {

    private String SSN;
    private String name;
    private String eMail;
    private static int ID = 1000;
    private String phoneNumber;
    private String city;
    private String state;
    private String userID;
    private double balance;
    private String courses;

    public Student(String name, String SSN) {
        this.name = name;
        this.SSN = SSN;
        ID++;
    }

    public void setName (String name) {
        this.name = name;
    }

    public void enroll () {
        eMail = name.toLowerCase() + (int)(Math.random() *100)+ "@cbs.dk";
        userID = ID + "" + (int)(Math.random()*1000) + SSN.substring(0,5);
    }

    public void enroll(double initEnrollment) {
        double balance = initEnrollment;
        if (balance <= 1000) {
            System.out.println("You cannot enroll, please check the requirements again");
        }
        else {
            enroll();
            confirmationMsg();
            setBalance(initEnrollment);
            listCourses();
        }
    }

    public void setBalance(double initialEnrollment) {
        this.balance = initialEnrollment;
    }

    public void payForCourses(double fee) {
        balance = balance - fee;
        displayBalance();
    }

    public void displayBalance () {
        if (balance >= 0) {
            System.out.println("Balance: " + balance);
        }
        else {
            System.out.println("Balance: " + balance);
            System.out.println("Please make a deposit");
        }
    }

    public void confirmationMsg () {
        System.out.println("Confirmed enrollment.");
    }

    public void listCourses () {
        courses = " math, computer science, and architecture " ;
    }

    @Override
    public String toString (){
        return "Name: " + name +"\n" +
                "SSN: " + SSN + "\n" +
                "Email: " +eMail + "\n" +
                "User ID : " + userID +"\n" +
                "Balance: " + balance + "\n"+
                "Courses: " + courses ;
    }

    public void setPhone (String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber (){
        return phoneNumber;
    }

    public void setCity (String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setState (String state){
        this.state = state;
    }

    public String getState (){
        return state;
    }
}

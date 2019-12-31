package labs.CollegeDatabase;

public class StudentDatabaseApplication {
    public static void main (String [] args) {

        //Create a student

        Student student1 = new Student ("Nikolina", "123456789");
        Student student2 = new Student ("Jim", "987561234");
        Student student3 = new Student ("Peter", "123498765");

        student1.enroll("Math151");
        student1.enroll("English255");
        student1.enroll("History211");
        student1.showCourses();
        student1.checkBalance();
        student1.payTuition(600);
        student1.checkBalance();
        System.out.println(student1.toString());

    }
}

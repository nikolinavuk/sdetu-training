package labs.StudentDatabase;

import labs.StudentDatabase.GenerateStudents.Student;

public class StudentDatabaseApp {

   public static void main (String [] args) {

      Student student1 = new Student("Nikolina", "123456789");
      Student student2 = new Student("Jim", "987654321");
      Student student3 = new Student("Peter", "987651234");

      student1.setName("Nikolina");
      student1.enroll(1234);
      System.out.println(student1.toString());
      student1.payForCourses(400);
      System.out.println();

      student2.setName("Jim");
      student2.enroll(2350);
      System.out.println(student2.toString());
      student2.payForCourses(2352);
      System.out.println();

      student3.setName("Peter");
      student3.enroll(999);
      System.out.println(student3.toString());

   }
}

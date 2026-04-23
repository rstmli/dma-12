package extask;
import java.util.Arrays;

import static extask.Student.*;

public class Main {
  public static void main(String[] args) {
    Student s1 = new Student("Ilkin","Eyyubov",21);
    Student s2 = new Student("Murat","Shahbazov",25);
    Student s3 = new Student("Anar","Yusifov",15);

    try {
      addStudent(0,s1);
      addStudent(2,s3);
      addStudent(1,s2);
    }catch (InvalidAgeException ex ){
//      System.out.println(ex.getCause());
      System.out.println(ex.getMessage());
//      ex.printStackTrace();
    }

    System.out.println(Arrays.toString(getStudentList()));

  }
}

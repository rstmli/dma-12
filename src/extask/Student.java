package extask;

import java.io.IOException;

public class Student {
  private String name,surname;
  private int age;
  private static Student[] studentList = new Student[10];

  public Student(String name, String surname, int age) {
    this.name = name;
    this.surname = surname;
    this.age = age;
  }

  public static Student[] getStudentList() {
    return studentList;
  }

  public static void addStudent(int id, Student s)  {
    if(s.age < 18){
      throw new InvalidAgeException(s.name +  " sizin yasiniz 18 den kicikdir");
    }

    studentList[id] = s;
  }

  @Override
  public String toString() {
    return "extask.Student{" +
            "name='" + name + '\'' +
            ", surname='" + surname + '\'' +
            ", age=" + age +
            '}';
  }
}

package studentacademytask2;

import java.util.List;

public class Student {
  String name;
  String surname;
  List<String> pL;

  public Student(String name, String surname, List<String> pL) {
    this.name = name;
    this.surname = surname;
    this.pL = pL;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSurname() {
    return surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public List<String> getpL() {
    return pL;
  }

  public void setpL(List<String> pL) {
    this.pL = pL;
  }

  @Override
  public String toString() {
    return "studentacademytask2.Student{" +
            "name='" + name + '\'' +
            ", surname='" + surname + '\'' +
            ", pL=" + pL +
            '}';
  }
}

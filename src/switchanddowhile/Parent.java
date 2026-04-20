package switchanddowhile;

import java.util.Arrays;

public class Parent {
  String name;
  String surname;
  int age;
  Child[] children;
  /*
  developer class
  fields
  name,surname,expYear,String[] pL
//  Elminaz Mirzelizade 3 {"python","Java","CSharp"}
   */

  @Override
  public String toString() {
    return "Parent{" +
            "name='" + name + '\'' +
            ", surname='" + surname + '\'' +
            ", age=" + age +
            ", children=" + Arrays.toString(children) +
            '}';
  }

  public Parent(String name, String surname, int age,Child[] children) {
    this.name = name;
    this.surname = surname;
    this.age = age;
    this.children = children;
  }
}

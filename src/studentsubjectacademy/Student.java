package studentsubjectacademy;

import java.util.Arrays;

public class Student {
  private String name;
  private String surname;
  private int age;
  private int roomNumber;
  private Subject[] subjects;

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

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public int getRoomNumber() {
    return roomNumber;
  }

  public void setRoomNumber(int roomNumber) {
    this.roomNumber = roomNumber;
  }

  public Subject[] getSubjects() {
    return subjects;
  }

  public void setSubjects(Subject[] subjects) {
    this.subjects = subjects;
  }

  public Student(String name, String surname, int age, int roomNumber, Subject[] subjects) {
    this.name = name;
    this.surname = surname;
    this.age = age;
    this.roomNumber = roomNumber;
    this.subjects = subjects;
  }


  @Override
  public String toString() {
    return "studentsubjectacademy.Student{" +
            "name='" + name + '\'' +
            ", surname='" + surname + '\'' +
            ", age=" + age +
            ", roomNumber=" + roomNumber +
            '}';
  }
}

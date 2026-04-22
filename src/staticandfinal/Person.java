package staticandfinal;

public class Person {
  private long id;
  private String name;
  private String surname;
  private int age;
  private Double salary;
  public static long counter = 1;
  public static double totalSalary = 0;
  public static double avgSalary = 0;

  public Person(String name, String surname, int age,Double salary) {
    this.name = name;
    this.surname = surname;
    this.age = age;
    this.salary=salary;
    id = counter++;
    totalSalary+=salary;
    avgSalary = totalSalary/counter;
  }

  @Override
  public String toString() {
    return "Person{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", surname='" + surname + '\'' +
            ", age=" + age +
            ", salary=" + salary +
            '}';
  }

  public static void getTotalSalaryAndAvg(){
    System.out.println("Toplam maas: " + totalSalary);
    System.out.println("ortalama maas: "+ avgSalary);
  }
}

// max,+
// sum, +
// avg, +
// min, +
// even, +
// targetNumber +
 //               static method her biri return qaytarsin
// main methodunda sadece 1 arrayimiz var bu array uzerinde 5 ferqli emeliyyat apaririq

package hashandequals;

import java.util.HashSet;
import java.util.Set;

public class Main {
  public static void main(String[] args) {
    Student s1 = new Student("Pakize","Hasanl");// 15214554 1512512515 +101249812095812985
    Student s2 = new Student("Pakize","Hasanli"); // 15214554 15125125152 + 125985128954219
    Set<Student> tekrarsiz = new HashSet<>();
    tekrarsiz.add(s1);
    tekrarsiz.add(s2);
    System.out.println(tekrarsiz);
    System.out.println(s1.hashCode());
    System.out.println(s2.hashCode());
    System.out.println(s1.equals(s2));
  }
}

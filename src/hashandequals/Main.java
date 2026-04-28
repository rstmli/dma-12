package hashandequals;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
  public static void main(String[] args) {
//    Student s1 = new Student("Pakize","Hasanl");// 15214554 1512512515 +101249812095812985
//    Student s2 = new Student("Pakize","Hasanli"); // 15214554 15125125152 + 125985128954219
//    Set<Student> tekrarsiz = new HashSet<>();
//    tekrarsiz.add(s1);
//    tekrarsiz.add(s2);
//    System.out.println(tekrarsiz);
//    System.out.println(s1.hashCode());
//    System.out.println(s2.hashCode());
//    System.out.println(s1.equals(s2));


    Scanner sc = new Scanner(System.in);
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();

   try  {
     calc(num1,num2);
   }catch (ArithmeticException ex){
     System.out.println(ex.getMessage());
   }
  }
  public static int calc(int a,int b){
    if(b != 0){
      return a/b;
    }
    else {
      throw new ArithmeticException("deyer o ola bilmez");
    }
  }
}


/*
  generics class Box<T>
  T item; - field
  generics method
   public <T> void printBox(}{
  sout(item);

  main methodda cagrilis
  Box<String> box1 = new Box<>("Salam");
  box1.printBox();



  pair generics
  class Pair<K,V>
  K key; - field
  V value; - field
  key  = programLanguage;
  value = Java,
  swap method
  key java
  value programLanguage

  Pair<String,Integer> s1 = new Pair("Ilkin",90);



 */




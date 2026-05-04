package maptask;

import java.io.PushbackReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
  static Scanner sc = new Scanner(System.in);
  static Map<String, String> userDb = new HashMap<>();

  public static void main(String[] args) {
//    Map<String, List<Subject>> telebeler = Map.of(
//            "Murat",List.of(
//                    new Subject("kimya",99.8),
//                    new Subject("fizika",88.4),
//                    new Subject("riyaziyyat",99.9)
//                    ),
//            "Aynur",List.of(
//                    new Subject("kimya",78.9),
//                    new Subject("Riyaziyyat",99.9)
//            ));
//
//
//
//
//    for(Map.Entry<String,List<Subject>> student: telebeler.entrySet()){
//      System.out.print (student.getKey());
//      for(Subject s : student.getValue()){
//        System.out.print( " fen " + s.getSubjectName() +   " bal " + s.getSubjectGrade());
//      }
//      System.out.println();
//    }


    String username;
    String password;
    while (true) {
      System.out.println("Wellcome to Jet Academy\n1 -> login\n2 -> register\nenter choice: ");
      int choice = sc.nextInt();
      sc.nextLine();
      System.out.print("enter username: ");
      username = sc.nextLine();
      System.out.print("enter password: ");
      password = sc.nextLine();
      if (checkIsEmpty(username, password)) continue;
      if (choice == 1) {
        if (choice1(username, password)) break;
      } else if (choice == 2) {
        choice2(username, password);
      }
    }
  }

  private static void choice2(String username, String password) {
    if (!userDb.containsKey(username)) {
      userDb.put(username, password);
    } else {
      System.out.println("username already");
    }

  }

  private static boolean choice1(String username, String password) {
    if (userDb.containsKey(username) && userDb.containsValue(password)) {
      System.out.println("ugurlu");
      return true;
    } else {
      System.out.println("invalid username or password");
      return false;
    }
  }


  private static boolean checkIsEmpty(String username, String password) {
    if (username.isEmpty() || password.isEmpty()) {
      System.out.println("bos deyer daxil edile bilmez");
      return true;
    }
    return false;
  }




  /*

    istifadeci qeydiyyat ve login sistemi
    istifadeci seyfeye giris edir
    ekranda yazilir
    login 1
    register 2
    eger 1 secse yoxlayiriq bele bir user varmi
    2 secse elave edirik scannerden username ve password aliriq

   */


}

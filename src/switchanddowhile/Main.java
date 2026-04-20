package switchanddowhile;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Child ahmad = new Child("Ahmad","Jackson",12);
    Child murad = new Child("Murad","Jackson",13);
    Child[] children = {ahmad,murad};
    Parent emily = new Parent("Emily","jackson",35,children);
    System.out.println(emily);



    // switch case
//    Scanner sc  = new Scanner(System.in);

//    int[] arr = {4,2,4,5,6,1,71,9,4,15};
//    int target = 9;
//    for(int i = 0;i<arr.length;i++){
//      for(int j = i + 1;j<arr.length;j++){
//        if(arr[i] + arr[j] == target){
//          System.out.println(i +" " + j);
//        }
//      }
//    }
//
//
//    int num = 1009;
//    if (num <= 1) {
//
//      System.out.println("eded ne sade nede murakkeb deyil");
//    }
//    else{
//      int count = 0;
//
//
//      for(int i = 2;i<=num;i++){
//        if(num%i==0) count++;
//      }
//      if(count==1){
//        System.out.println("bu eded sadedir");
//      }else {
//        System.out.println("bu eded murakkebdir");
//      }
//    }
//





    // do while

//    int a = 5;
//
//    do{
//      System.out.println("isledim");
//    }
//    while(a<10);


  }



//  public static String balTranslate(int point){
//    switch(point){
//      case 100 -> {
//        return "max bal";
//      }
//      case 90 -> {
//        return "yaxsi";
//      }
//      case 80 -> {
//        return "orta";
//      }
//      case 50 -> {
//        return "kesildiniz";
//      }
//      default -> {
//        return "Deyer duzgun daxil edilmeyib";
//      }
//    }
//  }
}

package taskmurat;

import java.util.Arrays;

public class Mian {
  public static void main(String[] args) {
//    char[] arr = new char[26];
//    int i = 0;
//    for (char c = 'a'; c <= 'z'; c++) {
//
//      arr[i] = c;
//      i++;
//    }
//    System.out.println(Arrays.toString(arr));


    String text = "bcocp";
    int surus = 2;
//    surus =((surus%26) + 26) %26;
    StringBuilder result = new StringBuilder();
//    for(int i = 0;i<text.length();i++){
//      char c = text.charAt(i);
//      if (c >= 'a' && c <= 'z') {
//        char yeni = (char) ('a' + (c - 'a' + surus) % 26);
//        result.append(yeni);
//      }
//      else if (c >= 'A' && c <= 'Z') {
//        char yeni = (char) ('A' + (c - 'A' + surus) % 26);
//        result.append(yeni);
//      }
//      else {
//        result.append(c);
//      }

//    }


    for (int i = 0; i < text.length(); i++) {
      char c = text.charAt(i);

      if (c >= 'a' && c <= 'z') {
        char yeni = (char) ('a' + (c - 'a' - surus + 26) % 26);
        result.append(yeni);
      } else if (c >= 'A' && c <= 'Z') {
        char yeni = (char) ('A' + (c - 'A' - surus + 26) % 26);
        result.append(yeni);
      } else {
        result.append(c);
      }
    }
    System.out.println(result);
//    int[] surusmus = new int[text.length()];
//    int s = 0;

//    for(int n = 0; n< text.length();n++){
//      if(text.charAt(n) == arr[n]){
//        surusmus[s] = n + surus;
//        s++;
//      }
//    }
//    for(int j = 0;j<surusmus.length;j++){
//       for(int k = 0;k<arr.length;k++){
//         System.out.println(arr[surusmus[j]]);
//         break;
//       }
//    }















    StringBuilder symbol = new StringBuilder("<><><>");
    System.out.println(symbol);
    for(int i = 0;i<symbol.length();i++){
      System.out.println(symbol.charAt(i));
    }


/*
        <?><?><?><?><?><?><?><?><?><?><?><?><?><?><?><?><?><?><?><?><?><?>
        academy -> student -> subject
        academy -> name,Student[]
        student -> name,surname,age,roomNum,Subject[]
        subject -> name,grade,totalHour

        task1 -> en cox telebesi olan academy
        task2 -> eger telebe her hansisa fenden 50 den asagi bal toplayibsa
                 ExampleName kesdildiniz mesaji cixsin
        <><><><><><><><><><><><><><><><><><><><>><><><><><><><><><><><><><>
 */


  }
}


import java.util.*;

public class Main {


  public static void main(String[] args) {
    /*
    soz polindromdur yoxsa yox
     */
  List<StringBuilder> list1 = List.of(new StringBuilder("Pakize"),new StringBuilder("alma"),new StringBuilder("ata"),new StringBuilder("level"),new StringBuilder("madam"));
  for(StringBuilder s : list1){
    if(s.toString().contentEquals(s.reverse())){
      System.out.println("eded polindromdur: " + s);
    }else {
      System.out.println("eded polindrom deyil: " + s);
    }
  }




















/* listin icindeki en cox tekrarlanan soz*/



//
//    List<String> box = List.of("Ilkin","Elminaz","Aynure","Nurlan","Ilkin","Baris","Pakize",
//            "Nicat","Baris","Nurlan","Aynure","Seadet","Murat","Elminaz","Seadet","Nurlan","Elminaz","Nurlan");
//    Set<String> unique = new HashSet<>(box); // bunlari unique edimki daha az ve daha semereli dovr edek
////
////    //
////     //
//    int maxCount = 0;
//    int dovrSayi = 0;
//    for(String word : box){
//      dovrSayi++;
//      int count = 0;
//      for(String w : box){
//        dovrSayi++;
//        if(word.equals(w)){
//          count++;
//        }
//      }
//      if(maxCount < count){
//        maxCount = count;
//      }
//    }
//
//    for(String word : unique){
//      int count = 0;
//      for(String w : box) {
//        if (word.equals(w)) {
//          count++;
//        }
//      }
//      if(maxCount == count){
//        System.out.println(word);
//      }
//    }
//
//    System.out.println(dovrSayi);



//    String text1 = "Bu gün hava çox gözəldir, parkda gəzmək əla olar. Quşlar oxuyur və " +
//            "günəş parlayır.";
//    String text2 = "Bu gün hava bir az sərin olsa da, günəş buludların arasından süzülür." +
//            " Kitab oxumaq və çay içmək gözəl fikirdir.";
//    String[] text1Array = text1.split(" ");
//    String[] text2Array = text2.split(" ");
//    Set<String> text1Set = new HashSet<>();
//    Set<String> text2Set = new HashSet<>();
//    Collections.addAll(text1Set,text1Array);
//    Collections.addAll(text2Set,text2Array);
////    text1Set.retainAll(text2Set);
////    System.out.println(text1Set);
//    text2Set.removeAll(text1Set);
//    System.out.println(text2Set);










/*
// text1 = java python salam soz bir bes
   text2 = salam python bugun sabah dunen telefon
   ortaq sozler (her iki textdede olan sozler)"
   1 ci listde olub 2 ci listde olmayan sozler
   2 ci listde olub 1 ci listde olmayan sozler
*/






//    int[] arr = {1, 2, 3, 4, 5, 6, 7, 10, 8, 12, 30, 15, 20};
//    int max = arr[0];




//    for (int i = 0; i < arr.length; i++) {
//      int count = 0;
//      if (arr[i] <= 1) {
//        System.out.println("eded ne sade ne murekkebdir: " + arr[i]);
//        continue;
//      }
//      for (int j = 2; j <= arr[i]; j++) {
//        if (arr[i] % j == 0) {
//          count++;
//        }
//      }
//      if (count == 1) {
//        System.out.println("sade: " + arr[i]);
//      } else {
//        System.out.println("murekkeb: " + arr[i]);
//      }
//    }
//    System.out.println(max);
  }
}

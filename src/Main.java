import java.util.*;

public class Main {


  public static void main(String[] args) {
    /*
    soz polindromdur yoxsa yox
     */
//  List<StringBuilder> list1 = List.of(new StringBuilder("Pakize"),new StringBuilder("alma"),new StringBuilder("ata"),new StringBuilder("level"),new StringBuilder("madam"));
//  for(StringBuilder s : list1){
//    if(s.toString().contentEquals(s.reverse())){
//      System.out.println("eded polindromdur: " + s);
//    }else {
//      System.out.println("eded polindrom deyil: " + s);
//    }
//  }
//    Scanner sc = new Scanner(System.in);
//    int deyer = sc.nextInt();
//
//    List<Integer> array = new ArrayList<>();
//    array.add(deyer + 1);
//    array.add(deyer);
//    array.add(deyer - 1);
//    int sum = 0;
//    for (Integer integer : array) {
//      sum +=integer;
//    }
//    System.out.println(sum);


//
//
//
//    Scanner sc = new Scanner(System.in);
//  int k = sc.nextInt();
//  List<Integer> array = new ArrayList<>();
//  array.add(1);
//  array.add(2);
//  array.add(3);
//  array.add(4);
//  array.add(5);
//
//  int sum = 0;
//  for(int i = 0;i<k;i++){
//    sum+=array.get(i);
//  }
//    System.out.println(sum);
//
//  for(int i = k;i<array.size();i++){
//    sum+= array.get(i);
//    sum-=array.get(i-k);
//    System.out.println(sum);
//  }

//  List<Integer> array = new ArrayList<>();
//  array.add(1);
//  array.add(2);
//  array.add(3);
//  array.add(4);
//  array.add(5);
//
//  Scanner sc = new Scanner(System.in);
//  int deyer = sc.nextInt();
//  if(deyer > array.size()) System.out.println("arrayin olcusunu kecdiniz");
//  for(int i = 0;i<array.size() - (deyer - 1);i++){
//    int count = 0;
//    for(int j = i;j<i + deyer;j++){
//      count+=array.get(j);
//    }
//    System.out.println(count);
//  }

  /*
  arrayimiz icerisinde integer ededler
  daha sonra istifadeciden eded aliriq misal ucun 3
  her elementi ozunden sonraki 2 element ile toplayiriq
  List 1,2,3,4,5 netice 6,9,12
   */



















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

//    String adad1 = "5";
//    String adad2 = "10";
//    System.out.println(adad1+adad2);
//    adad1 = adad2;
//    adad2 = adad1;
//    System.out.println(adad1);
//    System.out.println(adad2);
//    int a1 = Integer.parseInt(adad1);
//    int b1 = Integer.parseInt(adad2);
//    int c = a1+b1;
//    System.out.println(c);
//    String s = "Java";
//    String s2 = "Java";
//    System.out.println(s.equals(s2));

//    String a = "Salam"; // 35125414
//    a = "Java"; // 5125212`145214  = a
//    System.out.println(a);

//
//    HashSet<String> s1 = new HashSet<>();
//    s1.add(null);
//    System.out.println(s1);
//    try {
//      System.out.println(5 / 2);
//      System.exit(0);
//    } catch (ArithmeticException e) {
//      System.out.println(e);
//      System.exit(0);
//    } finally {
//      System.out.println("Isledim :)");
//    }


//
//    List<Integer> adsadsad = new ArrayList<>(List.of(12000, 45, 23, 456, 2000, 3000, 3, 87, 9, 2));
//    Collections.sort(adsadsad);
//    System.out.println("max:" + adsadsad.get(adsadsad.size()-1) +
//            " 2. max: " + adsadsad.get(adsadsad.size() -2));
//    int max = 0;
//    int secondMax = 0;
//    for (Integer integer : adsadsad) {
//      if (integer > max) {
//        secondMax = max;
//        max = integer;
//      }
//      else if (integer > secondMax && integer != max) {
//        secondMax = integer;
//      }
//    }
//    System.out.println(secondMax);
//    System.out.println(max);








//    List<String> adlar = new ArrayList<>();
//    adlar.add("Eli");
//    adlar.add("Veli");
//    adlar.add("Ayse");
//
//    for(String a : adlar){
//      if("Veli".equals(a)){
//       adlar.set(adlar.indexOf(a),"Veli Memmedov");
//      }
//    }



    List<String> idS = new ArrayList<>();
    idS.add("Ilkin");
    idS.add("Elminaz");
    idS.add("Seadet");
    idS.add("Murat");
    idS.add("Nurlan");
    idS.add("Pakize");
    idS.add("Pakize");
    idS.add("Pakize");
    idS.add("Pakize");
    idS.add("Baris");
    idS.add("Nicat");
    idS.add("Ilkin");
    idS.add("Ilkin");
    idS.add("Ilkin");
    idS.add("Ilkin");
    idS.add("Aynure");
    idS.add("Aynure");
    idS.add("Aynure");
    idS.add("Aynure");
    idS.add("Aynure");
    idS.add("Aynure");
    Set<String> uniqueSet = new HashSet<>();
    Set<String> notUnique = new HashSet<>();
    int dovrSayi = 0;
    for(String num : idS){
      int count = 0;
      for(String soz : idS){
        dovrSayi++;
        if(num.equals(soz)) {
          count++;
          dovrSayi++;
        }
      else if (!uniqueSet.add(num) && count > 1){
          dovrSayi++;
          break;
        }
      }
      if(count>= 5){
        notUnique.add(num);
      }
    }
    System.out.println("Dovr: " + dovrSayi);
    System.out.println("daimi musteriler: " + notUnique);
    uniqueSet.removeAll(notUnique);
    System.out.println("bir defe gelenler: " + uniqueSet);

    /*
    Tapşırıq:

Siyahıda neçə təkrar gələn (dublikat) ID olduğunu tap.

Bütün dublikat ID-ləri bir Set daxilində topla.

Orijinal siyahıdan bütün dublikatları təmizləyib, yalnız həqiqətən unikal (cəmi 1 dəfə gələn) müştəriləri saxla.

Nümunə:
Giriş: [1, 2, 3, 2, 4, 5, 1, 6]

Təkrar olunanlar: [1, 2]

Yalnız 1 dəfə gələnlər: [3, 4, 5, 6]
     */



//    for(int i = 0;i<adlar.size();i++){
//      if("Veli".equals(adlar.get(i))){
//        adlar.set(i,"Veli Memmedov");
//      }
//    }
//    Collections.sort(adlar);
//    System.out.println(adlar);



    /*
    1. "Səhvləri Düzəlt" (List Manipulation)
      Ssenari: Bir tələbə adları siyahısı (ArrayList<String>) verilib: ["Eli", "Veli",
      "Ayşe", "Eli", "Memmed", "Ayşe"].
        Tapşırıq:
        Siyahıda "Eli" adının olub-olmadığını yoxla.
        "Veli" adını "Veli Memmedov" ilə əvəz et.
        Siyahıdakı 2-ci elementi sil.
        Sonda bütün adları əlifba sırası ilə düz və çap et.
        Məqsəd: contains(), set(), remove() və Collections.sort() metodlarını mənimsəmək.
     */


  }

}






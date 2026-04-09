import com.sun.jdi.IntegerValue;
import com.sun.jdi.event.ThreadStartEvent;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
  public static void main(String[] args) {
    // character 1 symbol saxlaya bilir
//    char symbol = '\u2021';
//    System.out.println(symbol);
    /// riyazi operatorlar
    // toplama +
    // cixma -
    // vurma *
    // bolme /
    // modul %
//    System.out.println(input.nextBoolean());
////    System.out.print("bir eded daxil edin: ");
//    int num = input.nextInt();
////    System.out.println(num);
//    System.out.println(num / 100);
//    System.out.println(num / 10 % 10);
//    System.out.println(num % 10);


//    Scanner input = new Scanner(System.in);
//    Random rand = new Random();
//    Random rand = new Random();
//    int randomNumber = rand.nextInt(1,7);
//    4
//            5
//                    3
//                            4



//    int[] array = {1,2,3,4,5,6,7,8,9};
//    for(int num : array){
//      System.out.println(num);
//    }


    // 1 2



    Random rand = new Random();
    int[] guessList = new int[5];
    boolean isActive = false;
    int randomNumber = rand.nextInt(1,10);
    Scanner sc = new Scanner(System.in);
    int heal = 5;
    int count = 0;
    while(heal>0){
      int choice = sc.nextInt();
      for(int num : guessList){
        if(choice==num){
          System.out.println("bu ededi daha once daxil etmisiniz.");
          isActive=true;
          break;
        }
      }
      if(isActive){
        isActive=false;
        continue;
      }
      guessList[count]=choice;
      count++;
      if(choice==randomNumber){
        System.out.println("siz qazandiniz");
        break;
      }else {
        if(choice > randomNumber){
          System.out.println("Daha kicike eded daxil edin");
        }else {
          System.out.println("daha boyuk eded daxil edin");
        }
        heal--;
        if(heal==0){
          System.out.println("siz uduzdunuz");
          break;
        }
        System.out.println("yanlis texmin qalan haqqiniz: " + heal);
      }
    }


//    for(int i = 1;i<10;i++){
//      for(int j = 1;j<10;j++){
//        System.out.println(i + " * " + j + " = " + (i*j));
//      }
//      System.out.println("-------------------------------");
//    }



//    int x = 5;
//    System.out.println(x++ + ++x);


//    int[] numbers = {5,15,9}; int age = 15;
//    int num1 = numbers[0], num2 = numbers[1], num3 = numbers[2];
//    if(num1 > num2 && num1 > num3){
//      System.out.println(num1);
//    } else if(num2 > num1 && num2 > num3){
//      System.out.println(num2);
//    }else {
//      System.out.println(num3);
//    }

//    int num = 100;
//    int yuzluk = num / 100;
//    int onluq = num % 10;

//    int max = a ^ (a ^ b);
//    System.out.println(max); 


//    int num = 456;
//    int reverse = 0;
//    while(num>0){
//      reverse*=10;
//      reverse += num%10;
//      num/=10;
//    }
//    System.out.println(reverse);
//    BigInteger x = input.nextBigInteger();
//    String num = String.valueOf(x);
//    System.out.println(num.length() + " reqemlidir");

//    if(x == 5){
//      System.out.println("Hello");
//    }








//
//    int balance = 1000;
//    int withDraw = input.nextInt(); // 1500
//    if(balance >= withDraw && withDraw > 0){
//      balance -= withDraw;
//      System.out.println("withDraw successfully");
//    }
//    else {
//      System.out.println("processing fail");
//    }
//    System.out.println(balance);


//    int[] arr = new int[10];
//    for(int i =0; i<arr.length;i++){
//      arr[i] = input.nextInt();
//    }
//
//    System.out.println(Arrays.toString(arr));

















    // istifadecinin daxil etdiyi ededin nece elementli oldugunu oyrenmek
    // random oyun













//    String emsal = input.nextLine(); // 15 + 20
//    String[] emsalArr = emsal.split(""); // 22 ++ 15 - 15 20
//    if (emsalArr.length < 3) {
//      System.out.println(Arrays.toString(emsalArr));
//      System.out.println("duzgun daxil edilmeyib");
//    } else {
//      int num1 = Integer.parseInt(emsalArr[0]);
//      int num2 = Integer.parseInt(emsalArr[2]);
//      char op = emsalArr[1].charAt(0);
//

//      if (op == '+') {
//        System.out.println(num1 + num2);
//      } else {
//        System.out.println("operation taninmir");
//      }
//    }


















    /*
    int a = 5;
    int b = 6;
    chapda gorsenen deyer
    a = 6;
    b = 5;
     */


/* array yaradiriq int tipinden icerisine istediyiniz qeqder element elave edirsiniz
   ve if bloku ile 3 cu elementin cut olub olmadigini ekrana yazdirirsiniz
*/

    /*
    istifadeciden 2 deyer alaq ve hansinin boyuk oldugunu chapa verek
    example result 32 boyukdur 20 den
     */





    /*
    istifadeciden selsi tipinde temperaturu daxil etmesini isteyirik
    ve temperator 0 dan kicindirse soyuq boyukdurse normal 30 dan boyukdurse isti
    yazdiririq
    example
    input = 30;
    result
    chap("normal);
     */





    /*
    istifadeci bir eded daxile edir
    input = 16;
    hemen ededin uzerinde yoxlama apaririq
    3 - e qaliqsiz bolunurse 3 bolunduyunu
    4 -e qaliqsiz bolunurse 4 e bolunduyunu
    her ikisine (3,4) qaliqsiz bolunurse her ikisine bolunduyunu yazdiririq;
    hec birine bolunmurse hec birine bolunmur yazilsin
     */


    /*
    // length(); = bize textin uzunlugunu qaytarir
    // startWith(); = verilen herf ile baslayib
                      baslamdigini bildirir
                      boolean deyer qaytarir
    // toUpperCase(); = metini boyudur
    // toLowerCase(); = metini kicildir
    // subString(); = verilen araliqdaki indexi qaytarir
                      misal: String name = "Java";
                      name.subString(1,2); result = a
     */

//    int age = 19;
//    String result = age > 18 ? "Sizin yasiniz 18 den boyukdur"
//            : "yasiniz 18n den kicikdir";
//    System.out.println(result);
    // Ilkin = 5;
    // Nurlan  =6;
    // Nicat =6;
    // Aynure = 6;
    // Pakize = 6;
    // Baris =6;
    // Ulvi =5 ;
    // Elminaz = 6;'


//    String username = input.next();
//    username = username.substring(0, 1).toUpperCase() + username.substring(1).toLowerCase();
//
//    System.out.println(username);
//    String password = input.next();
//    if(username.length() > 4 && username.length() < 16 && password.length() > 8){
//      System.out.println("Register successfully");
//    }else {
//      System.out.println("invalid username or password");


//    boolean gender = input.nextBoolean();
//    System.out.println("hormetli " + name + " " + (gender ? "bey" : "xanim"));



    /*
    username ve password deyerleri alirq
    username 4 den boyuk, 16 dan kicik olmalidir ve bosluq olmamalidir
    password 8 den boyuk olmalidir

    String[] fruit = {alma,armud,nar,banan,ciyelek,limon,kivi};


     */


//    char e = input.nextLine().charAt(0);
//    int num1 = input.nextInt();
//    int num2 = input.nextInt();
//    System.out.println("seciniz\n1. toplama\n2. cixma\n3. vurma\n4. bolme");
//    int op = input.nextInt();
//    if(op == 1) {
//      System.out.println(num1+num2);
//    }else if(op == 2){
//      System.out.println(num1-num2);
//    }else if (op == 3){
//      System.out.println(num1*num2);
//    }else if(op==4){
//      if(num2 != 0){
//        System.out.println(num1/num2);
//      } else {
//        System.out.println("0 a bolme yoxdur");
//      }
//    } else {
//      System.out.println("exist");
//    }


//
//    String about = input.nextLine();
//    String[] splitAbout = about.split(" ");
//    String name = splitAbout[0];
//    String surname = splitAbout[1];
//    Integer age = Integer.parseInt(splitAbout[2]);
//
//    System.out.println(name);
//    System.out.println(surname);
//    System.out.println(age);


  }

/*
    istifadeciden aliriq
    String name
    boolean gender
    eger gender false result Female true Male
    chap
    salam hormetli Nicat bey
    salam hormetli Aynure xanim
 */


//    int[] ballar = new int[5];
//    ballar[0] = 15;

//    System.out.println(Arrays.toString(ballar));


//    if (a > 100) {
//      System.out.println("ela");
//    } else if (a > 80) {
//      System.out.println("Yaxsi");
//    } else if (a > 50) {
//      System.out.println("pis deyil");
//    } else if (a > 30) {
//      System.out.println("kafi");
//    }
//    System.out.println("kesildiniz");


}




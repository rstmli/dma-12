package old;

public class Main {

  // Baris , Aynure, Ilkin,Nicat,Elminaz
  // 1
  // old.Ulvi
  // 5
  // Pakize
  // 4


//  public void method1(){
//    System.out.println("1 ci method");
//  }
//  public void method2(){
//    method1();
//    System.out.println("2 ci method");
//  } public void method3(){
//    method2();
//    System.out.println("3 ci method");
//  }
//  public void method4(){
//    method3();
//    System.out.println("4 ci method");
//  }
//  public void method5(){
//    method4();
//    System.out.println("5 ci method");
//  }

//  public String dbUsername = "admin";
//  public String dbPassword = "12345";
//
//  public boolean checkNull(String username,String password){
//    return username == null  || password == null;
//  }
//
//  public boolean usernameAndPasswordCheckEquals(String username,String password){
//    return username.equals(dbUsername) && password.equals(dbPassword);
//  }







  /*
  Car classi
  MARKA,MODEL,releaseYear, oilType();
  example classlar
  class Mercedes() extends Car

  @Override
  oilType(){
  return model + "yanacaqla isleyir"

  class Tesla() extends Car

  @Override
  oilType(){
  return model + "elektrikle isleyir"
  }











  class Employee {
    String name;        // işçinin adı
    int age;            // yaşı
    double salary;      // maaşı
    String department;  // hansı şöbədə işləyir
}
  class Developer extends Employee {
    String programmingLanguage; // əsas istifadə etdiyi dil
    int experienceYears;        // neçə il təcrübəsi var
    String level;               // Junior, Mid, Senior
}
class Manager extends Employee {
    int teamSize;        // neçə nəfərlik komandanı idarə edir
    String projectName;  // hansı layihəyə cavabdehdir
    String level;        // Team Lead, Head və s.
}













   */















  public static void main(String[] args) {
//    old.Main main = new old.Main();
//    main.method5();





//    Scanner sc = new Scanner(System.in);
//    String username  = "";
//    String password = "";
//    String a = "";
//    String b = null;
//
//
//    if(!main.checkNull(username.trim(),password.trim()) /*&& main.usernameAndPasswordCheckEquals(username,password)*/){
//      System.out.println("success");
//    }
//    else {
//      System.out.println("in valid");
//    }




    // character 1 symbol saxlaya bilir
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







/*
    // dbUsername = "asdasfaasf";
    // dbPassword = "asfasgasgsa";

    // yoxlanislar deyerler nulldirmi, deyerler ust uste dusurmu?
    // her bir yoxlanis ferqli methodlarda olur
    // example boolean method checkNull(String username,String password);
    // method  boolean checkUsernameAndPassword(String username,String password);
*/





//    old.Person p1 = new old.Person("Huseyn", "Rustemli", 15);
//    old.Person p2 = new old.Person("Ilkin", "Eyyubov", 21);
//    old.Person p3 = new old.Person("Aynura", "Sirinova", 25);
//    old.Person p4 = new old.Person("Elminaz", "Mirelizade", 29);
//
//    old.Person[] personList = {p1, p2, p3, p4};
//    for (old.Person person : personList) {
//      if (person.age > 18) {
//        System.out.println(person);
//      }
//    }

//    Random rand = new Random();
//    int[] guessList = new int[5];
//    boolean isActive = false;
//    int randomNumber = rand.nextInt(1,10);
//    Scanner sc = new Scanner(System.in);
//    int heal = 5;
//    int count = 0;
//    while(heal>0){
//      int choice = sc.nextInt();
//      for(int num : guessList){
//        if(choice==num){
//          System.out.println("bu ededi daha once daxil etmisiniz.");
//          isActive=true;
//          break;
//        }
//      }
//      if(isActive){
//        isActive=false;
//        continue;
//      }
//      guessList[count]=choice;
//      count++;
//      if(choice==randomNumber){
//        System.out.println("siz qazandiniz");
//        break;
//      }else {
//        if(choice > randomNumber){
//          System.out.println("Daha kicike eded daxil edin");
//        }else {
//          System.out.println("daha boyuk eded daxil edin");
//        }
//        heal--;
//        if(heal==0){
//          System.out.println("siz uduzdunuz");
//          break;
//        }
//        System.out.println("yanlis texmin qalan haqqiniz: " + heal);
//      }
//    }

    // 1221
    // 121
//    int num = 121;
//
//    String result = num % 10 == num/100 ? "eded polindrom ededdir" : "eded polindrom eded deyil";
//    System.out.println(result);
//    Scanner sc = new Scanner(System.in);
//    int num = sc.nextInt();
//    int copyNum = num;
//    int reverse = 0;
//    while(num!=0){
//      reverse= reverse * 10 + num%10;
//      num/=10;
//    }
//    if(copyNum==reverse){
//      System.out.println("eded polindrom ededdir");
//    }else{
//      System.out.println("eded polindrom eded deyil");
//    }


//    BigInteger bugda = BigInteger.valueOf(1);
//    BigInteger sum = BigInteger.valueOf(0);
//    for(int i = 1; i<=64;i++){
//      sum = sum.add(bugda);
//      bugda = bugda.multiply(BigInteger.valueOf(2));
//    }
//    System.out.println(" bugda denesinin sayi: " + sum);

//    int height = sc.nextInt();
//    // hundurluk
//    for(int i = 0;i<=height;i++){
//      // bosluq
//      for(int k = 0;k<height-i;k++){
//        System.out.print(" ");
//      }
//      // ulduz
//     for(int j = 0;j<(i*2-1);j++){
//       System.out.print("*");
//     }
//      System.out.println();
//    }
//         *
//        ***
//       ****
//      *******
//     *********


    // toplam cem
//    Scanner sc = new Scanner(System.in);
//    int sum = 0;
//    int count = 0;
//    while (true) {
//      int price = sc.nextInt();
//      if(price!=0){
//        count++;
//        sum+=price;
//      }else {
//        break;
//      }
//    }
//    System.out.println("toplam mebleg: " + sum);
//    System.out.println("avg: " + sum/count);


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
    // old.Ulvi =5 ;
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

/*
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
*/


}




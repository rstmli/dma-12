package employeetask;

import java.util.Arrays;

public class Manager extends Employee {
  int teamSize;        // neçə nəfərlik komandanı idarə edir
  String projectName;  // hansı layihəyə cavabdehdir
  String level;
  public Manager(String name, int age, double salary, String department,int teamSize,String projectName,String level) {
    super(name, age, salary, department);
    this.teamSize=teamSize;
    this.projectName=projectName;
    this.level=level;


  }

  @Override
  public String toString() {
    return super.toString()+
            "teamSize=" + teamSize +
            ", projectName='" + projectName + '\'' +
            ", level='" + level + '\'' +
            "} " ;
  }
// }






























/*


public class BankAccount {
    private String accountNumber;
    private double balance;

   void withDraw(Double amount)
    void deposit(Double amount)

    }


    task 2


    public class Transaction
    void processPayment(double amount){};
    String getPaymentDetails();
    double amount;
    public class CreditCard extends Transaction{
    private String cardNumber;
    private String cardHolder;

    public class PayPal extends Transaction{
    private String email;
    example paypal processPayment in method
    System.out.println(amount + "$ pul hesabiniza kocurulur"); paypal
    System.out.println("Processing Credit Card payment of $" + amount); CC
    getPaymentDetails()
    return email + " hesabina " + amount + " qedder $ elave olundu."; paypal
    return "Credit Card Payment - Amount: $" + amount + ", Card Holder: " +
     cardHolder + ", Card Number: " + cardNumber; cc




 qarisiq sirali int arr arrayimiz var element examp {16,20,15,9,4,1,6,30,28,25}
 bu arrayin icerisinden 15 ededini tapiriq bubble sort ve
 binary search alqoritmlerinden istifade ederek

 int[] arr = {1,2,3,4};
 mid = arr[arr.length/2-1];
 target = 2
 sol = arr[0]
 sag = arr[arr.length - 1]
 if(mid == target){
 sout("eded arrayda var");
 }
 else if(target > sol{
 sol = mid + 1;
 } else{
 sag = mid - 1;

 */


  public static void main(String[] args) {
    int[] arr = {5,3,6,2,1};
    for(int i = 0;i<arr.length - 1;i++){
      for(int j = 0;j<arr.length - i - 1;j++){
        if(arr[j] > arr[j+1]){
          int temp = arr[j];
          arr[j] = arr[j+ 1];
          arr[j+1] = temp;
        }

      }
    }

    System.out.println(Arrays.toString(arr));

  }

















































  }
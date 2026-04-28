package banktask;

public class Main {

  public static void main(String[] args) {
    Bank bank = new Bank(1500);
    bank.deposit(100.0);
    bank.deposit(500.0);
    bank.deposit(-100.0);
    bank.withDraw(1400.0);
    bank.withDraw(300.0);
    bank.withDraw(-500.0);
    bank.withDraw(1000.0);

    System.out.println("ugurlu transaction");
    for(String s : bank.getTransaction()){
      System.out.println(s);
    }
    System.out.println("ugursuz transaction");
    for(String s : bank.getFailedTransaction()){
      System.err.println(s);
    }




  }



}

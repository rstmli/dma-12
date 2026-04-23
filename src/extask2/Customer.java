package extask2;

public class Customer {
  String name, surname;
  double totalBuys;
  static double totalCustomerBuys = 10000;


  public Customer(String name, String surname, double totalBuys) {
    this.name = name;
    this.surname = surname;
    this.totalBuys = totalBuys;
    totalCustomerBuys = totalCustomerBuys - totalBuys;
    checkCustomerBuys();
  }

  public void checkCustomerBuys() {
    if (totalCustomerBuys < 0) throw new TotalBuyException("total alis limitini asdiniz");
    System.out.println(name + " ettiyiniz toplam alisveris deyeri: " + totalBuys);
    System.out.println("hele alina bilecek mehsullarin qiymeti: " + totalCustomerBuys);
  }


}

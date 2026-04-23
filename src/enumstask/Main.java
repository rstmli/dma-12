package enumstask;

public class Main {
  public static void main(String[] args) {
//    Car car1 = new Car("BMW", "M3", "RE");
//    Car car2 = new Car("Mercedes", "C200", "RE");
//    Car car3 = new Car("Toyota", "Corolla", "RED");
    Car car4 = new Car("BMW", "X5", Color.BLUE);
    Car car5 = new Car("Mercedes", "E300", Color.RED);
    Car car6 = new Car("Toyota", "Camry", Color.YELLOW);
    Car car7 = new Car("BMW", "M5", Color.BLACK);
    Car car8 = new Car("Mercedes", "S500", Color.WHITE);
    Car car9 = new Car("Toyota", "RAV4", Color.RED);
    Car car10 = new Car("BMW", "i8", Color.BLUE);


    Car[] cars = {/*car1,car2,car3,*/car4,car5,car6,car7,car8,car9,car10};
    for (Car car : cars) {
      if(car.color.equals(Color.RED)){
        System.out.println(car);
      }
    }
  }
}

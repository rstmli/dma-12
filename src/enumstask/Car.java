package enumstask;

public class Car {
  String brand;
  String model;
  Color color;

  @Override
  public String toString() {
    return "enumstask.Car{" +
            "brand='" + brand + '\'' +
            ", model='" + model + '\'' +
            ", color=" + color.getValue() +
            '}';
  }

  public Car(String brand, String model, Color color) {
    this.brand = brand;
    this.model = model;
    this.color = color;
  }
}


/*
  bank app
  bank class
  cardHolder;
  cardNumber;
  balance;

  methodlar
  bir user diger usere pul transferi edir
  yoxlanis kifayet qeder balans varmi yoxdursa exception
 */
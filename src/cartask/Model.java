package cartask;

import java.time.LocalDate;

public class Model {
  String model;
  LocalDate releaseDate;
  double price;

  @Override
  public String toString() {
    return "Model{" +
            "model='" + model + '\'' +
            ", releaseDate=" + releaseDate +
            ", price=" + price +
            '}';
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public LocalDate getReleaseDate() {
    return releaseDate;
  }

  public void setReleaseDate(LocalDate releaseDate) {
    this.releaseDate = releaseDate;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public Model(String model, LocalDate releaseDate, double price) {
    this.model = model;
    this.releaseDate = releaseDate;
    this.price = price;
  }
}

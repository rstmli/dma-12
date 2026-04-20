package cartask;

import java.time.LocalDate;
import java.util.Arrays;

public class Marka {
  String name;
  LocalDate createdDate;
  Model[] models;

  public Marka(String name, LocalDate createdDate, Model[] models) {
    this.name = name;
    this.createdDate = createdDate;
    this.models = models;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public LocalDate getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(LocalDate createdDate) {
    this.createdDate = createdDate;
  }

  public Model[] getModels() {
    return models;
  }

  public void setModels(Model[] models) {
    this.models = models;
  }

  @Override
  public String toString() {
    return "Marka{" +
            "name='" + name + '\'' +
            ", createdDate=" + createdDate +
            ", models=" + Arrays.toString(models) +
            '}';
  }
}

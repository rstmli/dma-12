package studentsubjectacademy;

public class Subject {
  String name;
  int grade;
  int totalHour;

  public Subject(String name, int grade, int totalHour) {
    this.name = name;
    this.grade = grade;
    this.totalHour = totalHour;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getGrade() {
    return grade;
  }

  public void setGrade(int grade) {
    this.grade = grade;
  }

  public int getTotalHour() {
    return totalHour;
  }

  public void setTotalHour(int totalHour) {
    this.totalHour = totalHour;
  }

  @Override
  public String toString() {
    return "studentsubjectacademy.Subject{" +
            "name='" + name + '\'' +
            ", grade=" + grade +
            ", totalHour=" + totalHour +
            '}';
  }
}



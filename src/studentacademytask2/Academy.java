package studentacademytask2;

import java.util.ArrayList;
import java.util.List;

public class Academy {
  String academyName;
  List<Student> students = new ArrayList<>();

  public String getAcademyName() {
    return academyName;
  }

  public void setAcademyName(String academyName) {
    this.academyName = academyName;
  }

  public List<Student> getStudents() {
    return students;
  }

  public void setStudents(List<Student> students) {
    this.students = students;
  }

  public Academy(String academyName) {
    this.academyName = academyName;
  }

  @Override
  public String toString() {
    return "Academy{" +
            "academyName='" + academyName + '\'' +
            ", students=" + students +
            '}';
  }
}

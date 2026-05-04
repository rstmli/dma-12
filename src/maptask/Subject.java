package maptask;

public class Subject{
  private String subjectName;
  private Double subjectGrade;

  public Subject(String subjectName, Double subjectGrade) {
    this.subjectName = subjectName;
    this.subjectGrade = subjectGrade;
  }

  public String getSubjectName() {
    return subjectName;
  }

  public void setSubjectName(String subjectName) {
    this.subjectName = subjectName;
  }

  public Double getSubjectGrade() {
    return subjectGrade;
  }

  public void setSubjectGrade(Double subjectGrade) {
    this.subjectGrade = subjectGrade;
  }
}

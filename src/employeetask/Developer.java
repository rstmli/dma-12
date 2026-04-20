package employeetask;

public class Developer extends Employee{

  String programmingLanguage; // əsas istifadə etdiyi dil
  int experienceYears;        // neçə il təcrübəsi var
  String level;


  public Developer(String name, int age, double salary, String department,String pL,int expYear,String level) {
    super(name, age, salary, department);
    programmingLanguage=pL;
    experienceYears = expYear;
    this.level=level;
  }

  @Override
  public String toString() {
    return super.toString() +
            "programmingLanguage='" + programmingLanguage + '\'' +
            ", experienceYears=" + experienceYears +
            ", level='" + level + '\'' +
            "} ";
  }
}

package studentacademytask2;

import java.util.List;

public class Main {
  public static void main(String[] args) {
    Student s1 = new Student("Murat","Shahbazov", List.of("Java","GO","RUST"));
    Student s2 = new Student("Ilkin","Eyyubov", List.of("Java","GO","RUBY"));
    Student s3 = new Student("Pakize","Hasanli", List.of("Java","PYTHON","RUBY"));
    Academy a1 = new Academy("Jet");
    Academy a2 = new Academy("CODE");
    a1.setStudents(List.of(s1,s3));
    a2.setStudents(List.of(s2));

    for(Academy a : List.of(a1,a2)){
      System.out.println(a.academyName);
      for(Student s : a.getStudents()){
        System.out.println(s.getName() + " " + s.getSurname());
        for(String p : s.pL){
          System.out.print(p + " ");
        }
        System.out.println();
      }
    }
  }
}

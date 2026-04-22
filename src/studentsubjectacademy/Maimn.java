package studentsubjectacademy;

import java.util.Arrays;

public class Maimn {
  public static void main(String[] args) {

    Academy[] academies = new Academy[]{
            new Academy("Jet",
                    new Student[]{
                            new Student("Elminaz", "Mirzalizade", 29, 2,
                                    new Subject[]{
                                            new Subject("Programlasdirma", 100, 273),
                                            new Subject("Riyaziyyat", 95, 250)
                                    }),
                            new Student("Ali", "Huseynov", 20, 1,
                                    new Subject[]{
                                            new Subject("Programlasdirma", 85, 200),
                                            new Subject("Riyaziyyat", 90, 220)
                                    }),
                            new Student("Nigar", "Aliyeva", 21, 2,
                                    new Subject[]{
                                            new Subject("Programlasdirma", 88, 210),
                                            new Subject("Riyaziyyat", 92, 230)
                                    })
                    }),

            new Academy("CodeLand",
                    new Student[]{
                            new Student("Rauf", "Mammadov", 22, 3,
                                    new Subject[]{
                                            new Subject("Programlasdirma", 75, 180),
                                            new Subject("Riyaziyyat", 80, 190)
                                    }),
                            new Student("Aysel", "Quliyeva", 23, 1,
                                    new Subject[]{
                                            new Subject("Programlasdirma", 91, 240),
                                            new Subject("Riyaziyyat", 89, 210)
                                    }),
                            new Student("Tural", "Ismayilov", 24, 2,
                                    new Subject[]{
                                            new Subject("Programlasdirma", 15, 200),
                                            new Subject("Riyaziyyat", 85, 205)
                                    }),
                            new Student("Leyla", "Hasanova", 22, 1,
                                    new Subject[]{
                                            new Subject("Programlasdirma", 93, 250),
                                            new Subject("Riyaziyyat", 94, 260)
                                    })
                    }),

            new Academy("TechAcademy",
                    new Student[]{
                            new Student("Kamran", "Abbasov", 26, 3,
                                    new Subject[]{
                                            new Subject("Programlasdirma", 24, 210),
                                            new Subject("Riyaziyyat", 87, 220)
                                    }),
                            new Student("Sabina", "Rahimova", 25, 2,
                                    new Subject[]{
                                            new Subject("Programlasdirma", 90, 230),
                                            new Subject("Riyaziyyat", 88, 215)
                                    }),
                            new Student("Orxan", "Kerimov", 27, 1,
                                    new Subject[]{
                                            new Subject("Programlasdirma", 45, 195),
                                            new Subject("Riyaziyyat", 20, 200)
                                    })
                    })
    };

//    for (Academy academy : academies) {
//      System.out.println(academy.getName());
//      for(Student s : academy.getStudents()){
//        System.out.printf("telebe: %s %s %s %n",s.getName(),s.getSurname(),s.getAge());
//        for(Subject sub : s.getSubjects()){
//          System.out.printf("fen: %s bal %s saat %s\n",sub.getName(),sub.getGrade(),sub.getTotalHour());
//        }
//      }
//    }

//    for (Academy academy : academies) {
//      if(academy.getStudents().length> 3){
//        System.out.println(academy.getName());
//      }
//    }
//    for (Academy academy : academies) {
//      String name = "";
//      int count = 0;
//      Subject[] fens = new Subject[sum];
//
//      for (Student student : academy.getStudents()) {
//        for (Subject sub : student.getSubjects()) {
//          if (sub.getGrade() < 50) {
//            name = student.getName();
//            if (sub.getName() == null) {
//              continue;
//            }
//            fens[count] = new Subject(sub.getName(), sub.getGrade(), sub.totalHour);
//            count++;
////            System.out.println(student.getName());
////            System.out.println(" kesildiniz fen, " + sub.getName() + " " + sub.getGrade());
//          }
//        }
//      }
//      if (count > 0) {
//        for (Subject fen : fens) {
//
//          if (fen != null && fen.getName() != null) {
//            System.out.printf("%s kesildiyiniz fenler\n", name);
//            System.out.println(fen.getName() + " " + fen.getGrade() + " " + fen.getTotalHour());
//          }
//        }
//      }
//    }

    for (Academy academy : academies) {
      for (Student student : academy.getStudents()) {

        Subject[] failed = new Subject[student.getSubjects().length];
        int count = 0;

        for (Subject sub : student.getSubjects()) {
          if (sub.getGrade() < 50) {
            failed[count] = sub;
            count++;
          }
        }

        if (count > 0) {
          System.out.printf("%s kesildiyiniz fenler\n", student.getName());

          for (int i = 0; i < count; i++) {
            Subject f = failed[i];
            System.out.println(f.getName() + " " + f.getGrade() + " " + f.getTotalHour());
          }
        }
      }
    }



  }
}

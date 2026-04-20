//package employeetask;
//
//
//public class old.Main {
//  public static void main(String[] args) {
//    Employee developer1 = new Developer("Nurlan", 26, 2500, "IT", "QA tester", 2, "Middle");
//
//    Employee developer2 = new Developer("Aysel", 24, 2200, "IT", "Frontend Developer", 1, "Junior");
//
//    Employee developer3 = new Developer("Kamran", 30, 4000, "IT", "Backend Developer", 6, "Senior");
//
//    Employee developer4 = new Developer("Leyla", 28, 3200, "IT", "Fullstack Developer", 4, "Middle");
//
//    Employee developer5 = new Developer("Tural", 35, 5000, "IT", "DevOps Engineer", 8, "Senior");
//
//
//    Employee manager1 = new Manager("Pakize", 28, 3000, "PM", 10, "CRM", "Middle");
//
//    Employee manager2 = new Manager("Rauf", 35, 4500, "PM", 15, "ERP", "Senior");
//
//    Employee manager3 = new Manager("Aysu" 32, 3800, "PM", 8, "Recruitment System", "Middle");
//
//    Employee manager4 = new Manager("Elvin", 40, 5500, "PM", 20, "Logistics Platform", "Senior");
//
//    Employee manager5 = new Manager("Nigar", 29, 3200, "PM", 6, "Digital Campaign", "Junior");
//
//
//    Employee[] employees = {developer1,developer2,developer3,developer4,developer5,manager1,manager2,manager3,manager4,manager5};
//
//    for (Employee employee : employees) {
//      if(employee.getDepartment().equals("IT")){
//        employee.setSalary(employee.getSalary() + employee.getSalary()*0.1);
//      }
//    }
//
//
//    for (Employee employee : employees) {
//      System.out.println(employee);
//    }
//
//
//
//  }
//}

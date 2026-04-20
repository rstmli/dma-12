package switchanddowhile;

public class Child {
  String name;
  String surname;
  int age;

  public Child(String name, String surname, int age) {
    this.name = name;
    this.surname = surname;
    this.age = age;
  }

  @Override
  public String toString() {
    return "Child{" +
            "name='" + name + '\'' +
            ", surname='" + surname + '\'' +
            ", age=" + age +
            '}';
  }
}



/*
// book classimiz var
// icerisinde field title,pageSize,price
 Libraray classimiz var
 icerisinde fields name, Book[] books = new Book[5];

 library icerisinde setBooks(Book book) cagrildiqca yeni kitablar elave olunur

 meselen book b1 = new book("Cerpeleng","200","10.99");
library l1 = new library "Menim kitabxanam);
  l1.setBooks(b1);
  sout  l1



 */

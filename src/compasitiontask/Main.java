package compasitiontask;
public class Main {
  public static void main(String[] args) {
    Library l1 = new Library("Elminazin kitabxanasi");
    Book b1 = new Book("Cerpeleng",200,10.99);
    Book b2 = new Book("Karantin",180,9.99);
    Book b3 = new Book("Karamazov qardaslar",150,8.99);
    l1.setBooks(1,b1);
    l1.setBooks(2,b2);
    l1.setBooks(3,b3);
    l1.getBooks();
  }
}
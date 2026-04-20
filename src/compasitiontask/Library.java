package compasitiontask;

import java.util.Arrays;

public class Library {
  private String name;
  private Book[] books = new Book[5];

  public Library(String name) {
    this.name = name;
  }

  public void setBooks(int refNumber,Book book) {
    this.books[refNumber - 1] = book;
  }
  public void getBooks(){
    System.out.println(name);
    for(Book b : books){
      if(b == null){
        System.out.println("Ref bosdur");
        continue;
      }
      System.out.println(b);

    }
  }

  @Override
  public String toString() {
    return "compasitiontask.Library{" +
            "name='" + name + '\'' +
            ", books=" + Arrays.toString(books) +
            '}';
  }
}

package compasitiontask;

public class Book {
  String title;
  int pageSize;
  double price;

  @Override
  public String toString() {
    return "compasitiontask.Book{" +
            "title='" + title + '\'' +
            ", pageSize=" + pageSize +
            ", price=" + price +
            '}';
  }

  public Book(String title, int pageSize, double price) {
    this.title = title;
    this.pageSize = pageSize;
    this.price = price;
  }
}

import java.awt.print.Book;
import java.util.ArrayList;

public class Library {
  ArrayList<Book> books;

  Library() {
    this.books = new ArrayList<>();
  }

  public int bookCount() {
    return this.books.size();
  }
}

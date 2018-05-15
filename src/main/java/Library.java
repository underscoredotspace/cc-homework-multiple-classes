import java.util.ArrayList;

public class Library {
  private ArrayList<Book> books;

  Library() {
    this.books = new ArrayList<>();
  }

  public int bookCount() {
    return this.books.size();
  }

  public void addBook(Book book) {
    this.books.add(book);
  }
}

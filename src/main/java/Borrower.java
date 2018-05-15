import java.util.ArrayList;

public class Borrower {
  private ArrayList<Book> books;

  Borrower() {
    this.books = new ArrayList<>();
  }

  public int bookCount() {
    return this.books.size();
  }

  public void addBook(Book book) {
    this.books.add(book);
  }

  public void borrowBookFrom(Library library) {
    this.addBook(library.removeBook());
  }
}

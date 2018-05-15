import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {
  private Borrower borrower;
  private Book book;
  private Library library;

  @Before
  public void before() {
    borrower = new Borrower();
    book = new Book();
    library = new Library(3);
  }

  @Test
  public void borrowerStartsWithNoBooks() {
    assertEquals(0, borrower.bookCount());
  }

  @Test
  public void canAddBookToBorrower() {
    borrower.addBook(book);
  }

  @Test
  public void canTakeBookFromLibrary() {
    library.addBook(book);
    borrower.borrowBookFrom(library);
    assertEquals(1, borrower.bookCount());
    assertEquals(0, library.bookCount());
  }

}

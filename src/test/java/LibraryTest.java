import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
  Library library;
  Book book;

  @Before
  public void before() {
    library = new Library(3);
    book = new Book();
  }

  @Test
  public void libraryStartsWithNoBooks() {
    assertEquals(0, library.bookCount());
  }

  @Test
  public void canAddBookToLibrary() {
    library.addBook(book);
    assertEquals(1, library.bookCount());
  }

  @Test
  public void cannotAddBookToLibraryBecauseFull() {
    library.addBook(book);
    library.addBook(book);
    library.addBook(book);
    library.addBook(book);
    assertEquals(3, library.bookCount());
  }
}

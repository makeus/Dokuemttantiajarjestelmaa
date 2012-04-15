package References;

import Data_Access.FileManager;
import java.util.ArrayList;
import java.util.List;
import org.junit.*;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class BooksTest {

    Books books;
    FileManager filemanagermock;

    public BooksTest() {
    }

    @Before
    public void setUp() {
        filemanagermock = mock(FileManager.class);
        books = new Books(filemanagermock);
    }

    @Test
    public void testAddArticle() {
        Book book = new Book("BA04", "Extreme Programming Explained: Embrace Change (2nd Edition)", "L. S. Vygotsky", 1978, "Harvard University Press");
        books.addBook("BA04", "Extreme Programming Explained: Embrace Change (2nd Edition)", "L. S. Vygotsky", 1978, "Harvard University Press");

        assertEquals(books.getBooks().get(0).getBibtex(), book.getBibtex());

    }

    @Test
    public void testAddMultipleArticles() {
        List<Book> expected = new ArrayList<Book>();
        Book book1 = new Book("BA04", "Extreme Programming Explained: Embrace Change (2nd Edition)", "L. S. Vygotsky", 1978, "Harvard University Press");
        Book book2 = new Book("BA04a", "Extreme Programming Explained: Embrace Change (2nd Edition)", "L. S. Vygotsky", 1978, "Harvard University Press");


        expected.add(book1);
        books.addBook("BA04", "Extreme Programming Explained: Embrace Change (2nd Edition)", "L. S. Vygotsky", 1978, "Harvard University Press");
        expected.add(book2);
        books.addBook("BA04a", "Extreme Programming Explained: Embrace Change (2nd Edition)", "L. S. Vygotsky", 1978, "Harvard University Press");

        assertEquals(expected.get(0).getBibtex(), books.getBooks().get(0).getBibtex());
        assertEquals(expected.get(1).getBibtex(), books.getBooks().get(1).getBibtex());

    }

    @Test
    public void testGetFileArticles() {
        when(filemanagermock.isOpen()).thenReturn(true);
        books.getBooks();
        verify(filemanagermock).getBooks();
    }

    @Test
    public void testGetArticles() {
        when(filemanagermock.isOpen()).thenReturn(true);
        Book book1 = new Book("BA04", "Extreme Programming Explained: Embrace Change (2nd Edition)", "L. S. Vygotsky", 1978, "Harvard University Press");
        List<Book> list = new ArrayList<Book>();
        list.add(book1);
        when(filemanagermock.getBooks()).thenReturn(list);

        assertEquals(list, books.getBooks());
    }

    @Test
    public void testGetArticles2() {
        when(filemanagermock.isOpen()).thenReturn(true);
        Book book1 = new Book("BA04", "Extreme Programming Explained: Embrace Change (2nd Edition)", "L. S. Vygotsky", 1978, "Harvard University Press");
        Book book2 = new Book("BA04a", "Extreme Programming Explained: Embrace Change (2nd Edition)", "L. S. Vygotsky", 1978, "Harvard University Press");

        List<Book> list = new ArrayList<Book>();
        list.add(book1);
        when(filemanagermock.getBooks()).thenReturn(list);
        books.addBook("BA04a", "Extreme Programming Explained: Embrace Change (2nd Edition)", "L. S. Vygotsky", 1978, "Harvard University Press");

        List<Book> expected = new ArrayList<Book>();
        expected.add(book2);
        expected.add(book1);

        assertEquals(expected.get(0).getBibtex(), books.getBooks().get(0).getBibtex());
        assertEquals(expected.get(1).getBibtex(), books.getBooks().get(1).getBibtex());

    }

    @Test
    public void testDontaddSame() {
        when(filemanagermock.isOpen()).thenReturn(true);
        Book book1 = new Book("BA04", "Extreme Programming Explained: Embrace Change (2nd Edition)", "L. S. Vygotsky", 1978, "Harvard University Press");
        List<Book> list = new ArrayList<Book>();
        list.add(book1);
        when(filemanagermock.getBooks()).thenReturn(list);
        books.addBook("BA04", "Extreme Programming Explained: Embrace Change (2nd Edition)", "L. S. Vygotsky", 1978, "Harvard University Press");

        assertEquals(1, books.getBooks().size());
    }
}
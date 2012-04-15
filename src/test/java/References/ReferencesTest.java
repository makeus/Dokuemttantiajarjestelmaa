package References;

import References.References;
import References.Article;
import References.Articles;
import Data_Access.FileManager;
import References.Reference;
import java.util.ArrayList;
import java.util.List;
import org.junit.*;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class ReferencesTest {

    References references;
    Articles articlesmock;
    Books booksmock;
    Inproceedings inproceedingsmock;
    FileManager filemanagermock;

    @Before
    public void setUp() {
        articlesmock = mock(Articles.class);
        booksmock = mock(Books.class);
        inproceedingsmock = mock(Inproceedings.class);
        filemanagermock = mock(FileManager.class);
        references = new References(filemanagermock, articlesmock, booksmock, inproceedingsmock);
    }

    @Test
    public void testAddArticle() {
        references.addArticle("asd", "Infusing active learning into introductory programming courses", "Whittington, Keith J", "J. Comput. Small Coll", 19, 5, 2004, "249--259", "Consortium for..", "USA");
        verify(articlesmock).addArticle(eq("asd"), eq("Infusing active learning into introductory programming courses"), eq("Whittington, Keith J"), eq("J. Comput. Small Coll"), eq(19), eq(5), eq(2004), eq("249--259"), eq("Consortium for.."), eq("USA"));
    }

    @Test
    public void testAddBook() {
        references.addBook("BA04", "Extreme Programming Explained: Embrace Change (2nd Edition)", "L. S. Vygotsky", 1978, "Harvard University Press");
        verify(booksmock).addBook(eq("BA04"), eq("Extreme Programming Explained: Embrace Change (2nd Edition)"), eq("L. S. Vygotsky"), eq(1978), eq("Harvard University Press"));
    }

    @Test
    public void testAddInproceeding() {
        references.addInproceeding("PSMM07", "A survey of literature on the teaching of introductory programming", "Pears, Arnold and Seidman", 2007, "ACM", "ITiCSE-WGR '07: Working group reports on ITiCSE on Innovation and technology in computer science education", "204--223");
        verify(inproceedingsmock).addInproceeding(eq("PSMM07"), eq("A survey of literature on the teaching of introductory programming"), eq("Pears, Arnold and Seidman"), eq(2007), eq("ACM"), eq("ITiCSE-WGR '07: Working group reports on ITiCSE on Innovation and technology in computer science education"), eq("204--223"));
    }

    @Test
    public void testGetArticles() {
        references.getArticles();
        verify(articlesmock).getArticles();
    }

    @Test
    public void testGetArticles2() {
        List<Article> list = new ArrayList<Article>();
        Article article1 = new Article("WO4", "Infusing active learning into introductory programming courses", "Whittington, Keith J", "J. Comput. Small Coll", 19, 5, 2004, "249--259", "Consortium for..", "USA");
        list.add(article1);
        when(articlesmock.getArticles()).thenReturn(list);
        assertEquals(list, references.getArticles());
    }

    @Test
    public void testGetArticles3() {
        List<Article> list = new ArrayList<Article>();
        when(articlesmock.getArticles()).thenReturn(list);
        assertTrue(references.getArticles().isEmpty());
    }

    @Test
    public void testGetBooks() {
        references.getBooks();
        verify(booksmock).getBooks();
    }

    @Test
    public void testGetBooks2() {
        List<Book> list = new ArrayList<Book>();
        Book book1 = new Book("BA04", "Extreme Programming Explained: Embrace Change (2nd Edition)", "L. S. Vygotsky", 1978, "Harvard University Press");
        list.add(book1);
        when(booksmock.getBooks()).thenReturn(list);
        assertEquals(list, references.getBooks());
    }

    @Test
    public void testGetBooks3() {
        List<Book> list = new ArrayList<Book>();
        when(booksmock.getBooks()).thenReturn(list);
        assertTrue(references.getBooks().isEmpty());
    }

    @Test
    public void testGetInproceedings() {
        references.getInproceeding();
        verify(inproceedingsmock).getInproceedings();
    }

    @Test
    public void testGetInproceedings2() {
        List<Inproceeding> list = new ArrayList<Inproceeding>();
        Inproceeding inproceeding1 = new Inproceeding("PSMM07", "A survey of literature on the teaching of introductory programming", "Pears, Arnold and Seidman, Stephen and Malmi, Lauri and Mannila, Linda and Adams, Elizabeth and Bennedsen, Jens and Devlin, Marie and Paterson, James", 2007, "ACM", "ITiCSE-WGR '07: Working group reports on ITiCSE on Innovation and technology in computer science education", "204--223");
        list.add(inproceeding1);
        when(inproceedingsmock.getInproceedings()).thenReturn(list);
        assertEquals(list, references.getInproceeding());
    }

    @Test
    public void testGetInproceedingss3() {
        List<Inproceeding> list = new ArrayList<Inproceeding>();
        when(inproceedingsmock.getInproceedings()).thenReturn(list);
        assertTrue(references.getInproceeding().isEmpty());
    }

    @Test
    public void testGetReferences() {
        references.getReferences();
        verify(articlesmock).getArticles();
    }

    @Test
    public void testGetReferences2() {
        List<Article> list = new ArrayList<Article>();
        Article article1 = new Article("WO4", "Infusing active learning into introductory programming courses", "Whittington, Keith J", "J. Comput. Small Coll", 19, 5, 2004, "249--259", "Consortium for..", "USA");
        list.add(article1);
        when(articlesmock.getArticles()).thenReturn(list);

        assertEquals(article1.getKeyword(), references.getReferences().get(0).getKeyword());
    }

    @Test
    public void testGetReferences3() {
        List<Article> list = new ArrayList<Article>();
        when(articlesmock.getArticles()).thenReturn(list);

        assertTrue(references.getReferences().isEmpty());
    }

    @Test
    public void testopenFile() {
        String filename = "asd.bib";
        references.openFile(filename);
        verify(filemanagermock).openFile(eq(filename));
    }

    @Test
    public void testcreateFile() {
        String filename = "asd.bib";
        references.createFile(filename);
        verify(filemanagermock).createFile(eq(filename));
    }

    @Test
    public void testSaveFile() {
        references.saveFile();
        verify(filemanagermock).saveFile(anyList());
    }

    @Test
    public void testsaveAs() {
        String filename = "asd.bib";
        references.saveAs(filename);
        verify(filemanagermock).saveAs(anyList(), eq(filename));
    }
}

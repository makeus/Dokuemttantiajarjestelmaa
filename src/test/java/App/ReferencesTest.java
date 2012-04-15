package App;

import References.References;
import Articles.Article;
import Articles.Articles;
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
    FileManager filemanagermock;

    @Before
    public void setUp() {
        articlesmock = mock(Articles.class);
        filemanagermock = mock(FileManager.class);
        references = new References(filemanagermock, articlesmock);
    }

    @Test
    public void testAddArticle() {
        Article article = new Article("asd", "Infusing active learning into introductory programming courses", "Whittington, Keith J", "J. Comput. Small Coll", 19, 5, 2004, "249--259", "Consortium for..", "USA");
        references.addArticle(article);
        verify(articlesmock).addArticle(article);
    }

    @Test
    public void testAddArticle2() {
        Article articlemock = mock(Article.class);
        references.addArticle(articlemock);
        verify(articlesmock).addArticle(articlemock);
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

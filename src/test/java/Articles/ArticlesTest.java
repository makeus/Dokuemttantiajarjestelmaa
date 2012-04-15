package Articles;

import Data_Access.FileManager;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;

public class ArticlesTest {

    Articles articles;
    FileManager filemanagermock;

    @Before
    public void setUp() {
        filemanagermock = mock(FileManager.class);
        articles = new Articles(filemanagermock);
    }

    @Test
    public void testAddArticle() {
        Article article = new Article("W04", "Infusing active learning into introductory programming courses", "Whittington, Keith J", "J. Comput. Small Coll", 19, 5, 2004, "249--259", "Consortium for..", "USA");
        articles.addArticle(article);

        assertEquals(articles.getArticles().get(0), article);

    }

    @Test
    public void testAddMultipleArticles() {
        List<Article> expected = new ArrayList<Article>();
        Article article1 = new Article("WO4", "Infusing active learning into introductory programming courses", "Whittington, Keith J", "J. Comput. Small Coll", 19, 5, 2004, "249--259", "Consortium for..", "USA");
        Article article2 = new Article("WO4a", "Infusing active ", "Whittington, Keith J", "J. Comput. Small Coll", 19, 5, 2004, "249--259", "Consortium for..", "USA");

        expected.add(article1);
        articles.addArticle(article1);
        expected.add(article2);
        articles.addArticle(article2);

        assertEquals(articles.getArticles(), expected);

    }

    @Test
    public void testGetFileArticles() {
        when(filemanagermock.isOpen()).thenReturn(true);
        articles.getArticles();
        verify(filemanagermock).getArticles();
    }

    @Test
    public void testGetArticles() {
        when(filemanagermock.isOpen()).thenReturn(true);
        Article article1 = new Article("WO4", "Infusing active learning into introductory programming courses", "Whittington, Keith J", "J. Comput. Small Coll", 19, 5, 2004, "249--259", "Consortium for..", "USA");
        List<Article> list = new ArrayList<Article>();
        list.add(article1);
        when(filemanagermock.getArticles()).thenReturn(list);

        assertEquals(list, articles.getArticles());
    }

    @Test
    public void testGetArticles2() {
        when(filemanagermock.isOpen()).thenReturn(true);
        Article article1 = new Article("WO4", "Infusing active learning into introductory programming courses", "Whittington, Keith J", "J. Comput. Small Coll", 19, 5, 2004, "249--259", "Consortium for..", "USA");
        Article article2 = new Article("WO4a", "Infusing active ", "Whittington, Keith J", "J. Comput. Small Coll", 19, 5, 2004, "249--259", "Consortium for..", "USA");

        List<Article> list = new ArrayList<Article>();
        list.add(article1);
        when(filemanagermock.getArticles()).thenReturn(list);
        articles.addArticle(article2);
        
        List<Article> expected = new ArrayList<Article>();
        expected.add(article2);
        expected.add(article1);
        
        assertEquals(expected, articles.getArticles());
    }

    @Test
    public void testDontaddSame() {
        when(filemanagermock.isOpen()).thenReturn(true);
        Article article1 = new Article("WO4", "Infusing active learning into introductory programming courses", "Whittington, Keith J", "J. Comput. Small Coll", 19, 5, 2004, "249--259", "Consortium for..", "USA");
        List<Article> list = new ArrayList<Article>();
        list.add(article1);
        when(filemanagermock.getArticles()).thenReturn(list);
        articles.addArticle(article1);

        assertEquals(1, articles.getArticles().size());
    }
}

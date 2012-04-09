package App;

import Articles.Article;
import Articles.Articles;
import java.util.List;
import org.junit.*;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class ReferencesTest {

    References references;
    Articles articlesmock;

    @Before
    public void setUp() {
        articlesmock = mock(Articles.class);
        references = new References(articlesmock);
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
}

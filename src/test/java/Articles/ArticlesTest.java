package Articles;

import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;


public class ArticlesTest{
    
    Articles articles;
    
    @Before
    public void setUp() {
        articles = new Articles();
    }

    @Test
    public void testAddArticle() {
        Article article = new Article("Infusing active learning into introductory programming courses", "Whittington, Keith J", "J. Comput. Small Coll", 19, 5, 2004, "249--259", "Consortium for..", "USA" );
        articles.addArticle(article);
        
        assertEquals(articles.getArticles().get(0), article);
        
    }
    
    @Test
    public void testAddMultipleArticles(){
        List<Article> expected = new ArrayList<Article>();
        Article article1 = new Article("Infusing active learning into introductory programming courses", "Whittington, Keith J", "J. Comput. Small Coll", 19, 5, 2004, "249--259", "Consortium for..", "USA" );
        Article article2 = new Article("Infusing active ", "Whittington, Keith J", "J. Comput. Small Coll", 19, 5, 2004, "249--259", "Consortium for..", "USA" );
        
        expected.add(article1);
        articles.addArticle(article1);
        expected.add(article2);
        articles.addArticle(article2);
        
        assertEquals(articles.getArticles(), expected);
        
    }
}

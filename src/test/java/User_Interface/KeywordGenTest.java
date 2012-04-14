package User_Interface;

import Articles.Article;
import Articles.Articles;
import References.References;
import java.util.ArrayList;
import java.util.List;
import org.junit.*;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import sun.invoke.empty.Empty;

public class KeywordGenTest {

    KeywordGen keywordgen;
    References reference;

    public KeywordGenTest() {
    }

    @Before
    public void setUp() {
        reference = mock(References.class);
        keywordgen = new KeywordGen(reference);
    }

    @Test
    public void testGenerateKeyword() {
        String[] lNames = {"Meikäläinen", "Virtanen"};
        int year = 2012;      
        List<Object> list = new ArrayList<Object>();
        when(reference.getReferences()).thenReturn(list);      
        String keyword = keywordgen.generateKeyword(lNames, year);
        System.out.println(keyword);
        assertEquals("MV12", keywordgen.generateKeyword(lNames, year));
        
    }
    @Test
    public void testGenerateKeywordTaken() {
        String[] lNames = {"Meikäläinen", "Virtanen"};
        int year = 2012;      
        Articles articles = new Articles();
        Article article = new Article("MV12", "Infusing active learning into introductory programming courses", "Whittington, Keith J", "J. Comput. Small Coll", 19, 5, 2004, "249--259", "Consortium for..", "USA");
        articles.addArticle(article);
        
        List<Object> list = new ArrayList<Object>();
        list.add(articles.getArticles());
        
        when(reference.getReferences()).thenReturn(list);
        
        assertNotSame("MV12", keywordgen.generateKeyword(lNames, year));
        
    }
            
}

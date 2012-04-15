package User_Interface;

import Articles.Article;
import Articles.Articles;
import References.Reference;
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
        List<Reference> list = new ArrayList<Reference>();
        when(reference.getReferences()).thenReturn(list);      
        String keyword = keywordgen.generateKeyword(lNames, year);
        assertEquals("MV12", keywordgen.generateKeyword(lNames, year));
        
    }
    @Test
    public void testGenerateKeywordTaken() {
        String[] lNames = {"Meikäläinen", "Virtanen"};
        int year = 2012;      
        Article article = new Article("MV12", "Infusing active learning into introductory programming courses", "Whittington, Keith J", "J. Comput. Small Coll", 19, 5, 2004, "249--259", "Consortium for..", "USA");
        
        List<Reference> list = new ArrayList<Reference>();
        list.add(article);
        
        when(reference.getReferences()).thenReturn(list);
        
        assertNotSame("MV12", keywordgen.generateKeyword(lNames, year));
        
    }
    
    @Test
    public void testGenerateKeywordTakenTwice() {
        String[] lNames = {"Meikäläinen", "Virtanen"};
        
        int year = 2012;      
        String keyword1 = "MV12";
        Article article1 = new Article(keyword1, "Infusing active learning into introductory programming courses", "Whittington, Keith J", "J. Comput. Small Coll", 19, 5, 2004, "249--259", "Consortium for..", "USA");
        String keyword2 = "MV12a";
        Article article2 = new Article(keyword2, "Infusing active learning into introductory programming courses", "Whittington, Keith J", "J. Comput. Small Coll", 19, 5, 2004, "249--259", "Consortium for..", "USA");
        
        List<Reference> list = new ArrayList<Reference>();
        list.add(article1);
        list.add(article2);
        
        when(reference.getReferences()).thenReturn(list);
        
        assertNotSame(keyword1, keywordgen.generateKeyword(lNames, year));
        assertNotSame(keyword2, keywordgen.generateKeyword(lNames, year));
        
    }
            
}

package User_Interface;

import References.Reference;
import References.References;
import java.util.ArrayList;
import java.util.List;
import org.junit.*;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;


public class KeywordGenTest {

    KeywordGen keywordgen;
    References references;

    public KeywordGenTest() {
    }

    @Before
    public void setUp() {
        references = mock(References.class);
        keywordgen = new KeywordGen(references);
    }

    @Test
    public void testGenerateKeyword() {
        String[] lNames = {"Meikäläinen", "Virtanen"};
        int year = 2012;
        List<Reference> list = new ArrayList<Reference>();
        when(references.getReferences()).thenReturn(list);
        String keyword = keywordgen.generateKeyword(lNames, year);
        assertEquals("MV12", keyword);

    }

    @Test
    public void testGenerateKeywordTaken() {
        String[] lNames = {"Meikäläinen", "Virtanen"};
        int year = 2012;
        Reference reference = new Reference();
        reference.setType("@article");
        reference.setKeyword("MV12");

        List<Reference> list = new ArrayList<Reference>();
        list.add(reference);

        when(references.getReferences()).thenReturn(list);

        assertNotSame("MV12", keywordgen.generateKeyword(lNames, year));

    }

    @Test
    public void testGenerateKeywordTakenTwice() {
        String[] lNames = {"Meikäläinen", "Virtanen"};

        String keyword1 = "MV12";
        String keyword2 = "MV12a";
        
        int year = 2012;
        List<Reference> expected = new ArrayList<Reference>();
        Reference reference1 = new Reference();
        reference1.setType("@article");
        reference1.setKeyword(keyword1);

        Reference reference2 = new Reference();
        reference2.setType("@book");
        reference2.setKeyword(keyword2);

        List<Reference> list = new ArrayList<Reference>();
        list.add(reference1);
        list.add(reference2);

        when(references.getReferences()).thenReturn(list);

        assertNotSame(keyword1, keywordgen.generateKeyword(lNames, year));
        assertNotSame(keyword2, keywordgen.generateKeyword(lNames, year));

    }
}

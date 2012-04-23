package References;

import java.util.ArrayList;
import java.util.List;
import org.junit.*;
import static org.junit.Assert.*;

public class AuthorsTest {

    List<Reference> references;
    Authors authors;

    public AuthorsTest() {
    }

    @Before
    public void setUp() {
        references = new ArrayList<Reference>();
        Reference reference1 = new Reference();
        reference1.setType("@article");
        reference1.setKeyword("JKSS22s");
        reference1.setAuthor("Luukkainen, Matti and Vihavainen, Arto");
        references.add(reference1);
        Reference reference2 = new Reference();
        reference2.setType("@book");
        reference2.setKeyword("Wht12");
        reference2.setAuthor("Pekka Pätkä and Vihavainen, Arto");
        references.add(reference2);

        authors = new Authors();

    }

    @Test
    public void testGetReferences() {
        assertEquals(references.get(0), authors.getReferences("Luukkainen", references).get(0));
    }

    @Test
    public void testGetReferences2() {
        assertEquals(references, authors.getReferences("Vihavainen", references));
    }

    @Test
    public void testGetAuthors() {
        String[] autho = {"Luukkainen, Matti", "Vihavainen, Arto", "Pekka Pätkä"};
        assertArrayEquals(autho, authors.getAuthors(references).toArray());
    }
}

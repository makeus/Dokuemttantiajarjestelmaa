/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package References;

import Data_Access.ReferenceReader;
import java.util.ArrayList;
import java.util.List;
import org.junit.*;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class ReferenceHolderTest {

    ReferenceReader readermock;
    ReferenceHolder holder;

    public ReferenceHolderTest() {
    }

    @Before
    public void setUp() {
        readermock = mock(ReferenceReader.class);
        holder = new ReferenceHolder(readermock);
    }

    @Test
    public void testAddReference() {
        Reference reference = new Reference();
        reference.setType("@article");
        reference.setKeyword("JKSS22s");
        holder.addReference(reference);

        assertEquals(holder.getReferences().get(0).getBibtex(), reference.getBibtex());

    }

    @Test
    public void testAddMultipleArticles() {
        List<Reference> expected = new ArrayList<Reference>();
        Reference reference1 = new Reference();
        reference1.setType("@article");
        reference1.setKeyword("JKSS22s");

        Reference reference2 = new Reference();
        reference2.setType("@book");
        reference2.setKeyword("DKSD");

        expected.add(reference1);
        holder.addReference(reference1);
        expected.add(reference2);
        holder.addReference(reference2);

        assertEquals(holder.getReferences().get(0).getBibtex(), expected.get(0).getBibtex());
        assertEquals(holder.getReferences().get(1).getBibtex(), expected.get(1).getBibtex());

    }

    @Test
    public void testGetFileReferences() {
        holder.getReferences();
        verify(readermock).getReference();
    }

    @Test
    public void testGetReferences() {
        Reference reference = new Reference();
        reference.setType("@article");
        reference.setKeyword("JKSS22s");

        List<Reference> list = new ArrayList<Reference>();

        list.add(reference);
        when(readermock.getReference()).thenReturn(list);

        assertEquals(list, holder.getReferences());
    }

    @Test
    public void testGetArticles2() {
        List<Reference> expected = new ArrayList<Reference>();
        Reference reference1 = new Reference();
        reference1.setType("@article");
        reference1.setKeyword("JKSS22s");

        Reference reference2 = new Reference();
        reference2.setType("@book");
        reference2.setKeyword("DKSD");

        List<Reference> list = new ArrayList<Reference>();

        list.add(reference1);
        when(readermock.getReference()).thenReturn(list);
        holder.addReference(reference2);
        expected.add(reference2);
        expected.add(reference1);

        assertEquals(expected.get(0).getBibtex(), holder.getReferences().get(0).getBibtex());
        assertEquals(expected.get(1).getBibtex(), holder.getReferences().get(1).getBibtex());
    }

    @Test
    public void testDontaddSame() {
        Reference reference = new Reference();
        reference.setType("@article");
        reference.setKeyword("JKSS22s");

        List<Reference> list = new ArrayList<Reference>();

        list.add(reference);

        when(readermock.getReference()).thenReturn(list);
        holder.addReference(reference);

        assertEquals(1, holder.getReferences().size());
    }
}

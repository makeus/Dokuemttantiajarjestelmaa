package References;

import Data_Access.FileManager;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;

public class ReferencesTest {

    References references;
    FileManager filemanagermock;

    @Before
    public void setUp() {
        filemanagermock = mock(FileManager.class);
        references = new References(filemanagermock);
    }

    @Test
    public void testAddReference() {
        Reference reference = new Reference();
        reference.setType("@article");
        reference.setKeyword("JKSS22s");
        references.addReference(reference);
        
        assertEquals(references.getReferences().get(0).getBibtex(), reference.getBibtex());

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
        references.addReference(reference1);
        expected.add(reference2);
        references.addReference(reference2);

        assertEquals(references.getReferences().get(0).getBibtex(), expected.get(0).getBibtex());
        assertEquals(references.getReferences().get(1).getBibtex(), expected.get(1).getBibtex());

    }

    @Test
    public void testGetFileReferences() {
        when(filemanagermock.isOpen()).thenReturn(true);
        references.getReferences();
        verify(filemanagermock).getReference();
    }

    @Test
    public void testGetReferences() {
        when(filemanagermock.isOpen()).thenReturn(true);
        Reference reference = new Reference();
        reference.setType("@article");
        reference.setKeyword("JKSS22s");

        List<Reference> list = new ArrayList<Reference>();

        list.add(reference);
        when(filemanagermock.getReference()).thenReturn(list);

        assertEquals(list, references.getReferences());
    }

    @Test
    public void testGetArticles2() {
        when(filemanagermock.isOpen()).thenReturn(true);
        List<Reference> expected = new ArrayList<Reference>();
        Reference reference1 = new Reference();
        reference1.setType("@article");
        reference1.setKeyword("JKSS22s");

        Reference reference2 = new Reference();
        reference2.setType("@book");
        reference2.setKeyword("DKSD");

        List<Reference> list = new ArrayList<Reference>();

        list.add(reference1);
        when(filemanagermock.getReference()).thenReturn(list);
        references.addReference(reference2);
        expected.add(reference2);
        expected.add(reference1);

        assertEquals(expected.get(0).getBibtex(), references.getReferences().get(0).getBibtex());
        assertEquals(expected.get(1).getBibtex(), references.getReferences().get(1).getBibtex());
    }

    @Test
    public void testDontaddSame() {
        when(filemanagermock.isOpen()).thenReturn(true);
        Reference reference = new Reference();
        reference.setType("@article");
        reference.setKeyword("JKSS22s");
        
        List<Reference> list = new ArrayList<Reference>();

        list.add(reference);
        
        when(filemanagermock.getReference()).thenReturn(list);
        references.addReference(reference);
        
        assertEquals(1, references.getReferences().size());
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

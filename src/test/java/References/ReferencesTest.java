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
    ReferenceHolder holdermock;
    Authors authorsmock;

    public ReferencesTest(){
    }
    
    @Before
    public void setUp() {
        filemanagermock = mock(FileManager.class);
        holdermock = mock(ReferenceHolder.class);
        authorsmock = mock(Authors.class);
        references = new References(filemanagermock, holdermock, authorsmock);
    }

    @Test
    public void testAddReference() {
        Reference reference = new Reference();
        reference.setType("@article");
        reference.setKeyword("JKSS22s");

        references.addReference(reference);
        verify(holdermock).addReference(reference);

    }

    @Test
    public void testGetReferences() {
        references.getReferences();
        verify(holdermock).getReferences();
    }

    @Test
    public void testGetReferences2() {
        Reference reference = new Reference();
        reference.setType("@article");
        reference.setKeyword("JKSS22s");

        List<Reference> list = new ArrayList<Reference>();

        list.add(reference);
        when(holdermock.getReferences()).thenReturn(list);
        assertEquals(reference, references.getReferences().get(0));
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
    
    @Test
    public void testGetAuthors(){
        references.getAuthors();
        verify(authorsmock).getAuthors(anyList());
    }
    
    @Test
    public void testGetAuthorReferences(){
        String author = "Luukkainen";
        references.getReferences(author);
        verify(authorsmock).getReferences(eq(author), anyList());
    }
}

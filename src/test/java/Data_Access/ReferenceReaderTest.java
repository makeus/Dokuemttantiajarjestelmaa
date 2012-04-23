package Data_Access;

import References.Reference;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.junit.*;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class ReferenceReaderTest {

    FileManager fileManager;
    ReferenceReader reader;

    public ReferenceReaderTest() {
    }

    @Before
    public void setUp() {
        fileManager = mock(FileManager.class);
        reader = new ReferenceReader(fileManager);
    }

    @Test
    public void testGetReferencesEmpty() {
        when(fileManager.getContents()).thenReturn("");

        assertTrue(reader.getReference().isEmpty());
        verify(fileManager).getContents();

    }

    @Test
    public void testGetReferences() {
        Reference reference = new Reference();
        reference.setType(("@article"));
        reference.setKeyword("WDS21a");

        when(fileManager.getContents()).thenReturn(reference.getBibtex());
        
        assertEquals(reference.getBibtex(), reader.getReference().get(0).getBibtex());

    }
    
    @Test
    public void testGetReferences2() {
        String reference = "@BOOK (V78,\nAUTHOR = \"L. S. Vygotsky\",\nTITLE= \"Mind in Society: The Development of Higher Psychological Processes\",\nPUBLISHER = \"Harvard University Press\",\nYEAR = 1978,\nADDRESS = \"Cambridge, MA\",\n)";

        when(fileManager.getContents()).thenReturn(reference);
        assertEquals("V78", reader.getReference().get(0).getKeyword());
        assertEquals(1978, reader.getReference().get(0).getYear());

    }    
}

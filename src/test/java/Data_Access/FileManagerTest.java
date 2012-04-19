package Data_Access;

import References.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class FileManagerTest {

    FileManager fileManager;

    public FileManagerTest() {
    }

    @Before
    public void setUp() {
        fileManager = new FileManager();
    }

    @Test
    public void testOpenFileFalse() {
        String filename = "dsad";
        assertFalse(fileManager.openFile(filename));
    }

    @Test
    public void testOpenFileTrue() {
        String filename = "test.test";
        assertTrue(fileManager.createFile(filename));
        assertTrue(fileManager.openFile(filename));
        File file = new File(filename);
        file.delete();
    }

    @Test
    public void testCreateFile() {
        String filename = "test.test";
        assertTrue(fileManager.createFile(filename));
        File file = new File(filename);
        file.delete();
        
    }

    @Test
    public void testCreateFileTaken() {
        String filename = "test.test";
        assertTrue(fileManager.createFile(filename));
        assertFalse(fileManager.createFile(filename));
        File file = new File(filename);
        file.delete();
    }

    @Test
    public void testSaveAs() {
        String filename = "test.test";
        List<Reference> references = new ArrayList<Reference>();
        assertTrue(fileManager.saveAs(references, filename));
        File file = new File(filename);
        file.delete();
    }

    @Test
    public void testSaveAsTaken() {
        String filename = "test.test";
        List<Reference> references = new ArrayList<Reference>();
        assertTrue(fileManager.createFile(filename));
        assertFalse(fileManager.saveAs(references, filename));
        File file = new File(filename);
        file.delete();
    }

    @Test
    public void testSaveFileReturn() {
        String filename = "test.test";
        List<Reference> references = new ArrayList<Reference>();
        assertTrue(fileManager.createFile(filename));
        assertTrue(fileManager.saveFile(references));
        File file = new File(filename);
        file.delete();
    }

    @Test
    public void testSaveFileNone() {
        List<Reference> references = new ArrayList<Reference>();
        assertFalse(fileManager.saveFile(references));

    }

    @Test
    public void testSaveFile() throws FileNotFoundException {

        String filename = "test.test";
        List<Reference> references = new ArrayList<Reference>();
        Reference ref = new Reference() {

            String bibTex = "@article{asd\ntitle = adventure of dasd,\n}\n";

            @Override
            public String getBibtex() {
                return bibTex;
            }
        };
        references.add(ref);

        assertTrue(fileManager.createFile(filename));
        assertTrue(fileManager.saveFile(references));

        File file = new File(filename);
        Scanner scanner = new Scanner(file);
        String result = "";
        while (scanner.hasNextLine()) {
            result = result + scanner.nextLine() + "\n";
        }
        scanner.close();
        file.delete();
        assertEquals(ref.getBibtex(), result);

    }

    @Test
    public void testGetContentsEmpty() {
        String filename = "test.test";
        List<Reference> references = new ArrayList<Reference>();

        assertTrue(fileManager.createFile(filename));
        assertTrue(fileManager.saveFile(references));
        assertTrue(fileManager.getContents().length() == 0);

        File file = new File(filename);
        file.delete();

    }

    @Test
    public void testGetContents() {
        String filename = "test.test";
        List<Reference> references = new ArrayList<Reference>();
        Reference reference = new Reference();
        reference.setType(("@article"));
        reference.setKeyword("WDS21a");

        references.add(reference);

        assertTrue(fileManager.createFile(filename));
        assertTrue(fileManager.saveFile(references));

        assertEquals(reference.getBibtex(), fileManager.getContents());

        File file = new File(filename);
        file.delete();

    }

    @Test
    public void testGetContentsNone() {
        assertTrue(fileManager.getContents().length() == 0);
    }

    @Test
    public void testIsOpen() {
        String filename = "test.test";
        assertTrue(fileManager.createFile(filename));
        assertTrue(fileManager.isOpen());
        File file = new File(filename);
        file.delete();
    }

    @Test
    public void testIsNotOpen() {
        assertFalse(fileManager.isOpen());
    }

    @Test
    public void testOpenFileNULL() {
        assertFalse(fileManager.openFile(null));
    }
    @Test
    public void testCreateFileNULL() {
        assertFalse(fileManager.createFile(null));
    }

    @Test
    public void testSaveFileNULL() {
        assertFalse(fileManager.saveFile(null));
    }
    
    @Test
    public void testSaveAsNULL() {
        assertFalse(fileManager.saveAs(null, null));
    }
}

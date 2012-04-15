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

            String keyword = "asd";
            String bibTex = "@article{asd\ntitle = adventure of dasd,\n}\n";
            String info = "asd, title = adventure of dasd";

            public String getKeyword() {
                return keyword;
            }

            public String getBibtex() {
                return bibTex;
            }

            public String getInfo() {
                return info;

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
    public void testGetArticlesEmpty() {
        String filename = "test.test";
        List<Reference> references = new ArrayList<Reference>();

        assertTrue(fileManager.createFile(filename));
        assertTrue(fileManager.saveFile(references));
        assertTrue(fileManager.getArticles().isEmpty());

        File file = new File(filename);
        file.delete();

    }

    @Test
    public void testGetBooksEmpty() {
        String filename = "test.test";
        List<Reference> references = new ArrayList<Reference>();

        assertTrue(fileManager.createFile(filename));
        assertTrue(fileManager.saveFile(references));
        assertTrue(fileManager.getBooks().isEmpty());

        File file = new File(filename);
        file.delete();

    }

    @Test
    public void testGetInproceedingsEmpty() {
        String filename = "test.test";
        List<Reference> references = new ArrayList<Reference>();

        assertTrue(fileManager.createFile(filename));
        assertTrue(fileManager.saveFile(references));
        assertTrue(fileManager.getInproceedings().isEmpty());

        File file = new File(filename);
        file.delete();

    }

    @Test
    public void testGetArticles() {
        String filename = "test.test";
        List<Reference> references = new ArrayList<Reference>();
        Article article1 = new Article("WO4", "Infusing active learning into introductory programming courses", "Whittington, Keith J", "J. Comput. Small Coll", 19, 5, 2004, "249--259", "Consortium for..", "USA");

        references.add(article1);

        assertTrue(fileManager.createFile(filename));
        assertTrue(fileManager.saveFile(references));

        assertEquals(article1.getBibtex(), fileManager.getArticles().get(0).getBibtex());

        File file = new File(filename);
        file.delete();

    }

    @Test
    public void testGetBooks() {
        String filename = "test.test";
        List<Reference> references = new ArrayList<Reference>();
        Book book1 = new Book("BA04", "Extreme Programming Explained: Embrace Change (2nd Edition)", "L. S. Vygotsky", 1978, "Harvard University Press");

        references.add(book1);

        assertTrue(fileManager.createFile(filename));
        assertTrue(fileManager.saveFile(references));

        assertEquals(book1.getBibtex(), fileManager.getBooks().get(0).getBibtex());

        File file = new File(filename);
        file.delete();

    }

    @Test
    public void testGetInproceedings() {
        String filename = "test.test";
        List<Reference> references = new ArrayList<Reference>();
        Inproceeding inproceeding1 = new Inproceeding("PSMM07", "A survey of literature on the teaching of introductory programming", "Pears, Arnold and Seidman, Stephen and Malmi, Lauri and Mannila, Linda and Adams, Elizabeth and Bennedsen, Jens and Devlin, Marie and Paterson, James", 2007, "ACM", "ITiCSE-WGR '07: Working group reports on ITiCSE on Innovation and technology in computer science education", "204--223");

        references.add(inproceeding1);

        assertTrue(fileManager.createFile(filename));
        assertTrue(fileManager.saveFile(references));
        
        assertEquals(inproceeding1.getAuthor(), fileManager.getInproceedings().get(0).getAuthor());
        assertEquals(inproceeding1.getKeyword(), fileManager.getInproceedings().get(0).getKeyword());

        
        File file = new File(filename);
        file.delete();

    }

    @Test
    public void testGetArticlesNone() {
        assertTrue(fileManager.getArticles().isEmpty());
    }

    @Test
    public void testGetBooksNone() {
        assertTrue(fileManager.getBooks().isEmpty());
    }

    @Test
    public void testGetInproceedingsNone() {
        assertTrue(fileManager.getInproceedings().isEmpty());
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
}

package References;

import Data_Access.FileManager;
import java.util.ArrayList;
import java.util.List;
import org.junit.*;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class InproceedingsTest {

    Inproceedings inproceedings;
    FileManager filemanagermock;

    public InproceedingsTest() {
    }

    @Before
    public void setUp() {
        filemanagermock = mock(FileManager.class);
        inproceedings = new Inproceedings(filemanagermock);
    }

    @Test
    public void testAddArticle() {
        Inproceeding inproceeding = new Inproceeding("PSMM07", "A survey of literature on the teaching of introductory programming", "Pears, Arnold and Seidman, Stephen and Malmi, Lauri and Mannila, Linda and Adams, Elizabeth and Bennedsen, Jens and Devlin, Marie and Paterson, James", 2007, "ACM", "ITiCSE-WGR '07: Working group reports on ITiCSE on Innovation and technology in computer science education", "204--223");
        inproceedings.addInproceeding("PSMM07", "A survey of literature on the teaching of introductory programming", "Pears, Arnold and Seidman, Stephen and Malmi, Lauri and Mannila, Linda and Adams, Elizabeth and Bennedsen, Jens and Devlin, Marie and Paterson, James", 2007, "ACM", "ITiCSE-WGR '07: Working group reports on ITiCSE on Innovation and technology in computer science education", "204--223");
        assertEquals(inproceedings.getInproceedings().get(0).getBibtex(), inproceeding.getBibtex());
    }

    @Test
    public void testAddMultipleArticles() {
        List<Inproceeding> expected = new ArrayList<Inproceeding>();
        Inproceeding inproceeding1 = new Inproceeding("PSMM07", "A survey of literature on the teaching of introductory programming", "Pears, Arnold and Seidman, Stephen and Malmi, Lauri and Mannila, Linda and Adams, Elizabeth and Bennedsen, Jens and Devlin, Marie and Paterson, James", 2007, "ACM", "ITiCSE-WGR '07: Working group reports on ITiCSE on Innovation and technology in computer science education", "204--223");
        Inproceeding inproceeding2 = new Inproceeding("PSMM07a", "A survey of literature on the teaching of introductory programming", "Pears, Arnold and Seidman, Stephen and Malmi, Lauri and Mannila, Linda and Adams, Elizabeth and Bennedsen, Jens and Devlin, Marie and Paterson, James", 2007, "ACM", "ITiCSE-WGR '07: Working group reports on ITiCSE on Innovation and technology in computer science education", "204--223");
        

        expected.add(inproceeding1);
        inproceedings.addInproceeding("PSMM07", "A survey of literature on the teaching of introductory programming", "Pears, Arnold and Seidman, Stephen and Malmi, Lauri and Mannila, Linda and Adams, Elizabeth and Bennedsen, Jens and Devlin, Marie and Paterson, James", 2007, "ACM", "ITiCSE-WGR '07: Working group reports on ITiCSE on Innovation and technology in computer science education", "204--223");
        expected.add(inproceeding2);
        inproceedings.addInproceeding("PSMM07a", "A survey of literature on the teaching of introductory programming", "Pears, Arnold and Seidman, Stephen and Malmi, Lauri and Mannila, Linda and Adams, Elizabeth and Bennedsen, Jens and Devlin, Marie and Paterson, James", 2007, "ACM", "ITiCSE-WGR '07: Working group reports on ITiCSE on Innovation and technology in computer science education", "204--223");
        
        assertEquals(expected.get(0).getBibtex(), inproceedings.getInproceedings().get(0).getBibtex());
        assertEquals(expected.get(1).getBibtex(), inproceedings.getInproceedings().get(1).getBibtex());
    }

    @Test
    public void testGetFileArticles() {
        when(filemanagermock.isOpen()).thenReturn(true);
        inproceedings.getInproceedings();
        verify(filemanagermock).getInproceedings();
    }

    @Test
    public void testGetArticles() {
        when(filemanagermock.isOpen()).thenReturn(true);
        Inproceeding inproceeding1 = new Inproceeding("PSMM07", "A survey of literature on the teaching of introductory programming", "Pears, Arnold and Seidman, Stephen and Malmi, Lauri and Mannila, Linda and Adams, Elizabeth and Bennedsen, Jens and Devlin, Marie and Paterson, James", 2007, "ACM", "ITiCSE-WGR '07: Working group reports on ITiCSE on Innovation and technology in computer science education", "204--223");
        List<Inproceeding> list = new ArrayList<Inproceeding>();
        list.add(inproceeding1);
        when(filemanagermock.getInproceedings()).thenReturn(list);

        assertEquals(list, inproceedings.getInproceedings());
    }

    @Test
    public void testGetArticles2() {
        when(filemanagermock.isOpen()).thenReturn(true);
        Inproceeding inproceeding1 = new Inproceeding("PSMM07", "A survey of literature on the teaching of introductory programming", "Pears, Arnold and Seidman, Stephen and Malmi, Lauri and Mannila, Linda and Adams, Elizabeth and Bennedsen, Jens and Devlin, Marie and Paterson, James", 2007, "ACM", "ITiCSE-WGR '07: Working group reports on ITiCSE on Innovation and technology in computer science education", "204--223");
        Inproceeding inproceeding2 = new Inproceeding("PSMM07a", "A survey of literature on the teaching of introductory programming", "Pears, Arnold and Seidman, Stephen and Malmi, Lauri and Mannila, Linda and Adams, Elizabeth and Bennedsen, Jens and Devlin, Marie and Paterson, James", 2007, "ACM", "ITiCSE-WGR '07: Working group reports on ITiCSE on Innovation and technology in computer science education", "204--223");
        
        List<Inproceeding> list = new ArrayList<Inproceeding>();
        list.add(inproceeding1);
        when(filemanagermock.getInproceedings()).thenReturn(list);
        inproceedings.addInproceeding("PSMM07a", "A survey of literature on the teaching of introductory programming", "Pears, Arnold and Seidman, Stephen and Malmi, Lauri and Mannila, Linda and Adams, Elizabeth and Bennedsen, Jens and Devlin, Marie and Paterson, James", 2007, "ACM", "ITiCSE-WGR '07: Working group reports on ITiCSE on Innovation and technology in computer science education", "204--223");

        List<Inproceeding> expected = new ArrayList<Inproceeding>();
        expected.add(inproceeding2);
        expected.add(inproceeding1);

        assertEquals(expected.get(0).getBibtex(), inproceedings.getInproceedings().get(0).getBibtex());
        assertEquals(expected.get(1).getBibtex(), inproceedings.getInproceedings().get(1).getBibtex());

    }

    @Test
    public void testDontaddSame() {
        when(filemanagermock.isOpen()).thenReturn(true);
        Inproceeding inproceeding1 = new Inproceeding("PSMM07", "A survey of literature on the teaching of introductory programming", "Pears, Arnold and Seidman, Stephen and Malmi, Lauri and Mannila, Linda and Adams, Elizabeth and Bennedsen, Jens and Devlin, Marie and Paterson, James", 2007, "ACM", "ITiCSE-WGR '07: Working group reports on ITiCSE on Innovation and technology in computer science education", "204--223");
        List<Inproceeding> list = new ArrayList<Inproceeding>();
        list.add(inproceeding1);
        when(filemanagermock.getInproceedings()).thenReturn(list);
       inproceedings.addInproceeding("PSMM07", "A survey of literature on the teaching of introductory programming", "Pears, Arnold and Seidman, Stephen and Malmi, Lauri and Mannila, Linda and Adams, Elizabeth and Bennedsen, Jens and Devlin, Marie and Paterson, James", 2007, "ACM", "ITiCSE-WGR '07: Working group reports on ITiCSE on Innovation and technology in computer science education", "204--223");

        assertEquals(1, inproceedings.getInproceedings().size());
    }
}
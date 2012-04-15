package References;

import Data_Access.FileManager;
import java.util.ArrayList;
import java.util.List;

public class Inproceedings {

    private List<Inproceeding> inproceedings;
    private FileManager fileManager;

    public Inproceedings(FileManager fileManager) {
        this.fileManager = fileManager;
        inproceedings = new ArrayList<Inproceeding>();
    }

    public List<Inproceeding> getInproceedings() {
        if (fileManager.isOpen()) {
            List<Inproceeding> infile = fileManager.getInproceedings();
            for (Inproceeding inproceeding : infile) {
                boolean contains = false;
                for (Inproceeding ininproceeding : inproceedings) {
                    if (ininproceeding.getKeyword().equals(inproceeding.getKeyword())) {
                        contains = true;
                    }
                }
                if (!contains) {
                    inproceedings.add(inproceeding);
                }
            }
        }

        return inproceedings;
    }

    public void addInproceeding(String keyword, String title, String author, int year, String publisher, String booktitle, String pages) {
        inproceedings.add(new Inproceeding(keyword, title, author, year, publisher, booktitle, pages));
    }
}

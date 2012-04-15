package Data_Access;

import Articles.Article;
import References.Reference;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileManager {

    private File file;
    private boolean fileopen = false;

    public FileManager() {
    }

    public boolean openFile(String filename) {
        file = new File(filename);
        if (!file.exists()) {
            return false;
        }
        fileopen = true;
        return true;

    }

    public boolean createFile(String filename) {
        try {
            if (file == null || !file.exists()) {
                file = new File(filename);
                fileopen = file.createNewFile();
                return fileopen;
            }
            return false;
        } catch (IOException iOException) {
            return false;
        }
    }
    
    public boolean saveAs(List<Reference> references, String filename){
        this.file = new File(filename);
        if(file.exists())
            return false;
        this.createFile(filename);
        return this.saveFile(references);
    }

    public boolean saveFile(List<Reference> references) {
        FileWriter writer;
        if (file == null || !file.exists()) {
            return false;
        }
        try {
            writer = new FileWriter(file);
            for (Reference reference : references) {
                writer.write(reference.getBibtex());
            }
            writer.close();
        } catch (IOException ex) {
            return false;
        }
        return true;

    }

    public List<Article> getArticles() {
        List<Article> list = new ArrayList<Article>();

        if (file != null && file.exists()) {

            Scanner lukija;
            try {
                lukija = new Scanner(file);
            } catch (FileNotFoundException fileNotFoundException) {
                return list;
            }

            String rivi;

            String keyword;
            String title = null;
            String author = null;
            String journal = null;
            int volume = 0;
            int number = 0;
            int year = 0;
            String pages = null;
            String publisher = null;
            String address = null;

            while (lukija.hasNextLine()) {
                rivi = lukija.nextLine();
                if (rivi.contains("@article")) {
                    keyword = getContents(rivi, 1);
                    do {
                        rivi = lukija.nextLine();
                        if (rivi.contains("title")) {
                            title = getContents(rivi, 2);
                        }
                        if (rivi.contains("author")) {
                            author = getContents(rivi, 2);
                        }
                        if (rivi.contains("journal")) {
                            journal = getContents(rivi, 2);
                        }
                        if (rivi.contains("volume")) {
                            volume = new Integer(getContents(rivi, 2)).intValue();
                        }
                        if (rivi.contains("number")) {
                            number = new Integer(getContents(rivi, 2)).intValue();
                        }
                        if (rivi.contains("year")) {
                            year = new Integer(getContents(rivi, 2)).intValue();
                        }
                        if (rivi.contains("pages")) {
                            pages = getContents(rivi, 2);
                        }
                        if (rivi.contains("publisher")) {
                            publisher = getContents(rivi, 2);
                        }
                        if (rivi.contains("address")) {
                            address = getContents(rivi, 2);
                        }

                    } while (!rivi.contains("@") && lukija.hasNextLine());
                    list.add(new Article(keyword, title, author, journal, volume, number, year, pages, publisher, address));
                }
            }
            lukija.close();
        }
        return list;
    }

    public boolean isOpen() {
        return fileopen;
    }

    private String getContents(String rivi, int l) {
        String str;
        str = rivi.split("\\{")[1];
        str = str.substring(0, str.length() - l);
        return str;
    }
}

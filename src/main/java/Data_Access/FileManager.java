package Data_Access;

import References.Article;
import References.Book;
import References.Inproceeding;
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

    public boolean saveAs(List<Reference> references, String filename) {
        this.file = new File(filename);
        if (file.exists()) {
            return false;
        }
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
                if (rivi.toLowerCase().contains("@article")) {
                    keyword = getKeyword(rivi, "@article");
                    title = "";
                    author = "";
                    journal = "";
                    volume = 0;
                    number = 0;
                    year = 0;
                    pages = "";
                    publisher = "";
                    address = "";
                    
                    do {
                        rivi = lukija.nextLine();
                        if (rivi.toLowerCase().contains("title")) {
                            title = getContents(rivi, 2);
                        }
                        if (rivi.toLowerCase().contains("author")) {
                            author = getContents(rivi, 2);
                        }
                        if (rivi.toLowerCase().contains("journal")) {
                            journal = getContents(rivi, 2);
                        }
                        if (rivi.toLowerCase().contains("volume")) {
                            volume = new Integer(getContents(rivi, 2)).intValue();
                        }
                        if (rivi.toLowerCase().contains("number")) {
                            number = new Integer(getContents(rivi, 2)).intValue();
                        }
                        if (rivi.toLowerCase().contains("year")) {
                            year = new Integer(getContents(rivi, 2)).intValue();
                        }
                        if (rivi.toLowerCase().contains("pages")) {
                            pages = getContents(rivi, 2);
                        }
                        if (rivi.toLowerCase().contains("publisher")) {
                            publisher = getContents(rivi, 2);
                        }
                        if (rivi.toLowerCase().contains("address")) {
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

    public List<Book> getBooks() {
        List<Book> list = new ArrayList<Book>();

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
            int year = 0;
            String publisher = null;

            while (lukija.hasNextLine()) {
                rivi = lukija.nextLine();
                if (rivi.toLowerCase().contains("@book")) {

                    keyword = getKeyword(rivi, "@book");
                    title = "";
                    author = "";
                    year = 0;
                    publisher = "";

                    do {
                        rivi = lukija.nextLine();
                        if (rivi.toLowerCase().contains("title")) {
                            title = getContents(rivi, 2);
                        }
                        if (rivi.toLowerCase().contains("author")) {
                            author = getContents(rivi, 2);
                        }
                        if (rivi.toLowerCase().contains("year")) {
                            year = new Integer(getContents(rivi, 2)).intValue();
                        }
                        if (rivi.toLowerCase().contains("publisher")) {
                            publisher = getContents(rivi, 2);
                        }
                    } while (!rivi.contains("@") && lukija.hasNextLine());
                    list.add(new Book(keyword, title, author, year, publisher));
                }
            }
            lukija.close();
        }
        return list;
    }

    public List<Inproceeding> getInproceedings() {
        List<Inproceeding> list = new ArrayList<Inproceeding>();

        if (file != null && file.exists()) {

            Scanner lukija;
            try {
                lukija = new Scanner(file);
            } catch (FileNotFoundException fileNotFoundException) {
                return list;
            }

            String rivi;

            String keyword;
            String title = "";
            String author = "";
            int year = 0;
            String publisher = "";
            String pages = "";
            String booktitle = "";

            while (lukija.hasNextLine()) {
                rivi = lukija.nextLine();
                if (rivi.toLowerCase().contains("@inproceeding")) {

                    keyword = getKeyword(rivi, "@inproceeding");
                    title = "";
                    author = "";
                    year = 0;
                    publisher = "";
                    pages = "";
                    booktitle = "";

                    do {
                        rivi = lukija.nextLine();
                        if (rivi.toLowerCase().contains("title")) {
                            title = getContents(rivi, 2);
                        }
                        if (rivi.toLowerCase().contains("author")) {
                            author = getContents(rivi, 2);
                        }
                        if (rivi.toLowerCase().contains("booktitle")) {
                            booktitle = getContents(rivi, 2);
                        }
                        if (rivi.toLowerCase().contains("pages")) {
                            pages = getContents(rivi, 2);
                        }
                        if (rivi.toLowerCase().contains("year")) {
                            year = new Integer(getContents(rivi, 2)).intValue();
                        }
                        if (rivi.toLowerCase().contains("publisher")) {
                            publisher = getContents(rivi, 2);
                        }
                    } while (!rivi.contains("@") && lukija.hasNextLine());
                    list.add(new Inproceeding(keyword, title, author, year, publisher, booktitle, pages));
                }
            }
            lukija.close();
        }
        return list;
    }

    private String getKeyword(String rivi, String type) {
        String keyword;
        if (rivi.split(type).length == 1) {
            keyword = rivi.split(type.toUpperCase())[1];
        } else {
            keyword = rivi.split(type)[1];
        }
        keyword = keyword.replaceAll("\\{", "");
        keyword = keyword.replaceAll("\\(", "");
        keyword = keyword.replaceAll(",", "");
        keyword = keyword.trim();
        return keyword;
    }

    public boolean isOpen() {
        return fileopen;
    }

    private String getContents(String rivi, int l) {
        String str;

        String[] row;

        row = rivi.split("=");
        row[0] = row[0].toLowerCase();

        str = row[1];
        str = str.trim();

        if (row[0].contains("year") || row[0].contains("volume") || row[0].contains("number")) {
            str = str.replaceAll("\\{", "");
            str = str.replaceAll("\\}", "");
            str = str.replaceAll("\\.", "");
            str = str.replaceAll(",", "");
            return str;
        }

        str = str.substring(1, str.length() - 2);

        return str;
    }
}
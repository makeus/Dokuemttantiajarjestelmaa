package Data_Access;

import References.Reference;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileManager {

    private File file;
    private boolean fileopen = false;

    public FileManager() {
    }

    public boolean openFile(String filename) {
        if (filename == null) {
            return false;
        }
        file = new File(filename);
        if (!file.exists()) {
            return false;
        }
        fileopen = true;
        return true;

    }

    public boolean createFile(String filename) {
        if (filename == null) {
            return false;
        }
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
        if (filename == null) {
            return false;
        }
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

    public List<Reference> getReference() {
        List<Reference> list = new ArrayList<Reference>();

        if (file != null && file.exists()) {

            Scanner lukija;
            try {
                lukija = new Scanner(file);
            } catch (FileNotFoundException fileNotFoundException) {
                return list;
            }

            String rivi;

            String type;
            String keyword;
            String title = "";
            String author = "";
            String journal = "";
            int volume = 0;
            int number = 0;
            int year = 0;
            String pages = "";
            String publisher = "";
            String address = "";
            String booktitle = "";

            while (lukija.hasNextLine()) {
                rivi = lukija.nextLine();
                if (rivi.contains("@")) {
                    type = getType(rivi);
                    keyword = getKeyword(rivi, type);

                    title = "";
                    author = "";
                    journal = "";
                    volume = 0;
                    number = 0;
                    year = 0;
                    pages = "";
                    publisher = "";
                    address = "";
                    booktitle = "";

                    do {
                        rivi = lukija.nextLine();
                        if (rivi.toLowerCase().contains("title")) {
                            title = getContents(rivi);
                        }
                        if (rivi.toLowerCase().contains("author")) {
                            author = getContents(rivi);
                        }
                        if (rivi.toLowerCase().contains("journal")) {
                            journal = getContents(rivi);
                        }
                        if (rivi.toLowerCase().contains("booktitle")) {
                            booktitle = getContents(rivi);
                        }
                        if (rivi.toLowerCase().contains("volume")) {
                            volume = new Integer(getContents(rivi)).intValue();
                        }
                        if (rivi.toLowerCase().contains("number")) {
                            number = new Integer(getContents(rivi)).intValue();
                        }
                        if (rivi.toLowerCase().contains("year")) {
                            year = new Integer(getContents(rivi)).intValue();
                        }
                        if (rivi.toLowerCase().contains("pages")) {
                            pages = getContents(rivi);
                        }
                        if (rivi.toLowerCase().contains("publisher")) {
                            publisher = getContents(rivi);
                        }
                        if (rivi.toLowerCase().contains("address")) {
                            address = getContents(rivi);
                        }

                    } while (!rivi.contains("@") && lukija.hasNextLine());
                    Reference reference = new Reference();
                    reference.setType(type);
                    reference.setKeyword(keyword);
                    reference.setAuthor(author);
                    reference.setTitle(title);
                    reference.setYear(year);
                    reference.setVolume(volume);
                    reference.setAddress(address);
                    reference.setPublisher(publisher);
                    reference.setPages(pages);
                    reference.setBooktitle(booktitle);
                    reference.setNumber(number);
                    reference.setJournal(journal);

                    list.add(reference);
                }
            }
            lukija.close();
        }
        return list;
    }

    private String getType(String rivi) {
        String type;
        if (rivi.split("\\{").length == 1) {
            type = rivi.split("\\(")[0];
        } else {
            type = rivi.split("\\{")[0];
        }
        return type;
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

    private String getContents(String rivi) {
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
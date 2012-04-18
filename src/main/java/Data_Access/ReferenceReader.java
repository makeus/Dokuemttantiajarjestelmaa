/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Data_Access;

import References.Reference;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReferenceReader {

    private UserDAO userdao;

    public ReferenceReader(UserDAO userdao) {
        this.userdao = userdao;
    }

    public List<Reference> getReference() {
        List<Reference> list = new ArrayList<Reference>();

        Scanner lukija;

        lukija = new Scanner(userdao.getContents());

        while (lukija.hasNextLine()) {
            getReferences(lukija, list);
        }
        lukija.close();

        return list;
    }

    private void getReferences(Scanner lukija, List<Reference> list) throws NumberFormatException {
        String rivi;
        String type;
        String keyword;
        String title;
        String author;
        String journal;
        int volume;
        int number;
        int year;
        String pages;
        String publisher;
        String address;
        String booktitle;
        
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

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Data_Access;

import References.Reference;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReferenceReader {

    private UserDAO userdao;
    private String[][] keys;

    public ReferenceReader(UserDAO userdao) {
        this.userdao = userdao;
        setArray();
    }

    private void referenceKeys(Reference reference) throws NumberFormatException {
        reference.setTitle(keys[0][1]);
        reference.setAuthor(keys[1][1]);
        reference.setJournal(keys[2][1]);
        reference.setVolume(getAsInt(keys[3][1]));
        reference.setNumber(getAsInt(keys[4][1]));
        reference.setYear(getAsInt(keys[5][1]));
        reference.setPages(keys[6][1]);
        reference.setPublisher(keys[7][1]);
        reference.setAddress(keys[8][1]);
        reference.setBooktitle(keys[9][1]);
        reference.setNote(keys[10][1]);
    }

    private void setArray() {
        int keycount = 11;
        this.keys = new String[keycount][2];
        keys[0][0] = "title";
        keys[1][0] = "author";
        keys[2][0] = "journal";
        keys[3][0] = "volume";
        keys[4][0] = "number";
        keys[5][0] = "year";
        keys[6][0] = "pages";
        keys[7][0] = "publisher";
        keys[8][0] = "address";
        keys[9][0] = "booktitle";
        keys[10][0] = "note";
    }

    private int getAsInt(String string) throws NumberFormatException {
        if (string.equals("")) {
            return 0;
        }
        return new Integer(string).intValue();
    }

    private void resetArray() {
        for (String[] key : keys) {
            key[1] = "";
        }
    }

    public List<Reference> getReference() {
        List<Reference> list = new ArrayList<Reference>();
        Scanner lukija;
        lukija = new Scanner(userdao.getContents());
        int i = 0;
        readReferences(lukija, list);
        lukija.close();
        return list;
    }

    private void readReferences(Scanner lukija, List<Reference> list) throws NumberFormatException {
        String rivi = lukija.hasNextLine() ? lukija.nextLine() : null;
        String type, keyword;
        while (lukija.hasNextLine()) {
            if (rivi.contains("@")) {
                type = getType(rivi);
                keyword = getKeyword(rivi, type);
                resetArray();
                do {
                    rivi = lukija.nextLine();
                    for (String[] key : keys) {
                        if (rivi.toLowerCase().contains(key[0])) {
                            key[1] = getContents(rivi);
                        }
                    }
                } while (!rivi.contains("@") && lukija.hasNextLine());
                Reference reference = new Reference();
                reference.setType(type);
                reference.setKeyword(keyword);
                referenceKeys(reference);
                list.add(reference);
            }
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
        row[0] = row[0].toLowerCase().trim();

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

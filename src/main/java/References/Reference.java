package References;

import java.util.ArrayList;

public class Reference {

    private String type;
    private String keyword;
    private String title;
    private String author;
    private String journal;
    private int volume;
    private int number;
    private int year;
    private String pages;
    private String publisher;
    private String address;
    private String booktitle;
    private String note;
    
    ArrayList<String[]> keys;

    public Reference() {
        keys = new ArrayList<String[]>();
    }

    private void addtoArray(String key, String value) {
        String[] arr = new String[2];
        arr[0] = key;
        arr[1] = value;
        keys.add(arr);
    }

    public String getType() {
        return type;
    }

    public String getKeyword() {
        return keyword;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getJournal() {
        return journal;
    }

    public int getVolume() {
        return volume;
    }

    public int getNumber() {
        return number;
    }

    public int getYear() {
        return year;
    }

    public String getPages() {
        return pages;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getAddress() {
        return address;
    }

    public String getBooktitle() {
        return booktitle;
    }

    public String getNote() {
        return note;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public void setTitle(String title) {
        this.title = title;
        addtoArray("Title", title);
    }

    public void setAuthor(String author) {
        this.author = author;
        addtoArray("Author", author);
    }

    public void setJournal(String journal) {
        this.journal = journal;
        addtoArray("Journal", journal);
    }

    public void setVolume(int volume) {
        this.volume = volume;
        addtoArray("Volume", Integer.toString(volume));
    }

    public void setNumber(int number) {
        this.number = number;
        addtoArray("Number", Integer.toString(number));
    }

    public void setYear(int year) {
        this.year = year;
        addtoArray("Year", Integer.toString(year));
    }

    public void setPages(String pages) {
        this.pages = pages;
        addtoArray("Pages", pages);
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
        addtoArray("Publisher", publisher);
    }

    public void setAddress(String address) {
        this.address = address;
        addtoArray("Address", address);
    }

    public void setBooktitle(String booktitle) {
        this.booktitle = booktitle;
        addtoArray("Booktitle", booktitle);
    }

    public void setNote(String note) {
        this.note = note;
        addtoArray("Note", note);
    }

    @Override
    public String toString() {
        if (!title.equals("")) {
            return title;
        }
        return note;
    }

    public String getBibtex() {
        String bibTex = this.type + "{" + this.keyword + ",\n";
        for (String[] key : keys) {
            if (!key[1].equals("") && !key[1].equals("0")) {
                bibTex += "  " + key[0] + " = {" + key[1] + "},\n";
            }
        }
        bibTex += "}\n";

        return bibTex;
    }

    public String getInfo() {
        String info = type.substring(1,2).toUpperCase() + type.substring(2).toLowerCase() + "\n--------------\n";
        info += "Keyword:\t\t" + keyword + "\n";
        for(String[] key : keys){
            if (!key[1].equals("") && !key[1].equals("0")) {
                info += key[0] + ":\t\t" + key[1] + "\n"; 
            }
        }
        return info;
    }
}
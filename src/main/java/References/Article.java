package References;

import References.Reference;

public class Article implements Reference {

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

    public Article(String keyword, String title, String author, String journal, int volume, int number, int year, String pages, String publisher, String address) {
        this.keyword = keyword;
        this.title = title;
        this.author = author;
        this.journal = journal;
        this.volume = volume;
        this.number = number;
        this.pages = pages;
        this.year = year;
        this.publisher = publisher;
        this.address = address;
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

    @Override
    public String toString() {
        return "Article: " + keyword + ", " + author + ": " + title;
    }

    public String getBibtex() {
        return "@article{" + this.getKeyword() + ",\n"
                + "author = {" + this.getAuthor() + "},\n"
                + "title = {" + this.getTitle() + "},\n"
                + "journal = {" + this.getJournal() + "},\n"
                + "volume = {" + this.getVolume() + "},\n"
                + "number = {" + this.getNumber() + "},\n"
                + "year = {" + this.getYear() + "},\n"
                + "pages = {" + this.getPages() + "},\n"
                + "publisher = {" + this.getPublisher() + "},\n"
                + "address = {" + this.getAddress() + "},\n"
                + "}\n";
    }

    public String getInfo() {
        return " Keyword:\t\t" + this.getKeyword()
                + "\n Title:\t\t" + this.getTitle()
                + "\n Author:\t\t" + this.getAuthor()
                + "\n Number:\t\t" + this.getNumber()
                + "\n Volume:\t\t" + this.getVolume()
                + "\n Year:\t\t" + this.getYear()
                + "\n Journal:\t\t" + this.getJournal()
                + "\n Publisher:\t" + this.getPublisher()
                + "\n Address:\t\t" + this.getAddress();
    }
}

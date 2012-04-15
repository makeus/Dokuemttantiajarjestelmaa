package References;

public class Inproceeding implements Reference {

    private String keyword;
    private String title;
    private String author;
    private int year;
    private String publisher;
    private String booktitle;
    private String pages;
    

    public Inproceeding(String keyword, String title, String author, int year, String publisher, String booktitle, String pages) {
        this.keyword = keyword;
        this.title = title;
        this.author = author;
        this.year = year;
        this.booktitle = booktitle;
        this.pages = pages;
        this.publisher = publisher;
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

    public int getYear() {
        return year;
    }

    public String getPublisher() {
        return publisher;
    }
    
    public String getBooktitle(){
        return booktitle;
    }
    public String getPages(){
        return pages;
    }

    @Override
    public String toString() {
        return "Inproceeding: " + keyword + ", " + author + ": " + title;
    }

    public String getBibtex() {
        return "@inproceeding{" + this.getKeyword() + ",\n"
                + "author = {" + this.getAuthor() + "},\n"
                + "title = {" + this.getTitle() + "},\n"
                + "year = {" + this.getYear() + "},\n"
                + "booktitle = {" + this.getBooktitle() + "}, \n"
                + "pages = {" + this.getPages() + "}, \n"
                + "publisher = {" + this.getPublisher() + "},\n"
                + "}\n";
    }

    public String getInfo() {
        return " Keyword:\t\t" + this.getKeyword()
                + "\n Title:\t\t" + this.getTitle()
                + "\n Author:\t\t" + this.getAuthor()
                + "\n Year:\t\t" + this.getYear()
                + "\n Booktitle:\t" + this.getBooktitle()
                + "\n Pages:\t\t" + this.getPages()
                + "\n Publisher:\t" + this.getPublisher();
    }
}

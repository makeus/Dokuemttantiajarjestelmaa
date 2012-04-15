package References;

public class Book implements Reference {

    private String keyword;
    private String title;
    private String author;
    private int year;
    private String publisher;

    public Book(String keyword, String title, String author, int year, String publisher) {
        this.keyword = keyword;
        this.title = title;
        this.author = author;
        this.year = year;
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

    @Override
    public String toString() {
        return "Book: " + keyword + ", " + author + ": " + title;
    }

    public String getBibtex() {
        return "@book{" + this.getKeyword() + ",\n"
                + "author = {" + this.getAuthor() + "},\n"
                + "title = {" + this.getTitle() + "},\n"
                + "year = {" + this.getYear() + "},\n"
                + "publisher = {" + this.getPublisher() + "},\n"
                + "}\n";
    }

    public String getInfo() {
        return " Keyword:\t\t" + this.getKeyword()
                + "\n Title:\t\t" + this.getTitle()
                + "\n Author:\t\t" + this.getAuthor()
                + "\n Year:\t\t" + this.getYear()
                + "\n Publisher:\t" + this.getPublisher();
    }
}
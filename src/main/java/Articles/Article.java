package Articles;


public class Article {
    private String title;
    private String author;
    private String journal;
    private int volume;
    private int number;
    private int year;
    private String pages;
    private String publisher;
    private String address;
    
    public Article(String title, String author, String journal, int volume, int number, int year, String pages, String publisher, String address) {
        this.title = title;
        this.author = author;
        this.journal = journal;
        this.volume = volume;
        this.number = number;
        this.pages = pages;
        this.publisher = publisher;
        this.address = address;
    }
    
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public String getJournal(){
        return journal;
    }
    public int getVolume(){
        return volume;
    }
    public int getNumber(){
        return number;
    }
    public String getPages(){
        return pages;
    }
    public String getPublisher(){
        return publisher;
    }
    public String getAddress(){
        return address;
    }
}

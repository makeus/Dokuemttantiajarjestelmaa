package References;

public class Reference {

    private String type;
    private String keyword = "";
    private String title = "";
    private String author = "";
    private String journal = "";
    private int volume = 0;
    private int number = 0;
    private int year = 0;
    private String pages = "";
    private String publisher = "";
    private String address = "";
    private String booktitle = "";

    public Reference() {
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

    public void setType(String type) {
        this.type = type;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }
    
    public void setTitle(String title){
        this.title = title;
    }
    
    public void setAuthor(String author){
        this.author = author;
    }
    
    public void setJournal(String journal){
        this.journal = journal;
    }
    
    public void setVolume(int volume){
        this.volume = volume;
    }
    
    public void setNumber(int number){
        this.number = number;
    }
    
    public void setYear(int year){
        this.year = year;
    }
    
    public void setPages(String pages){
        this.pages = pages;
    }
    
    public void setPublisher(String publisher){
        this.publisher = publisher;
    }
    
    public void setAddress(String address){
        this.address = address;
    }
    
    public void setBooktitle(String booktitle){
        this.booktitle = booktitle;
    }

    @Override
    public String toString() {
        return type.replace("@", "").toLowerCase() + ": " + keyword + ", " + author + ": " + title;
    }

    public String getBibtex() {
        return this.type + "{" + this.getKeyword() + ",\n"
                + "author = {" + this.getAuthor() + "},\n"
                + "title = {" + this.getTitle() + "},\n"
                + "journal = {" + this.getJournal() + "},\n"
                + "volume = {" + this.getVolume() + "},\n"
                + "number = {" + this.getNumber() + "},\n"
                + "year = {" + this.getYear() + "},\n"
                + "pages = {" + this.getPages() + "},\n"
                + "booktitle = {" + this.getBooktitle() + "},\n"
                + "publisher = {" + this.getPublisher() + "},\n"
                + "address = {" + this.getAddress() + "},\n"
                + "}\n";
    }

    public String getInfo() {
        return type.replace("@", "").toLowerCase() + "\n"
                + " Keyword:\t\t" + this.getKeyword()
                + "\n Title:\t\t" + this.getTitle()
                + "\n Author:\t\t" + this.getAuthor()
                + "\n Number:\t\t" + this.getNumber()
                + "\n Volume:\t\t" + this.getVolume()
                + "\n Year:\t\t" + this.getYear()
                + "\n Booktitle:\t\t" + this.getBooktitle()
                + "\n Journal:\t\t" + this.getJournal()
                + "\n Publisher:\t" + this.getPublisher()
                + "\n Address:\t\t" + this.getAddress();
    }
}
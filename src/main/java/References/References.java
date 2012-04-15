package References;

import Data_Access.FileManager;
import java.util.ArrayList;
import java.util.List;

public class References {

    private Articles articles;
    private Books books;
    private Inproceedings inproceedings;
    private FileManager fileManager;

    public References(FileManager fileManager, Articles articles, Books books, Inproceedings inproceedings) {
        this.fileManager = fileManager;
        this.books = books;
        this.inproceedings = inproceedings;
        this.articles = articles;
    }

    public void addArticle(String keyword, String title, String author, String journal, int volume, int number, int year, String pages, String publisher, String address) {
        articles.addArticle(keyword, title, author, journal, volume, number, year, pages, publisher, address);
    }

    public List<Article> getArticles() {
        return articles.getArticles();
    }

    public void addBook(String keyword, String title, String author, int year, String publisher) {
        books.addBook(keyword, title, author, year, publisher);
    }

    public List<Book> getBooks() {
        return books.getBooks();
    }

    public void addInproceeding(String keyword, String title, String author, int year, String publisher, String booktitle, String pages) {
        inproceedings.addInproceeding(keyword, title, author, year, publisher, booktitle, pages);
    }

    public List<Inproceeding> getInproceeding() {
        return inproceedings.getInproceedings();
    }

    public boolean openFile(String filename) {
        return fileManager.openFile(filename);
    }

    public boolean createFile(String filename) {
        return fileManager.createFile(filename);
    }

    public boolean saveFile() {
        return fileManager.saveFile(this.getReferences());
    }

    public boolean saveAs(String filename) {
        return fileManager.saveAs(this.getReferences(), filename);
    }

    public List<Reference> getReferences() {
        List<Reference> ret = new ArrayList<Reference>();
        for (Article article : articles.getArticles()) {
            ret.add(article);
        }
        for (Book book : books.getBooks()) {
            ret.add(book);
        }
        for (Inproceeding inproceeding : inproceedings.getInproceedings()) {
            ret.add(inproceeding);
        }

        return ret;
    }
}

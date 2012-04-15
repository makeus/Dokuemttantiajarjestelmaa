package References;

import Data_Access.FileManager;
import java.util.ArrayList;
import java.util.List;


public class Books {

    private List<Book> books;
    private FileManager fileManager;

    public Books(FileManager fileManager) {
        this.fileManager = fileManager;
        books = new ArrayList<Book>();
    }

    public List<Book> getBooks() {
        if (fileManager.isOpen()) {
            List<Book> infile = fileManager.getBooks();
            for (Book book : infile) {
                boolean contains = false;
                for (Book inbook : books) {
                    if (inbook.getKeyword().equals(book.getKeyword())) {
                        contains = true;
                    }
                }
                if (!contains) {
                    books.add(book);
                }
            }
        }

        return books;
    }

    public void addBook(String keyword, String title, String author, int year, String publisher) {
        books.add(new Book(keyword, title, author, year, publisher));
    }
}

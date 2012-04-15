package References;

import Articles.Article;
import Articles.Articles;
import Data_Access.FileManager;
import java.util.ArrayList;
import java.util.List;

public class References {

    private Articles articles;
    private FileManager fileManager;

    public References(FileManager fileManager, Articles articles) {
        this.fileManager = fileManager;
        this.articles = articles;
    }

    public void addArticle(Article article) {
        articles.addArticle(article);
    }

    public List<Article> getArticles() {
        return articles.getArticles();
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
        return ret;
    }
}

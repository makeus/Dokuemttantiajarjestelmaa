package Articles;

import Data_Access.FileManager;
import java.util.ArrayList;
import java.util.List;

public class Articles {

    private List<Article> articles;
    private FileManager fileManager;

    public Articles(FileManager fileManager) {
        this.fileManager = fileManager;
        articles = new ArrayList<Article>();
    }

    public List<Article> getArticles() {
        if (fileManager.isOpen()) {
            List<Article> infile = fileManager.getArticles();
            for (Article article : infile) {
                boolean contains = false;
                for (Article inarticles : articles) {
                    if (inarticles.getKeyword().equals(article.getKeyword())) {
                        contains = true;
                    }
                }
                if (!contains) {
                    articles.add(article);
                }
            }
        }

        return articles;
    }

    public void addArticle(Article article) {
        articles.add(article);
    }
}

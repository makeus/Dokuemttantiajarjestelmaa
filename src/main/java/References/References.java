package References;

import Articles.Article;
import Articles.Articles;
import java.util.List;

public class References {
    
    private Articles articles;
    
    public References(Articles articles){
        this.articles = articles;
    }
    
    public void addArticle(Article article){
        articles.addArticle(article);
    }
    
    public List<Article> getArticles(){
        return articles.getArticles();
    }
}

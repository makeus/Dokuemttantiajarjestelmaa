package Articles;

import java.util.ArrayList;
import java.util.List;

public class Articles {
    private List<Article> articles;
    
    public Articles(){
        articles = new ArrayList<Article>();
    }
    
    public List<Article> getArticles(){
        return articles;
    }
    
    public void addArticle(Article article){
        articles.add(article);
    }
}

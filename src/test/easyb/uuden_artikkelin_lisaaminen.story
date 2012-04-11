import App.*
import Articles.*
import References.*
import User_Interface.*

Description 'Käyttäjä voi lisätä artikkelin lähdeviitteenä oikeilla tai väärilla tiedoilla' 

Scenario 'Käyttäjä lisää artikkelin tiedoilla' {
	given 'Artikkelin lisäys valittu'{
        articles = new Articles()
        article = new Article("ABC", "Aakkosista", "Olli Opettaja", "Opettaja-lehti", 13, 11, 2001, "13-31", "Opettajaliitto", "Omenakuja 3")
        }
	when 'Artikkelin tiedot on annettu'{
        articles.addArticle(article)
        }
	then 'Uusi artikkeli lisätään'{
        articles.getArticles().get(0)==article
        }
}

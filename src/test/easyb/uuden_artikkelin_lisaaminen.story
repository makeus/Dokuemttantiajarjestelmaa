import App.*
import Articles.*
import References.*
import User_Interface.*
import org.fest.swing.fixture.* 
import java.awt.Dimension

description 'Käyttäjä voi lisätä artikkelin lähdeviitteenä oikeilla tai väärilla tiedoilla' 

scenario 'Käyttäjä lisää artikkelin tiedoilla', {
	given 'Artikkelin lisäys valittu', {
            artikkelit = new Articles()
            referenssit = new References(artikkelit) 
            window = new GUI(referenssit)
            window.show()
        }
	when 'Artikkelin tiedot on annettu', {
            window.textBox("keyword").enterText("ABC")
            window.textBox("author").enterText("Olli Opettaja")
            window.textBox("title").enterText("Aakkosista")
            window.textBox("journal").enterText("Opettajalehti")
            window.textBox("pages1").enterText("1")
            window.textBox("pages2").enterText("2")
            window.textBox("publisher").enterText("Opettajaliitto")
            window.textBox("address").enterText("Omenakuja 3")
        }
        and 'Add painiketta painetaan', {
            window.button("submit").click()
        }
	then 'Uusi artikkeli lisätään', {
            window.label("Article created").requireText("Article successfully created!")
        }
}

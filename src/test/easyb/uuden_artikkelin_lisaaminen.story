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
            window.keyword.setText("ABC")
            window.author.setText("Olli Opettaja")
            window.journal.setText("Opettajalehti")
            window.volume.setValue(3)
            window.number.setValue(2)
            window.year.setValue(2012)
            window.pages1.setText("1")
            window.pages2.setText("2")
            window.publisher.setText("Opettajaliitto")
            window.address.setText("Omenakuja 3")
        }
        and 'Add painiketta painetaan', {
            window.submit.doClick()
        }
	then 'Uusi artikkeli lisätään', {
            true==true
        }
}

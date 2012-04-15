import App.*
import References.*
import User_Interface.*
import Data_Access.*
import org.fest.swing.fixture.* 
import java.awt.Dimension
import java.util.List
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


description 'Käyttäjä voi lisätä artikkelin lähdeviitteenä oikeilla tai väärilla tiedoilla' 

scenario 'Käyttäjä lisää artikkelin tiedoilla', {
	given 'Artikkelin lisäys valittu', {
            ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-context.xml");
            referenssit = (References) ctx.getBean(References.class);
            window = (GUI) ctx.getBean(GUI.class);
            //window.show()
        }
	when 'Artikkelin tiedot on annettu', {
            window.newArticleMouseClicked()
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
            window.submit.doClick(2)
        }
	then 'Uusi artikkeli lisätään', {
            !referenssit.getReferences().isEmpty()
        }
}

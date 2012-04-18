import App.*
import References.*
import User_Interface.*
import Data_Access.*
import org.fest.swing.fixture.* 
import java.awt.Dimension;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

description 'Käyttäjä voi tallentaa lähdeviitteet tiedostoon' 

scenario 'Käyttäjä tallentaa lisäämänsä lähdeviitteet tiedostoon', {
	given 'Lähdeviitteen lisäys valittu', {
            ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-context.xml");
            referenssit = (References) ctx.getBean(References.class);
            window = (GUI) ctx.getBean(GUI.class);
            //window.show()
        }
	and 'Artikkelin tiedot on annettu', {
            window.newArticleMouseClicked()
            window.type.setSelectedItem("@article")
            window.typeActionPerformed()
            window.author.setText("Olli Opettaja")
            window.addmoreActionPerformed()
            window.referencetitle.setText("Aakkoset")
            window.journal.setText("Opettajalehti")
            window.volume.setValue(3)
            window.number.setValue(2)
            window.year.setValue(2012)
            window.yearStateChanged()
            window.pages1.setText("1")
            window.pages2.setText("2")
            window.publisher.setText("Opettajaliitto")
            window.address.setText("Omenakuja 3")
            window.submit.doClick(2)
        }
        when 'Käyttäjä valitsee tallenna', {
            window.references.saveAs("test.test")
        }
	then 'Lähdeviite tallentuu tiedostoon', {
            String filename = "test.test"
            File file = new File(filename)
            file.exists().shouldBe true
            file.delete()
        }
}
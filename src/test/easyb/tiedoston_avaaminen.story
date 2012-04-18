import App.*
import References.*
import User_Interface.*
import Data_Access.*
import org.fest.swing.fixture.* 
import java.awt.Dimension;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

description 'Käyttäjä voi avata lähdeviitteet sisältävän tiedoston' 

scenario 'Käyttäjä avaa tallentamansa tiedoston', {
	given 'Käyttäjä käynnistää ohjelman', {
            ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-context.xml");
            referenssit = (References) ctx.getBean(References.class);
            window = (GUI) ctx.getBean(GUI.class);
            //window.show()
        }
	
        when 'Käyttäjä valitsee avaa', {
            window.references.openFile("tiedostonavaaminen.test")
        }
	then 'Tallennetut lähdeviitteet avautuvat', {
            !referenssit.getReferences().isEmpty()
        }
}
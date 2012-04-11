import App.*
import Articles.*
import References.*
import User_Interface.*
import org.fest.swing.fixture.* 
import java.awt.Dimension

description 'Käyttäjä voi tulostaa tallennetut lähdeviitteet' 

scenario 'Käyttäjä tulostaa tallennetut lähdeviitteet', {
	given 'Käyttäjä avaa ohjelman', {
            artikkelit = new Articles()
            referenssit = new References(artikkelit) 
            window = new GUI(referenssit)
            window.show()
        }
        when 'käyttäjä valitsee tulosta lähdeviitteet', {
            window.print.doClick()
        }
	then 'Tallennetut lähdeviitteet näytetään', {
            window.getCurrentpage().shouldHave("page2")
        }
}
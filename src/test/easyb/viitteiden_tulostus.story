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
            window.show(new Dimension(500,500))
        }
        when 'käyttäjä valitsee tulosta lähdeviitteet', {
            window.button("Print References").click()
        }
	then 'Tallennetut lähdeviitteet näytetään', {
            window.getCurrentpage().shouldHave("page2")
        }
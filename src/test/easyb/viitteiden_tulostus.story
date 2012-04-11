import App.*
import Articles.*
import References.*
import User_Interface.*

description 'Käyttäjä voi tulostaa tallennetut lähdeviitteet' 

scenario 'Käyttäjä tulostaa tallennetut lähdeviitteet', {
	given 'Käyttäjä avaa ohjelman'{
            window = new GUI(new References(new Articles))
            window.show()
        }
        when 'käyttäjä valitsee tulosta lähdeviitteet', {
            window.button("Print References").click()
        }
	then 'Tallennetut lähdeviitteet näytetään', {
            window.getCurrentpage().shouldHave("page2")
        }
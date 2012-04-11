import App.*
import Articles.*
import References.*
import User_Interface.*

Description 'Käyttäjä voi tulostaa tallennetut lähdeviitteet' 

Scenario 'Käyttäjä tulostaa tallennetut lähdeviitteet' {
	given 'Lähdeviitteiden tulostus valittu'{
        articles = new Articles()
        article = new Article("ABC", "Aakkosista", "Olli Opettaja", "Opettaja-lehti", 13, 11, 2001, "13-31", "Opettajaliitto", "Omenakuja 3")
        
        }
	then 'Tallennetut lähdeviitteet näytetään'{
        
        }

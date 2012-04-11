import App.*
import Articles.*
import References.*
import User_Interface.*

description 'Käyttäjä voi lisätä artikkelin lähdeviitteenä oikeilla tai väärilla tiedoilla' 

Scenario 'Käyttäjä lisää artikkelin tiedoilla' {
	given 'Artikkelin lisäys valittu'{
            window = new GUI(new References())
            window.show()
        }
	when 'Artikkelin tiedot on annettu'{
            window.textBox("keyword").enterText("ABC")
            window.textBox("author").enterText("Olli Opettaja")
            window.textBox("title").enterText("Aakkosista")
            window.textBox("journal").enterText("Opettajalehti")
            window.textBox("pages1").exterText("1")
            window.textBox("pages2").exterText("2")
            window.textBox("publisher").exterText("Opettajaliitto")
            window.textBox("address").exterText("Omenakuja 3")
        }
        and 'Add painiketta painetaan'{
            window.button("add").click()
        }
	then 'Uusi artikkeli lisätään'{
            window.label("Article created").requireText("Article successfully created!")
        }
}

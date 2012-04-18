import App.*
import References.*
import User_Interface.*
import Data_Access.*
import org.fest.swing.fixture.* 
import java.awt.Dimension
import java.util.List
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


description 'Käyttäjä voi lisätä lähdeviitteen oikeilla tai väärilla tiedoilla' 

scenario 'Käyttäjä lisää artikkelin tiedoilla', {
	given 'Lähdeviitteen lisäys valittu', {
            ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-context.xml");
            referenssit = (References) ctx.getBean(References.class);
            window = (GUI) ctx.getBean(GUI.class);
            //window.show()
        }
	when 'Artikkelin tiedot on annettu', {
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
        }
        and 'Add painiketta painetaan', {
            window.submit.doClick(2)
        }
	then 'Uusi lähdeviite lisätään', {
            !referenssit.getReferences().isEmpty()
        }
}

scenario 'Käyttäjä lisää kirjan tiedoilla', {
	given 'Lähdeviitteen lisäys valittu', {
            ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-context.xml");
            referenssit = (References) ctx.getBean(References.class);
            window = (GUI) ctx.getBean(GUI.class);
            //window.show()
        }
	when 'Kirjan tiedot on annettu', {
            window.newArticleMouseClicked()
            window.type.setSelectedItem("@book")
            window.typeActionPerformed()
            window.author.setText("Olli Opettaja")
            window.addmoreActionPerformed()
            window.referencetitle.setText("Aakkoset")
            window.year.setValue(2012)
            window.yearStateChanged()
            window.pages1.setText("1")
            window.pages2.setText("2")
            window.publisher.setText("Opettajaliitto")
            window.address.setText("Omenakuja 3")
        }
        and 'Add painiketta painetaan', {
            window.submit.doClick(2)
        }
	then 'Uusi lähdeviite lisätään', {
            !referenssit.getReferences().isEmpty()
        }
}

scenario 'Käyttäjä lisää konferenssi tekstin tiedoilla', {
	given 'Lähdeviitteen lisäys valittu', {
            ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-context.xml");
            referenssit = (References) ctx.getBean(References.class);
            window = (GUI) ctx.getBean(GUI.class);
            //window.show()
        }
	when 'Konferenssitekstin tiedot on annettu', {
            window.newArticleMouseClicked()
            window.type.setSelectedItem("@inproceeding")
            window.typeActionPerformed()
            window.author.setText("Olli Opettaja")
            window.addmoreActionPerformed()
            window.referencetitle.setText("Aakkoset")
            window.booktitle.setText("Opettajan ABC")
            window.year.setValue(2012)
            window.yearStateChanged()
            window.pages1.setText("1")
            window.pages2.setText("2")
            window.publisher.setText("Opettajaliitto")
            window.address.setText("Omenakuja 3")
        }
        and 'Add painiketta painetaan', {
            window.submit.doClick(2)
        }
	then 'Uusi lähdeviite lisätään', {
            !referenssit.getReferences().isEmpty()
        }
}

scenario 'Käyttäjä lisää sekalaisen tiedoilla', {
	given 'Lähdeviitteen lisäys valittu', {
            ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-context.xml");
            referenssit = (References) ctx.getBean(References.class);
            window = (GUI) ctx.getBean(GUI.class);
            //window.show()
        }
	when 'Sekalaiset tiedot on annettu', {
            window.newArticleMouseClicked()
            window.type.setSelectedItem("@misc")
            window.typeActionPerformed()
            window.author.setText("Olli Opettaja")
            window.addmoreActionPerformed()
            window.note.setText("opettaja.fi/opas")
        }
        and 'Add painiketta painetaan', {
            window.submit.doClick(2)
        }
	then 'Uusi sekalainen lisätään', {
            !referenssit.getReferences().isEmpty()
        }
}
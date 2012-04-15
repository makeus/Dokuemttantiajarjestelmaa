import App.*
import References.*
import User_Interface.*
import Data_Access.*
import org.fest.swing.fixture.* 
import java.awt.Dimension;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

description 'Käyttäjä voi tulostaa tallennetut lähdeviitteet' 

scenario 'Käyttäjä tulostaa tallennetut lähdeviitteet', {
	given 'Käyttäjä avaa ohjelman', {
            ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-context.xml");
            window = (GUI) ctx.getBean(GUI.class);
            //window.show();
        }
        when 'käyttäjä valitsee tulosta lähdeviitteet', {
            window.printMouseClicked();
        }
	then 'Tallennetut lähdeviitteet näytetään', {
            window.getCurrentpage().shouldHave("page2");
        }
}
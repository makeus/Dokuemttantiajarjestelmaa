package App;

import User_Interface.GUI;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {     
                ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-context.xml");
                GUI gui = (GUI) ctx.getBean(GUI.class);
                gui.setVisible(true);
    }
}

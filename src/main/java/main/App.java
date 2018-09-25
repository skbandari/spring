package main;

import beans.MyBean;
import config.AppContextConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        //Instantiate the IOC Container
       // ApplicationContext context = new ClassPathXmlApplicationContext("app-context-config.xml");
        ApplicationContext context = new AnnotationConfigApplicationContext(AppContextConfig.class);
        //Exctract the MyBean bean

        MyBean myBean = context.getBean("myBean", MyBean.class);
        myBean.hello();

        ((ConfigurableApplicationContext) context).close();
    }
}

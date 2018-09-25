package mediaplayer;

import beans.MyBean;
import config.AppContextConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Play2 {
    public static void main(String[] args) {
        //Instantiate the IOC Container
        // ApplicationContext context = new ClassPathXmlApplicationContext("app-context-config.xml");
        ApplicationContext context = new AnnotationConfigApplicationContext(AppContextConfig.class);
        //Exctract the MyBean bean

        MediaPlayer mediaPlayer = context.getBean("mediaPlayer", MediaPlayer.class);
        mediaPlayer.play();

        ((ConfigurableApplicationContext) context).close();
    }
}

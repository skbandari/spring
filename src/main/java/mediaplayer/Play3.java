package mediaplayer;

import config.AppContextConfig;
import config.AppContextConfig3;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Play3 {
    public static void main(String[] args) {
        //Instantiate the IOC Container
        // ApplicationContext context = new ClassPathXmlApplicationContext("app-context-config.xml");
        ApplicationContext context = new AnnotationConfigApplicationContext(AppContextConfig3.class);
        //Exctract the MyBean bean

        MediaPlayer mediaPlayer = context.getBean("mediaPlayer", MediaPlayer.class);
        mediaPlayer.play();

        ((ConfigurableApplicationContext) context).close();
    }
}

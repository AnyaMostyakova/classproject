package classproject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import classproject.config.Config;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);

        MainClass MainClass = (MainClass) context.getBean("MainClass");
        MainClass.run();

    }
}
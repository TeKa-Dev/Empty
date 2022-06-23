package spring_javaclass_config;

import abstract_model.Animal;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring_javaclass_config.configuration.Config;
import spring_javaclass_config.model.Bird;
import spring_javaclass_config.model.Fish;

public class Main {
    static ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

    public static void main(String[] args) {
        System.out.println(context.getBean(Bird.class));
        System.out.println(context.getBean("bub", Fish.class));
        System.out.println(context.getBean("some"));
    }
}

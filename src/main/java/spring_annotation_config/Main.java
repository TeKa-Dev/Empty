package spring_annotation_config;

import abstract_model.Animal;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import spring_annotation_config.model.Dog;
import spring_annotation_config.model.Mouse;

@Controller
@Service
@Repository
public class Main {
    static ApplicationContext context =
            new AnnotationConfigApplicationContext("spring_annotation_config.model", "abstract_model");

    public static void main(String[] args) {
        System.out.println(context.getBean(Dog.class));
        System.out.println(context.getBean("cat"));
        System.out.println(context.getBean("miki", Mouse.class));

        System.out.println(context.getBean("dog", Animal.class));

    }
}

package spring_annotation_config.model;

import abstract_model.Animal;
import org.springframework.stereotype.Component;

@Component
public class Cat extends Animal {

    int lives;

    public Cat() {
        super("Fellini");
    }

}

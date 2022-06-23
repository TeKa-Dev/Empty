package spring_annotation_config.model;

import abstract_model.Animal;
import org.springframework.stereotype.Component;

@Component
public class Dog extends Animal {


    protected Dog() {
        super("Bobby");
    }
}

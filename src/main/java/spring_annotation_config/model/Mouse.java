package spring_annotation_config.model;

import abstract_model.Animal;
import org.springframework.stereotype.Component;

@Component("miki")
public class Mouse extends Animal {

    protected Mouse() {
        super("Miki-Mouse");
    }
}

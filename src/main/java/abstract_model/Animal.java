package abstract_model;

import org.springframework.stereotype.Component;

@Component
public abstract class Animal {

    private final String name;

    protected Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "\nAnimal{" +
                this.getClass().getSimpleName() +
                " name = '" + name + '\'' +
                '}';
    }
}

package spring_javaclass_config.model;

import abstract_model.Animal;

public class Fish extends Animal {

    private final Bird friend;

    public Fish(Bird friend) {
        super("Bubble");
        this.friend = friend;
    }

    @Override
    public String toString() {
        return "\nAnimal{" +
                this.getClass().getSimpleName() +
                " name = '" + super.getName() + '\'' +
                " friend = '" + friend.getName() + '\'' +
                '}';
    }
}

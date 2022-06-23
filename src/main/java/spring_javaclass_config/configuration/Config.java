package spring_javaclass_config.configuration;

import abstract_model.Animal;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import spring_javaclass_config.model.Bird;
import spring_javaclass_config.model.Fish;

@Configuration
public class Config {

    @Bean
    public Bird  bird() {
        return new Bird();
    }

    @Bean("bub")
    public Animal fish(Bird friend) {
        return new Fish(friend);
    }

    @Bean
    public Animal some() {
        return new Animal("unnamed") {};
    }
}
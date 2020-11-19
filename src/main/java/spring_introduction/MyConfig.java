package spring_introduction;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("myApp.properties")
public class MyConfig {

    @Bean
    public Pet cat(){
        return new Cat();
    }

    @Bean
    public Person person(){
        return new Person(cat());
    }
}

package spring_introduction;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("dogBean")
public class Dog implements Pet{

    @PostConstruct
    public void init (){
        System.out.println("method init");
    }

    @PreDestroy
    public void destroy (){
        System.out.println("method destroy");
    }
    @Override
    public void say(){
        System.out.println("Bow-Wow");
    }
}

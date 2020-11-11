package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Pet pet = context.getBean("idPet", Pet.class);
        pet.say();
    }
}

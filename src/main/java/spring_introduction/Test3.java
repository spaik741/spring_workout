package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");
        Pet pet = context.getBean("idPet", Pet.class);
        Pet pet2 = context.getBean("idPet", Pet.class);
        System.out.println(pet==pet2);
        context.close();
    }
}

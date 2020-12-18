package aop;

import aop.MyConfig;
import aop.Student;
import aop.University;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext config = new AnnotationConfigApplicationContext(MyConfig.class);

        University university = config.getBean("university", University.class);
        university.addStudents();
        try {
            List<Student> students = university.getStudents();
            System.out.println(students);
        }catch (Exception e){
            System.out.println("Поймал епт " + e.getMessage());
        }finally {
            config.close();
        }

    }
}

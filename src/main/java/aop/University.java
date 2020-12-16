package aop;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class University {
    private List<Student> students = new ArrayList<Student>();

    public void addStudents(){
        Student student1 = new Student("Misha",2,8.8);
        Student student2 = new Student("Lera",1,10.0);
        Student student3 = new Student("Sonya",4,4.3);
        students.add(student1);
        students.add(student2);
        students.add(student3);
    }

    public List<Student> getStudents() {
        System.out.println("Information from method getStudents:");
        System.out.println(students);
        return students;
    }
}

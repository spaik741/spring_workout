package aop.aspect;

import aop.Student;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UniversityLogicAspect {

/*
    @Before("execution(* getStudents())")
    public void beforeGetStudentsLoggingAdvice(){
        System.out.println("beforeGetStudentsLoggingAdvice()");
    }

    @AfterReturning(pointcut = "execution(* getStudents())", returning = "students")
    public void afterReturningGetStudentsLoggingAdvice(List<Student> students){
        Student firstStudent = students.get(0);
        firstStudent.setNameSurname("Misha.Br");
        System.out.println("afterReturningGetStudentsLoggingAdvice()");
    }
    */
    @AfterThrowing("execution(* getStudents())")
    public void afterThrowingGetStudentsLoggingAdvice(){
        System.out.println("afterThrowingGetStudentsLoggingAdvice");
    }

}

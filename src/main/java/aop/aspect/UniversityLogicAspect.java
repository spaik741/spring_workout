package aop.aspect;

import aop.Student;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
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

    @AfterThrowing("execution(* getStudents())")
    public void afterThrowingGetStudentsLoggingAdvice(){
        System.out.println("afterThrowingGetStudentsLoggingAdvice");
    }
*/
    @Around("execution(public String returnBook())")
    public Object beforeReturnBookLoggingAdvice (ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("До beforeReturnBookLoggingAdvice");
        Object targetMethodResult = proceedingJoinPoint.proceed();
        System.out.println("После beforeReturnBookLoggingAdvice");
        return targetMethodResult;
    }
}

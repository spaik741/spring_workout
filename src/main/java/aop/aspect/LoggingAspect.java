package aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

    @Before("execution(public void get*(aop.Book,..))")
    public void beforeGetBookAdvice(){
        System.out.println("beforeGetBookAdvice");
    }
}

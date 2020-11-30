package aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

    @Pointcut("execution(* get*())")
    private void allGetMethods(){}

    @Pointcut("execution(* return*())")
    private void noReturnMethods(){}

    @Pointcut("allGetMethods() && !noReturnMethods()")
    private void commonMethod(){}

    @Before("commonMethod()")
    public void beforeGetBookAdvice(){
        System.out.println("beforeGetBookAdvice");
    }
}

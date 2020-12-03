package aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class ExceptionAspect {
    @Before("aop.aspect.MyPointcut.allAddMethods()")
    public void beforeAddExceptionAspect(){
        System.out.println("beforeAddExceptionAspect");
    }
}

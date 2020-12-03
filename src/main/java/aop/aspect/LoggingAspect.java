package aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

//    @Pointcut("execution(* get*())")
//    private void allGetMethods(){}
//
//    @Pointcut("execution(* return*())")
//    private void noReturnMethods(){}
//
//    @Pointcut("allGetMethods() && !noReturnMethods()")
//    private void commonMethod(){}
//
//    @Before("commonMethod()")
//    public void beforeGetBookAdvice(){
//        System.out.println("beforeGetBookAdvice");
//    }

    @Before("aop.aspect.MyPointcut.allAddMethods()")
    public void beforeAddBookAdvice(JoinPoint joinPoint) {
        MethodSignature methodSignature = (MethodSignature)joinPoint.getSignature();
        System.out.println("methodSignature = " + methodSignature);
        System.out.println("methodSignature.getMethod() = " + methodSignature.getMethod());
        System.out.println("methodSignature.getReturnType() = " + methodSignature.getReturnType());
        System.out.println("methodSignature.getName() = " + methodSignature.getName());
        System.out.println("beforeAddBookAdvice");
    }
}

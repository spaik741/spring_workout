package aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;


public class MyPointcut {
    @Pointcut("execution(* addd*(..))")
    public void allAddMethods(){}
}

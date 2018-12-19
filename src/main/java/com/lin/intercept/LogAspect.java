package com.lin.intercept;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAspect {

    @Pointcut("@annotation(com.lin.aop.LogPrint)")
    private void printLog(){

    }

    @Before("printLog()")
    public void beforeLog(JoinPoint joinPoint){
        System.out.println("print by log intercept:start");
    }

    @After("printLog()")
    public void afterLog(JoinPoint joinPoint){
        System.out.println("print by log intercept:after");
    }

}

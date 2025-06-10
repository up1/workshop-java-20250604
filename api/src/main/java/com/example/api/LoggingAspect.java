package com.example.api;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Around("execution(* com.example.api..*(..)))")
    public Object profileAllMethods(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        MethodSignature methodSignature = (MethodSignature) proceedingJoinPoint.getSignature();
        String className = methodSignature.getDeclaringType().getSimpleName();
        String methodName = methodSignature.getName();

        Object result = proceedingJoinPoint.proceed();

        return result;
    }

    @Pointcut("execution(* com.example.api..*(..)))")
    public void logPointcut(){
    }

    @Before("logPointcut()")
    public void logAllMethodCallsAdvice(JoinPoint joinPoint){
        System.out.println("In Before Aspect at " + joinPoint.getSignature().getName());
    }

    @After("logPointcut()")
    public void logMethodCallsAfterAdvice(JoinPoint joinPoint) {
        System.out.println("In After Aspect at " + joinPoint.getSignature().getName());
    }

}

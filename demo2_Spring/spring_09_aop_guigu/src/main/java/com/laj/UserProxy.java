package com.laj;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;
/*
    增强的类
 */
@Component
@Aspect//生成代理对象
public class UserProxy {
    @Before(value = "execution(* com.laj.User.add(..))")//切入点表达式
    public void before(){
        System.out.println("before……");
    }
    @After(value = "execution(* com.laj.User.add(..))")
    public void after(){
        System.out.println("after……");
    }
    @AfterReturning(value = "execution(* com.laj.User.add(..))")
    public void afterReturning(){
        System.out.println("afterReturning……");
    }

    @Around(value = "execution(* com.laj.User.add(..))")
    public void around(ProceedingJoinPoint proceedingJoinPoint)throws Throwable{
        System.out.println("环绕通知……前");
        proceedingJoinPoint.proceed();
        System.out.println("环绕通知……后");
    }
}

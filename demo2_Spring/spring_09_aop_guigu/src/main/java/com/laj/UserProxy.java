package com.laj;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
/*
    增强的类
 */
@Component
@Aspect//生成代理对象
public class UserProxy {
    @Before(value = "execution(* com.laj.User.add(..))")//切入点表达式
    public void before(){
        System.out.println("前置增强……");
    }
}

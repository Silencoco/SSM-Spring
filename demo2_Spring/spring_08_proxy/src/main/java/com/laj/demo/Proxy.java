package com.laj.demo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 1、获取代理类
 * 2、实现InvocationHandel 重写invoke
 */
public class Proxy implements InvocationHandler{
    //对接口进行代理
    private Person person;

    public Proxy(Person person) {
        this.person = person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    //生成得到的代理类
    public Object getProxy(){
        return java.lang.reflect.Proxy.newProxyInstance(Proxy.class.getClassLoader(),person.getClass().getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object result = method.invoke(person, args);
        after();
        return result;
    }
    public void before(){
        System.out.println("前置增强");
    }
    public void after(){
        System.out.println("后置增强");
    }
}

package com.laj.atGuiGu;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JdkProxy {
    public static void main(String[] args) {
        Proxy.newProxyInstance(JdkProxy.class.getClassLoader(), UserDao.class.getInterfaces(), new InvocationHandler() {
            //在这里做方法增强处理
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                //方法之前
                System.out.println("方法之前执行");

//                method.invoke();

                //方法之后
                System.out.println("方法之后执行");
                return null;
            }
        });
    }
}

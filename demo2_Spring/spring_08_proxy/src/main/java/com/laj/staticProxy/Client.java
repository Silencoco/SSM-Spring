package com.laj.staticProxy;

public class Client {
    public static void main(String[] args) {
//        UserServiceImpl userService = new UserServiceImpl();
        UserServiceProxy proxy = new UserServiceProxy();//创建代理

        proxy.setUserService(new UserServiceImpl());//设置需要代理的对象
        proxy.add();
    }
}

package com.laj.pojo;

public class UserT {
    private String name ;

    //无参构造
    public UserT(){
        System.out.println("UserT被创建了");
    }
//    public UserT(String name) {
//        this.name = name;
//        System.out.println("创建有参构造");
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void show(){
        System.out.println("name="+name);
    }

}

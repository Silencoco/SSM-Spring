package com.laj.pojo;

/**
 * 总结：在配置文件加载的时候，容器中管理的对象就已经初始化了
 */
public class User {
    private String name;

//    public User() {
//        System.out.println("User的无参构造");
//    }
    public User(String name){
        this.name=name;
        System.out.println("有参构造");
    }

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

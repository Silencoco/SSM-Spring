package com.laj.staticProxy;

public class UserServiceProxy implements UserService{

    private UserServiceImpl userService;//获取实现类代理对象

    public UserServiceImpl getUserService() {
        return userService;
    }

    public void setUserService(UserServiceImpl userService) {
        this.userService = userService;
    }

    public void log(String msg){
        System.out.println("[DEBUG] 使用了"+msg+"方法");
    }
    @Override
    public void add() {
        log("add");
        userService.add();
    }

    @Override
    public void delete() {
        log("delete");
        userService.delete();
    }

    @Override
    public void update() {
        log("update");
        userService.update();
    }

    @Override
    public void query() {
        log("query");
        userService.query();
    }
}

package com.laj.service;

import com.laj.dao.UserDao;
import com.laj.dao.UserDaoImpl;

public class UserServiceImpl implements UserService{
//    private UserDao userDao = new UserDaoImpl();//私有化创建 通过接口实现类调用接口对象
    private UserDao userDao;//私有化创建 通过接口实现类调用接口对象

    /*
    利用set实现动态实现 值的注入
     */
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void getUser() {
        userDao.getUser();
    }
}

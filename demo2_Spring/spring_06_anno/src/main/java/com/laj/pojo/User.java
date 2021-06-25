package com.laj.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component 组件 相当于<bean id="user" class="com.laj.pojo.User"
// 说明这个类被Spring管理了/>
@Component
@Scope("singleton")//单例模式
public class User {
    @Value("coco")
    public String name;
}

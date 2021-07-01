package com.laj.Config;

import com.laj.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan("com.laj.pojo")
@Import(LajConfig.class)
public class LajConfig2 {
    /**
     * 方法的名字相当于bean中的id
     * 方法的返回值，想爱你归档于bean标签中的class属性
     * @return
     */
    @Bean
    public User getUser(){
        return new User();
    }
}

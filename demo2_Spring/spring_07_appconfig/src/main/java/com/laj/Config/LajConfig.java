package com.laj.Config;

import com.laj.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.laj.pojo")
public class LajConfig {

    @Bean
    public User getUser(){
        return new User();
    }
}

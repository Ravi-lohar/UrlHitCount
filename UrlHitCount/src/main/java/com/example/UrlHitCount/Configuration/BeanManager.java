package com.example.UrlHitCount.Configuration;

import com.example.UrlHitCount.Model.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class BeanManager {
    @Bean
    public Map<String , User> getListofUser(){
        return new HashMap<String, User>() ;
    }
}

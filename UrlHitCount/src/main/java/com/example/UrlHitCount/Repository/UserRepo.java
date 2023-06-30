package com.example.UrlHitCount.Repository;

import com.example.UrlHitCount.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public class UserRepo {

    @Autowired
    Map<String , User> userList ;

    public Map<String, User> getUserList() {
        return userList;
    }
}

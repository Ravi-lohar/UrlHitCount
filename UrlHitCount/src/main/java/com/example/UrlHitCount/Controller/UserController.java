package com.example.UrlHitCount.Controller;

import com.example.UrlHitCount.Model.User;
import com.example.UrlHitCount.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RequestMapping("api/v1/visitor-count-app")
@RestController
public class UserController {

    @Autowired
    UserService userService ;
    @GetMapping("userName/{name}/count")
    public User getUserCount(@PathVariable String name){

        return userService.getUserCount(name);

    }
    @GetMapping("count")
    public String getAllCount(){
        return userService.getAllCount();

    }

}

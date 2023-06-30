package com.example.UrlHitCount.Service;

import com.example.UrlHitCount.Model.User;
import com.example.UrlHitCount.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import java.util.Map;
@Service
public class UserService {

    @Autowired
    UserRepo userRepo ;
    public static Integer hitCount = 0 ;
    public Map<String , User> getUserList(){
        return userRepo.getUserList();
    }


    public User getUserCount(String username) {
        Map<String ,User > originalList = getUserList();
            User user = originalList.get(username);
            if(user == null){
                User user1 = new User(username , 1);
                originalList.put(username , user1);
            }
            else{
                Integer value = user.getHitcount();
                user.setHitcount(++value);

                originalList.put(username,user);
            }
            hitCount++;
    return originalList.get(username);

    }

    public String getAllCount() {
        return   "Visitors " + " : " + hitCount ;

    }
}


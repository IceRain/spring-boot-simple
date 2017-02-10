package com.zzb.controller;

import com.zzb.model.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhaozb on 2017/2/10.
 */

@RestController
public class UserController {

    @RequestMapping("/user")
    public String sayHello(){
        User user = new User("zhangsan",23,"男");
        return user.toString();
    }
}

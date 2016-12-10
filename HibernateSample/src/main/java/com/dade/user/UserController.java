package com.dade.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Dade on 2016/12/9.
 */
@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping(value="/user/getUserById")
    public User getUserById(@RequestParam Long id){
        System.out.println("hello user");
        User u = userRepository.findOne(id);
        System.out.println(userRepository);
        System.out.println(u);
        return u;
    }

    @RequestMapping(value="/user/findUserByName")
    public User findUserByName(@RequestParam String name){
        System.out.println("hello user");
        User u = userRepository.findUserByName(name);
        System.out.println(u);
        return u;
    }

}

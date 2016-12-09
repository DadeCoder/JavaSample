package com.dade.hunteruser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * Created by Dade on 2016/12/8.
 */
@RestController
@RequestMapping("/api/hunter_user")
public class HunterUserController {

    @Autowired
    BasicDao basicDao;

    @RequestMapping("/login")
    public String login(){
        HunterUser hunterUser = basicDao.findByName("dade");
        if (hunterUser == null){
            return "null!";
        }
        else{
            return hunterUser.toString();
        }
    }

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public String add(@RequestBody HunterUser hunterUser){
        hunterUser.setId(UUID.randomUUID().toString());
        HunterUser sava = basicDao.save(hunterUser);
        if (sava == null){
            return "null!";
        }
        else{
            return "success!";
        }
    }

}

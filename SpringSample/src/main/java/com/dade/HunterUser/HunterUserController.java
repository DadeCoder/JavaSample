package com.dade.HunterUser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Dade on 2016/12/6.
 */
@RestController
@RequestMapping("api/hunter_user")
public class HunterUserController {

    @Autowired
    HunterUserDao dao;

    @RequestMapping("/test")
    public String testConn(){
        return dao.getCount();
    }


}

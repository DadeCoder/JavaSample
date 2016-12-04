package com.dade.exception;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Dade on 2016/12/1.
 */
@RestController
@RequestMapping("/api/valid")
public class ValidController {

    @RequestMapping(value = "/test",method = RequestMethod.POST)
    public ValidUser test(@RequestBody ValidUser user){

        if (user.getId()==null)
            throw  new ValidException();
        return user;
    }

    @RequestMapping("/test_handler")
    public String testHandler(){
        ValidUser validUser = null;
        return validUser.getId();
    }

}

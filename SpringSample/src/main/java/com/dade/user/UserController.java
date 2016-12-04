package com.dade.user;

import com.dade.exception.AppWideExceptionHandler;
import com.dade.exception.ValidException;
import com.dade.exception.ValidUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Dade on 2016/11/28.
 */
@RestController
@RequestMapping("/api/user")
public class UserController {

//    @ExceptionHandler(NullPointerException.class)
//    public String UserhandlerException(){
//        return "exception/controller";
//    }


    @RequestMapping("/test")
    String test(){
        return "Test for user!";
    }

    @RequestMapping("/con_advice")
    String conAdvice(){
        ValidUser validUser = null;
        return validUser.getId();
    }

}

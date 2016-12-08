package com.dade.test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Dade on 2016/12/8.
 */
@RestController
@RequestMapping("/api/test_controller")
public class MysqlTestController {

    @RequestMapping("/test")
    String test(){
        return "Hello Mysql!";
    }

}

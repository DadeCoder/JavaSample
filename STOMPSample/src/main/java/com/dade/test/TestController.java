package com.dade.test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Dade on 2016/12/4.
 */
@RestController
@RequestMapping("/api/stomp")
public class TestController {

    @RequestMapping("test")
    String test(){
        return "test";
    }

}

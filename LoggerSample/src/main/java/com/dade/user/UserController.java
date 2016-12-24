package com.dade.user;

import com.dade.util.LoggerUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Dade on 2016/12/18.
 */
@RestController
@RequestMapping("/api/user")
public class UserController {


    @RequestMapping("/test")
    String test(){
        MySpringBootApplicationTests.contextLoads();
        return "test";
    }

    @RequestMapping("/logutil")
    String logUtil(){
        LoggerUtil.info("info!");
        LoggerUtil.warn("warn!");
        LoggerUtil.error("error!");
        return "LogUtil!";
    }

}

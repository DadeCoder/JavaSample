package com.dade.util;

import com.dade.user.MySpringBootApplicationTests;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Dade on 2016/12/19.
 */
public class LoggerUtil {

    static final Logger logger = LoggerFactory.getLogger(MySpringBootApplicationTests.class);

    public static void info(String mes){
        logger.info(mes);
    }

    public static void warn(String mes){
        logger.warn(mes);
    }

    public static void error(String mes){
        logger.error(mes);
    }

}

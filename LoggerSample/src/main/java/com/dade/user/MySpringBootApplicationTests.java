package com.dade.user;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Dade on 2016/12/18.
 */
public class MySpringBootApplicationTests {
    static final Logger logger = LoggerFactory.getLogger(MySpringBootApplicationTests.class);

    public static void contextLoads() {
        logger.trace("I am trace log.");
        logger.debug("I am debug log.");
        logger.info("I am info log.");
        logger.warn("I am warn log.");
        logger.error("I am error log.");
    }

}

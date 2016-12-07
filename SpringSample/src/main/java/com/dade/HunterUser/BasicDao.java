package com.dade.HunterUser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcOperations;

/**
 * Created by Dade on 2016/12/6.
 */
public abstract class BasicDao {

    @Autowired
    JdbcOperations jdbcTemplate;

}

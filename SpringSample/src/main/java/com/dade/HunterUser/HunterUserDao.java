package com.dade.HunterUser;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.sql.Connection;

/**
 * Created by Dade on 2016/12/6.
 */
@Component
public class HunterUserDao extends BasicDao {

    public String getCount() {
        return jdbcTemplate.queryForObject("select COUNT(*) from users", String.class);
    }

}

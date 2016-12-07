package com.dade.HunterUser;

import com.mysql.jdbc.Driver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * Created by Dade on 2016/12/6.
 */
@Configuration
public class SpringJDBCConfiguration {

    @Bean
    public DataSource dataSource() {

        String url = "jdbc:mysql://localhost/hunter?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC&useSSL=false";


        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        //dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl(url);
        dataSource.setUsername("root");
        dataSource.setPassword("root");
        return dataSource;



        //DataSource dataSource = new SimpleDriverDataSource(new Driver(), url, "root", "root");
        //return dataSource;
    }

    @Bean
    public JdbcTemplate jdbcTemplate() {
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(dataSource());
        return jdbcTemplate;
    }

}

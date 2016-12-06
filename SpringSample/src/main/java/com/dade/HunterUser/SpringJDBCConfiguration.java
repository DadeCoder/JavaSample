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
    public DataSource dataSource() throws SQLException {
//        //DriverManagerDataSource dataSource = new DriverManagerDataSource();
//        SimpleDriverDataSource dataSource = new SimpleDriverDataSource();
//        //dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
//        dataSource.setUrl("jdbc:mysql://localhost:3306/hunter");
//        dataSource.setUsername("root");
//        dataSource.setPassword("root");
//        return dataSource;

        String url = "jdbc:mysql://localhost/hunter?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";

        DataSource dataSource = new SimpleDriverDataSource(new Driver(), url, "root", "root");
        return dataSource;
    }

    @Bean
    public JdbcTemplate jdbcTemplate() throws SQLException {
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(dataSource());
        return jdbcTemplate;
    }

}

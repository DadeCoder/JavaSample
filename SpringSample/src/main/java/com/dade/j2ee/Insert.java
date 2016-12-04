package com.dade.j2ee;

import org.springframework.beans.factory.annotation.Autowired;

import java.sql.Connection;
import java.sql.Statement;

/**
 * Created by Dade on 2016/12/4.
 */
public class Insert {

    public static void main(String... args) throws Exception{

        DataSource dataSource = new DataSource();
        Connection conn = dataSource.getConnection();
        Statement stat = conn.createStatement();
        String sql = "Insert into T_STU(STUNO,STUNAME,STUSEX) value('0032','张三'，'男')";

        int i = stat.executeUpdate(sql);

        System.out.println("成功添加" + i + "行");
        stat.close();
        conn.close();

    }

}

package com.dade.j2ee;

import java.sql.Connection;
import java.sql.Statement;

/**
 * Created by Dade on 2016/12/4.
 */
public class Delete {

    public static void main(String[] args) throws Exception {
        DataSource dataSource = new DataSource();

        Connection connection = dataSource.getConnection();

        Statement statement = connection.createStatement();

        String sql = "Delete from T_STU where SUTNO=‘0032’";

        int i = statement.executeUpdate(sql);

        System.out.println("成功删除" + i + "行");

        statement.close();
        connection.close();


    }

}

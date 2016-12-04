package com.dade.j2ee;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by Dade on 2016/12/4.
 */
public class Update {

    public static void main(String[] args) throws SQLException {
        DataSource dataSource = new DataSource();

        Connection connection = dataSource.getConnection();

        Statement statement = connection.createStatement();

        String sql = "Update T_STU set STUSEX='女' where STUNO='0007'";

        System.out.println("成功修改");

        statement.close();
        connection.close();


    }

}

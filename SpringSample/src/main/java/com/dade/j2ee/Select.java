package com.dade.j2ee;

import javax.xml.crypto.Data;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by Dade on 2016/12/4.
 */
public class Select {

    public static void main(String[] args) throws SQLException {
        DataSource dataSource = new DataSource();

        Connection connection  = dataSource.getConnection();

        Statement statement = connection.createStatement();

        String sql = "Select STUNO.STUNAME from T_STU where STUSEX='女'";

        ResultSet resultSet = statement.executeQuery(sql);

        while (resultSet.next()){
            String stuno = resultSet.getString("STUNO");
        }

        statement.close();
        connection.close();


    }

}

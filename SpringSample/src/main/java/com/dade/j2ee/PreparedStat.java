package com.dade.j2ee;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by Dade on 2016/12/4.
 */
public class PreparedStat {

    public static void main(String[] args) throws SQLException {

        String stuno = "123";
        String stuname = "Dade";
        String stusex = "female";

        DataSource dataSource = new DataSource();
        Connection connection = dataSource.getConnection();

        String sql = "Insert into T_STU(STUNO,STUNAME,STUSEX) value(?,?,?)";

        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        int one = 1;

        preparedStatement.setString((int)1,stuno);
        preparedStatement.setString((int)2,stuname);
        preparedStatement.setString((int)3,stusex);

        int i = preparedStatement.executeUpdate();

        preparedStatement.close();
        connection.close();

    }

}

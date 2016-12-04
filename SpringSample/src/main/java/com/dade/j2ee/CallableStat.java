package com.dade.j2ee;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;

/**
 * Created by Dade on 2016/12/4.
 */
public class CallableStat {

    public static void main(String[] args) throws SQLException {
        DataSource dataSource = new DataSource();

        Connection connection = dataSource.getConnection();

        CallableStatement callableStatement = connection.prepareCall("{call prc_getStuname(?,?)}");

        callableStatement.setString(1,"0001");
        callableStatement.registerOutParameter(2, Types.CHAR);

        callableStatement.executeQuery();

        String result = callableStatement.getString(2);

        callableStatement.close();
        connection.close();


    }

}

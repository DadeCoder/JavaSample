package com.dade.j2ee;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by Dade on 2016/12/4.
 */
public class Transaction {

    public static void main(String[] args) {

        DataSource dataSource = new DataSource();

        Connection connection = dataSource.getConnection();

        try {

            connection.setAutoCommit(false);

            String stuno = "123";
            String stusex = "male";
            String updateSex = "Update T_STU set STUSEX=? where SUTNO=?";
            String quertSex = "select STUSEX from T_STU where STUNO=?";
            PreparedStatement ps = connection.prepareCall(updateSex);
            ps.setString(1,stuno);
            ps.setString(2,stusex);
            ps.executeUpdate();

            PreparedStatement ps_2 = connection.prepareCall(quertSex);
            ps_2.setString(1,stuno);
            ps_2.executeQuery();

            connection.commit();



        } catch (SQLException e) {
            e.printStackTrace();
            try {
                connection.rollback();
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
        }finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }

}

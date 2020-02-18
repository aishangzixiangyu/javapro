package com.neudu.test5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MyTest {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/db1?useUnicode=true&characterEncoding=utf8";
        String username = "root";
        String password = "123456";
        Connection con = null;
        PreparedStatement pstmt = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");

            con = DriverManager.getConnection(url,username,password);

            pstmt = con.prepareStatement("insert into student(name,age) values ('张华',25)");

            int i = pstmt.executeUpdate();

            System.out.println(i);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally{
            try {
                if(pstmt != null)
                    pstmt.close();
                if(con != null)
                    con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}

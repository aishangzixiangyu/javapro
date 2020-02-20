package com.neudu.util;

import java.lang.reflect.Field;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JdbcUtil {
    private static final String URl = "jdbc:mysql://localhost:3306/db1?useUnicode=true&characterEncoding=utf8";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "123456";
    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    static Connection getConnection(){
        Connection con = null;
        try {
            con = DriverManager.getConnection(URl,USERNAME,PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return con;
    }
    //封装通用的增删改
    public static int executeUpdate(String sql,Object... params){
        int result = 0;
        Connection con = getConnection();
        PreparedStatement pstmt = null;
        try {
            pstmt = con.prepareStatement(sql);
            if(params != null){
                for(int i = 0; i < params.length; i++){
                    pstmt.setObject(i+1,params[i]);
                }
            }
            result = pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            close(con,pstmt);
        }
        return result;
    }
    //封装通用查询
    public static <T> List<T> executeQuery(String sql,Class<T> clz,Object... params){
        List<T> list = new ArrayList<>();
        Connection con = getConnection();
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            pstmt = con.prepareStatement(sql);
            if(params != null){
                for(int i=0; i<params.length;i++){
                    pstmt.setObject(i+1,params[0]);
                }
            }

            rs = pstmt.executeQuery();
            while(rs.next()){
                //创建一个T类型对象
                //该方法是通过反射 class对象 调用  无参构造来创建对象
                T t = clz.newInstance();
                //通过字段名 从rs中拿值  然后复制给对象的属性
                //在不知道 该类有多少个属性的情况下 应该是 有多少个属性 就set多少个属性
                //我们必须先获取有多少个属性
                Field[] field=clz.getDeclaredFields();
                for(Field f : field){
                    //属性名 刚和 数据库字段名一样了
                    //我们就可以把属性名  当做数据库里的字段名了 用rs.getObject(属性名)
                    Object value  = rs.getObject(f.getName());
                    //拿出值后我们就可以属性赋值了
                    f.setAccessible(true);
                    f.set(t,value);
                }
                list.add(t);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } finally {
            close(con,pstmt,rs);
        }
        return list;
    }
    //封装关闭方法
    static void close(Connection con,PreparedStatement pstmt){
        try {
            if(pstmt != null)
                pstmt.close();
            if(con != null)
                con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    static void close(Connection con, PreparedStatement pstmt, ResultSet rs){
        try {
            if(rs != null)
                rs.close();
            close(con,pstmt);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

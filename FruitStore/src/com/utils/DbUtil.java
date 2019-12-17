package com.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DbUtil {
    public  String url = "jdbc:mysql://localhost:3306/shop?useUnicode=true&characterEncoding=utf-8&serverTimezone=GMT%2B8&useSSL=false";
    public  String user = "root";
    public  String password = "123456";
    private Connection conn = null;


    public  Connection getConnection(){
        try {
            //1.加载驱动程序com.mysql.cj.jdbc.Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            //2. 获得数据库连接
            conn = DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }
    public void closeConn(){
        if(conn!=null){
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}

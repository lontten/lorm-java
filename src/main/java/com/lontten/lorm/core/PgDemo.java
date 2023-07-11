package com.lontten.lorm.core;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PgDemo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // 参数：
        // jdbc协议:postgresql子协议://主机地址:数据库端口号/要连接的数据库名
        String url = "jdbc:postgresql://localhost:5432/test";
        // 数据库用户名
        String user = "postgres";
        // 数据库密码
        String password = "123456";

        // 1. 加载Driver类，Driver类对象将自动被注册到DriverManager类中
        Class.forName("org.postgresql.Driver");

        // 2. 连接数据库，返回连接对象
        Connection conn = DriverManager.getConnection(url, user, password);
    }
}

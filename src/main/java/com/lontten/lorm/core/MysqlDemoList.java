package com.lontten.lorm.core;

import org.postgresql.geometric.PGpoint;
import org.postgresql.jdbc.PgArray;

import java.sql.*;

public class MysqlDemoList {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //1、导入驱动jar包
        //2、注册驱动
        Class.forName("com.mysql.jdbc.Driver");

        //3、获取数据库的连接对象
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sys", "root", "123456789");



        //4、定义sql语句
        String sql = "SELECT id, name, url FROM websites";

        //5、获取执行sql语句的对象
        Statement stmt = con.createStatement();


        ResultSet rs = stmt.executeQuery(sql);

        // 展开结果集数据库
        while(rs.next()){
            // 通过字段检索
            rs.getObject(1, PGpoint.class);
            PgArray object = rs.getObject(2, PgArray.class);

            int id  = rs.getInt("id");
            String name = rs.getString("name");
            String url = rs.getString("url");

            // 输出数据
            System.out.print("ID: " + id);
            System.out.print(", 站点名称: " + name);
            System.out.print(", 站点 URL: " + url);
            System.out.print("\n");
        }
        // 完成后关闭
        rs.close();
        stmt.close();
        con.close();
    }
}

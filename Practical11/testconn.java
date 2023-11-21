package Practical11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class testconn {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/";
        String username = "root";
        String password = "******";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, username, password);
            System.out.println("成功连接到MySQL数据库");
        } catch (ClassNotFoundException e) {
            System.out.println("找不到MySQL JDBC驱动程序");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("连接MySQL数据库时出现错误");
            e.printStackTrace();
        }
    }


}



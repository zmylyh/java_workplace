package Practical11;

import java.sql.*;

public class DatabaseEbookshop {
    public Connection connect(String database) {
        String url = "jdbc:mysql://localhost:3306/" + database;
        String username = "root";
        String password = "********";
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, username, password);
            System.out.println("成功连接到MySQL数据库");
        } catch (ClassNotFoundException e) {
            System.out.println("找不到MySQL JDBC驱动程序");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("连接MySQL数据库时出现错误");
            e.printStackTrace();
        }
        return conn;
    }

    public void createdatabase() {
        try (Connection conn = connect("")) {
            if (conn != null) {
                DatabaseMetaData meta = conn.getMetaData();
                System.out.println("Product name: " + meta.getDatabaseProductName());
                Statement stmt = conn.createStatement();
                stmt.execute("CREATE DATABASE IF NOT EXISTS ebookshop");
                System.out.println("Database created");
                stmt.execute("USE ebookshop");
                String sql = "CREATE TABLE IF NOT EXISTS books ("
                        + "id INT NOT NULL AUTO_INCREMENT,"
                        + "title VARCHAR(50) NOT NULL,"
                        + "author VARCHAR(50),"
                        + "price DOUBLE,"
                        + "qty INT,"
                        + "PRIMARY KEY (id))";
                stmt.execute(sql);
                System.out.println("Table created");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void insertBook(int id, String title, String author, double price, int qty) {
        try (Connection conn = connect("ebookshop")) {
            if (conn != null) {
                Statement stmt = conn.createStatement();
                stmt.execute("USE ebookshop");
                String sql = "INSERT INTO books (id, title, author, price, qty) VALUES ('" + id + "','" + title + "', '" + author + "', " + price + ", " + qty + ")";
                stmt.execute(sql);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void displaybooks(int id) {
        try (Connection conn = connect("ebookshop")) {
            if (conn != null) {
                Statement stmt = conn.createStatement();
                stmt.execute("USE ebookshop");
                String strSelect = "SELECT * FROM books where id = " + id + ";";
                ResultSet rset = stmt.executeQuery(strSelect);
                while (rset.next()) {
                    System.out.println(rset.getInt("id") + ", "
                            + rset.getString("title") + ", "
                            + rset.getString("author") + ", "
                            + rset.getDouble("price") + ", "
                            + rset.getInt("qty"));
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void displayallbooks() {
        try (Connection conn = connect("ebookshop")) {
            if (conn != null) {
                Statement stmt = conn.createStatement();
                stmt.execute("USE ebookshop");
                String strSelect = "SELECT * FROM books;";
                ResultSet rset = stmt.executeQuery(strSelect);
                while (rset.next()) {
                    System.out.println(rset.getInt("id") + ", "
                            + rset.getString("title") + ", "
                            + rset.getString("author") + ", "
                            + rset.getDouble("price") + ", "
                            + rset.getInt("qty"));
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }


    public static void main(String[] args) {
        DatabaseEbookshop db = new DatabaseEbookshop();
        db.displaybooks(1006);
        db.displayallbooks();
    }

}

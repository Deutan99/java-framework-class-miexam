package kr.ac.jejunu.user;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public interface ConnectionMaker {
    abstract public Connection getConnection() throws ClassNotFoundException, SQLException;
//        Class.forName("com.mysql.cj.jdbc.Driver");
//        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/jeju", "root", "kl326570@");
//        return connection;
}
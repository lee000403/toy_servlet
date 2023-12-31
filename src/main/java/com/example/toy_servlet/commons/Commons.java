package com.example.toy_servlet.commons;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

public class Commons {
    public String Commons() {
        String uuid = UUID.randomUUID().toString();
        return uuid;
    }

    public Statement getStatement() {
        String url = "jdbc:mysql://192.168.0.166:3306/db_poll";
        String user = "yojulab";
        String password = "!yojulab*";

        Statement statement = null;
        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            statement = connection.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return statement;
    }

    public String getGeneratorID() {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-M-yyyyhh:mm:ss");
        String strDate = formatter.format(date);
        return strDate;
    }
}

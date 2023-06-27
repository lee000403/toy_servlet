package com.example.toy_servlet.daos;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;

import com.example.toy_servlet.commons.Commons;

public class PollsInformationDao {
    public HashMap<String, String> selectAll() {
        HashMap<String, String> hashMap = new HashMap<>();
        try {
            Commons commons = new Commons();
            Statement statement = commons.getStatement();

            String query = "SELECT * FROM db_poll.respondents;";
            ResultSet resultSet = statement.executeQuery(query);

            if (resultSet.next()) {
                hashMap.put("RESPONDENTS", resultSet.getString("RESPONDENTS"));
                hashMap.put("RESPONDENTS_ID", resultSet.getString("RESPONDENTS_ID"));
                hashMap.put("PASSWORD", resultSet.getString("PASSWORD"));
                hashMap.put("PHONENUMBER", resultSet.getString("PHONENUMBER"));
            }
            resultSet.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return hashMap;
    }
}
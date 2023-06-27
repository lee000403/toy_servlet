package com.example.toy_servlet.daos;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;

import com.example.toy_servlet.commons.Commons;

public class PollsLoginDao {
    public HashMap hash_id() {
        HashMap hashMap = new HashMap<>();
        try {
            Commons commons = new Commons();
            Statement statement = commons.getStatement();
            String query = "SELECT RESPONDENTS_ID, PASSWORD \n" + //
                    "FROM db_poll.respondents";
            ResultSet resultSet = statement.executeQuery(query);
            ArrayList arrayList = new ArrayList<>();
            while (resultSet.next()) {
                hashMap.put(resultSet.getString("RESPONDENTS_ID"), resultSet.getString("PASSWORD"));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return hashMap;
    }
}

package com.example.toy_servlet.daos;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.boot.autoconfigure.amqp.RabbitProperties.Cache.Connection;

import com.example.toy_servlet.commons.Commons;

public class PollsStaticsDao {
    public int cnt_Survey() {
        int cnt_survey = 0;
        try {
            Commons commons = new Commons();
            Statement statement = commons.getStatement();
            String query = "SELECT COUNT(CNT) AS CNT\n" + //
                    "FROM (\n" + //
                    "SELECT COUNT(RESPONDENTS_ID) AS CNT\n" + //
                    "FROM statistics\n" + //
                    "GROUP BY RESPONDENTS_ID\n" + //
                    ") AS CNT_SURVEY";
            ResultSet resultSet = statement.executeQuery(query);
            cnt_survey = resultSet.getInt(query);

        } catch (Exception e) {

        }
        return cnt_survey;
    }

    public ArrayList sum_Answer() {
        ArrayList arrayList = new ArrayList();
        try {
            Commons commons = new Commons();
            Statement statement = commons.getStatement();
            String query = "SELECT T_CHO.CHOICE, COUNT(T_CHO.CHOICE_ID) AS CNT\n" + //
                    "FROM statistics AS T_STATI\n" + //
                    "JOIN choice AS T_CHO\n" + //
                    "ON T_STATI.CHOICE_ID = T_CHO.choice_ID\n" + //
                    "GROUP BY T_CHO.CHOICE_ID";
            
            ResultSet resultSet = statement.executeQuery(query);
            HashMap hashMap = new HashMap<>();

            while (resultSet.next()) {
                hashMap.put("CHOICE", resultSet.getString("CHOICE"));
                hashMap.put("CNT", resultSet.getString("CNT"));
                arrayList.add(hashMap);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return arrayList;
    }
}

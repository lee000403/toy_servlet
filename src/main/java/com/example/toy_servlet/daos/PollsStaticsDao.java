package com.example.toy_servlet.daos;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.boot.autoconfigure.amqp.RabbitProperties.Cache.Connection;

import com.example.toy_servlet.commons.Commons;

public class PollsStaticsDao {
    public String cnt_Survey() {
        String cnt_survey = "";
        try {
            Commons commons = new Commons();
            Statement statement = commons.getStatement();
            String query = "SELECT COUNT(CNT_SURVEY.a_CNT) AS CNT\n" + //
                    "FROM (\n" + //
                    "SELECT COUNT(RESPONDENTS_ID) AS a_CNT\n" + //
                    "FROM statistics\n" + //
                    "GROUP BY RESPONDENTS_ID\n" + //
                    ") AS CNT_SURVEY";
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                cnt_survey = resultSet.getString("CNT");
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return cnt_survey;
    }

    public ArrayList sum_Answer() {
        ArrayList arrayList = new ArrayList();
        try {
            Commons commons = new Commons();
            Statement statement = commons.getStatement();
            String query = "SELECT CH.CHOICE AS CHOICE, COUNT(ST.CHOICE_ID) AS CNT\n" + //
                    "FROM CHOICE AS CH\n" + //
                    "LEFT JOIN statistics AS ST\n" + //
                    "ON CH.CHOICE_ID = ST.CHOICE_ID\n" + //
                    "GROUP BY CHOICE";
            ResultSet resultSet = statement.executeQuery(query);
            HashMap hashMap = new HashMap<>();
            while (resultSet.next()) {
                hashMap = new HashMap<>();
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

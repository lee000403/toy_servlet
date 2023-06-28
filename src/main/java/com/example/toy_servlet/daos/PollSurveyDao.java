package com.example.toy_servlet.daos;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;

import com.example.toy_servlet.commons.Commons;
import com.google.protobuf.SourceContext;

public class PollSurveyDao {
    public ArrayList answersuvey(String answer) {
        int count = 0;
        //ArrayList pollList = new ArrayList<>();
        ArrayList<HashMap<String, String>> pollList = new ArrayList<>(); // ArrayList로 선언 및 초기화
        try {

            Commons commons = new Commons();
            Statement statement = commons.getStatement();
            HashMap<String, String> answerRecord = new HashMap<>();

            String query = "SELECT * FROM db_poll.statistics;";
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                String CHOICE_ID = resultSet.getString("CHOICE_ID");

                answerRecord = new HashMap<>(); // 초기화
                answerRecord.put("STATISTICS_ID", resultSet.getString("STATISTICS_ID"));
                answerRecord.put("RESPONDENTS_ID", resultSet.getString("RESPONDENTS_ID"));
                answerRecord.put("QUESTIONS_ID", resultSet.getString("QUESTIONS_ID"));
                answerRecord.put("CHOICE_ID", resultSet.getString("CHOICE_ID"));

                pollList.add(answerRecord); // 해쉬맵에 담은것들을 리스트에 담음
            }

            for (HashMap<String, String> Record : pollList) {
                query = "insert into statistics\n" + //
                        "(STATISTICS_ID, RESPONDENTS_ID, QUESTIONS_ID, CHOICE_ID)\n" + //
                        "values\n" + //
                        "('" + resultSet.getString("STATISTICS_ID") + "', '" + resultSet.getString("RESPONDENTS_ID")
                        + "', '" + resultSet.getString("QUESTIONS_ID") + "', '" + resultSet.getString("CHOICE_ID")
                        + "')";
                count = statement.executeUpdate(query);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return pollList;
    }
}

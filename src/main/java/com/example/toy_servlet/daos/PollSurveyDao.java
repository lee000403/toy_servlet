package com.example.toy_servlet.daos;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;

import com.example.toy_servlet.commons.Commons;

public class PollSurveyDao {
    public ArrayList answersuvey(String answer, ResultSet resultSet){
        int count = 0;
        ArrayList pollList = new ArrayList<>();
        try {
            
            Commons commons = new Commons();
            Statement statement = commons.getStatement();
            HashMap answerRecord = new HashMap<>();
            String query = "insert into statistics\n" + //
                    "(STATISTICS_ID, RESPONDENTS_ID, QUESTIONS_ID, CHOICE_ID)\n" + //
                    "values\n" + //
                    "('"+resultSet.getString("STATISTICS_ID")+"', '"+resultSet.getString("RESPONDENTS_ID")+"', '"+resultSet.getString("QUESTIONS_ID") +"', '"+resultSet.getString("CHOICE_ID")+"')";
            count = statement.executeUpdate(query);
            //count = statement.executeUpdate(query); 


            // //HashMap answerRecord = new HashMap<>();
            // while(resultSet.next()){ //해쉬맵에 담는다.
            //     answerRecord = new HashMap<>(); // 초기화
            //     answerRecord.put("STATISTICS_ID", resultSet.getString("STATISTICS_ID")); 
            //     answerRecord.put("RESPONDENTS_ID", resultSet.getString("RESPONDENTS_ID"));
            //     answerRecord.put("QUESTIONS_ID", resultSet.getString("QUESTIONS_ID"));
            //     answerRecord.put("CHOICE_ID", resultSet.getString("CHOICE_ID"));

            //     pollList.add(answerRecord); //해쉬맵에 담은것들을 리스트에 담음
            // }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return pollList;
    }
}

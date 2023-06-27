package com.example.toy_servlet.daos;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;


import com.example.toy_servlet.commons.Commons;

public class PollsManagementDao {
    public ArrayList selectAll() {
        ArrayList arrayList= new ArrayList();
        try {
            Commons commons = new Commons();
            Statement statement = commons.getStatement();

            String query = " SELECT * FROM db_poll.respondents;";
            ResultSet resultSet = statement.executeQuery(query); // 결과값 리턴 , select만 resulset으로 받음(select 테이블 형식으로 나오니깐)
            HashMap hashMap = new HashMap(); // 하나하나 해쉬맵에 담고 그걸 리스트에 넣어줌

            // 컨텐츠 증가
            while (resultSet.next()) {
                hashMap = new HashMap();

                hashMap.put("RESPONDENTS", resultSet.getString("RESPONDENTS"));
                hashMap.put("RESPONDENTS_ID", resultSet.getString("RESPONDENTS_ID"));
                hashMap.put("PASSWORD", resultSet.getString("PASSWORD"));
                hashMap.put("PHONENUMBER", resultSet.getString("PHONENUMBER"));
                arrayList.add(hashMap);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return arrayList;
    }
}
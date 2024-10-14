package com.zaxxer.hikari.demo.service;

import com.zaxxer.hikari.demo.config.MyDataSource;
import com.zaxxer.hikari.demo.pojo.TUser;
import com.zaxxer.hikari.demo.pojo.TUser;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 谢张兵
 * @version 1.0
 * @description:
 * @date 2024/9/26 17:12
 */
public class HikariService {
    public List<TUser> getAllUser() throws SQLException {
        Connection connection = MyDataSource.getConnection();
        String sql = "select * from t_user";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ResultSet resultSet = preparedStatement.executeQuery();
        List<TUser> users=new ArrayList<>();
        while (resultSet.next()){
              TUser user=new TUser();
              user.setId(resultSet.getInt("ID"));
              user.setUserName(resultSet.getString("USER_NAME"));
              user.setUserAge(resultSet.getInt("USER_AGE"));
              user.setUserBirthday(resultSet.getString("USER_BIRTHDAY"));
            users.add(user);
        }
        return users;
    }
}

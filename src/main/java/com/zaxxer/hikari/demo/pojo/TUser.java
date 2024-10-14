package com.zaxxer.hikari.demo.pojo;

/**
 * @author 谢张兵
 * @version 1.0
 * @description:
 * @date 2024/9/11 21:43
 */

public class TUser {
    private int id;
    private String userName;
    private int userAge;
    private String userBirthday;

   @Override
   public String toString() {
      return "TUser{" +
         "id=" + id +
         ", userName='" + userName + '\'' +
         ", userAge=" + userAge +
         ", userBirthday='" + userBirthday + '\'' +
         '}';
   }

   public int getId() {
      return id;
   }

   public void setId(int id) {
      this.id = id;
   }

   public String getUserName() {
      return userName;
   }

   public void setUserName(String userName) {
      this.userName = userName;
   }

   public int getUserAge() {
      return userAge;
   }

   public void setUserAge(int userAge) {
      this.userAge = userAge;
   }

   public String getUserBirthday() {
      return userBirthday;
   }

   public void setUserBirthday(String userBirthday) {
      this.userBirthday = userBirthday;
   }
}

package com.app.vo;

public class UserVO {
//   CREATE TABLE TBL_USER ( 
//         USER_NUMBER NUMBER CONSTRAINT PK_USER PRIMARY KEY,
//         USER_ID VARCHAR2(500) UNIQUE NOT NULL,
//         USER_PASSWORD VARCHAR2(500) NOT NULL,
//         USER_NAME VARCHAR2(500) NOT NULL,
//         USER_PHONE VARCHAR2(500) NOT NULL,
//         USER_NICKNAME VARCHAR2(500),
//         USER_EMAIL VARCHAR2(500) NOT NULL, 
//         USER_ADDRESS VARCHAR2(500),
//         USER_BIRTH DATE
//      );
   
   //필드 : 테이블의 컬럼 (private)
   //alt + shift + a : 그리드모드 
   private long userNumber;
   private String userId;
   private String userPassword;
   private String userName;
   private String userPhone;
   private String userNickname;
   private String userEmail;
   private String userAddress;
   private String userBirth;


   //게터, 세터
   //생성자
   public UserVO() {
      super();
   }

   public long getUserNumber() {
      return userNumber;
   }

   public void setUserNumber(long userNumber) {
      this.userNumber = userNumber;
   }

   public String getUserId() {
      return userId;
   }

   public void setUserId(String userId) {
      this.userId = userId;
   }

   public String getUserPassword() {
      return userPassword;
   }

   public void setUserPassword(String userPassword) {
      this.userPassword = userPassword;
   }

   public String getUserName() {
      return userName;
   }

   public void setUserName(String userName) {
      this.userName = userName;
   }

   public String getUserPhone() {
      return userPhone;
   }

   public void setUserPhone(String userPhone) {
      this.userPhone = userPhone;
   }

   public String getUserNickname() {
      return userNickname;
   }

   public void setUserNickname(String userNickname) {
      this.userNickname = userNickname;
   }

   public String getUserEmail() {
      return userEmail;
   }

   public void setUserEmail(String userEmail) {
      this.userEmail = userEmail;
   }

   public String getUserAddress() {
      return userAddress;
   }

   public void setUserAddress(String userAddress) {
      this.userAddress = userAddress;
   }

   public String getUserBirth() {
      return userBirth;
   }

   public void setUserBirth(String userBirth) {
      this.userBirth = userBirth;
   }   
}
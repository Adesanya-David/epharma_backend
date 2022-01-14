package com.users;

public class user {

    private  Integer userId;
    private  String userName;

    public user(Integer userId, String userName) {
        this.userId = userId;
        this.userName = userName;
    }

    public Integer getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserId(){
        this.userId = userId;
    }

    public void setUserName(){
        this.userName = userName;
    }


    @Override
    public String toString() {
        return "user{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                '}';
    }

}

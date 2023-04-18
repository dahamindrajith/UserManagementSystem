package com.UserManagementSystem.ums.models;

public class User {

    public User() {
    
    }

    private String requstId;

    public String getRequstId() {
        return requstId;
    }

    public void setRequstId(String requstId) {
        this.requstId = requstId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    private String userId;
    private String name;
    private String discription;
    private int status;

}

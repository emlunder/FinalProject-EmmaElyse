package com.example.cmltdstudent.afinal;

import java.io.Serializable;

/**
 * Created by cmltdstudent on 3/30/17.
 */

public class UserInfo implements Serializable {
    private String userName;
    private String level;
    private String problemtype;
    private int score;

    public UserInfo() {
    }

    ;

    public UserInfo(String userName, String level, String problemtype, int score) {
        this.userName = userName;
        this.level = level;
        this.problemtype = problemtype;
        this.score = score;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getProblemtype() {
        return problemtype;
    }

    public void setProblemtype(String problemtype) {
        this.problemtype = problemtype;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "Username: '" + userName + "\n" +
                "Level: " + level + "\n" +
                "Problem Type: " + problemtype + "\n" +
                "Score: " + score;
    }
}

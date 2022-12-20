package com.mycompany.app.domain;

public class Hello {
    private int id;
    private String name;
    private String nickName;
    private String realName;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getNickName() {
        return this.nickName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getRealName() {
        return this.realName;
    }

    public String toString() {
        return "id: "+ this.getId() +" name: "+ this.getName() + " real_name: "+ this.getRealName() + " nick_name: " + this.getNickName();
    }
}
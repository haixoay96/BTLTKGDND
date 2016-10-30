package com.example.haixo.chatwithme.Data;

/**
 * Created by haixo on 10/30/2016.
 */

public class User {
    public int getAvatar() {
        return avatar;
    }

    public void setAvatar(int avatar) {
        this.avatar = avatar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private int avatar;
    private String name;

    public User(int avatar, String name) {
        this.avatar = avatar;
        this.name = name;
    }
}

package com.jeffrey.smartchat.bean;

import com.jeffrey.smartchat.db.NewFriend;

import cn.bmob.v3.BmobUser;

/**
 * @project:User
 */
public class User extends BmobUser {

    private String avatar;

    public User(){}

    public User(NewFriend friend){
        setObjectId(friend.getUid());
        setUsername(friend.getName());
        setAvatar(friend.getAvatar());
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }
}

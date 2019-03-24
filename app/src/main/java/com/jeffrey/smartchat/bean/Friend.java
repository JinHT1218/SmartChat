package com.jeffrey.smartchat.bean;

import cn.bmob.v3.BmobObject;

/**好友表
 * @project Friend
 */
//TODO 好友管理：9.1、创建好友表
public class Friend extends BmobObject{

    private User user;
    private User friendUser;

    private transient String pinyin;

    public String getPinyin() {
        return pinyin;
    }

    public void setPinyin(String pinyin) {
        this.pinyin = pinyin;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public User getFriendUser() {
        return friendUser;
    }

    public void setFriendUser(User friendUser) {
        this.friendUser = friendUser;
    }
}

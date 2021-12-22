package dao.impl;

import dao.UserDao;

import java.util.Date;

/**
 * 7.对象注入：
 **/
public class UserDaoImpl1 implements UserDao {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    private Date time;
    public UserDaoImpl1(int id, Date time) {
        this.id = id;
        this.time = time;
    }
    @Override
    public void saveUser() {
        System.out.println("UserDaoImpl1。。。");
    }
}

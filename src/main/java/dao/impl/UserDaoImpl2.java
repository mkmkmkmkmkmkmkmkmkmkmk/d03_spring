package dao.impl;

import dao.UserDao;

import java.util.Date;

/**
 * @Author：Weiyu
 * @Version:
 * @Since:
 * @date：2021-12-22_周三 16:12
 **/
public class UserDaoImpl2 implements UserDao {
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

    @Override
    public void saveUser() {

    }
}

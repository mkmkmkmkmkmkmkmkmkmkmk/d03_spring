package dao.impl;

import dao.UserDao;

/**
 * @Author：Weiyu
 * @Version:
 * @Since:
 * @date：2021-12-21_周二 21:52
 **/
public class UserDaoImpl implements UserDao {
    @Override
    public void saveUser() {
        System.out.println("保存了用户....");
    }
    //6.对象的生命周期：spring可以指定普通方法变为生命周期方法
    public  void init(){
        System.out.println("对象初始化开始");
    }
    public  void destroy(){
        System.out.println("对象销毁");
    }
}

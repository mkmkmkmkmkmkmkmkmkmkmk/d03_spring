package factory;

import dao.UserDao;
import dao.impl.UserDaoImpl;

/**
 * @Author：Weiyu
 * @Version:
 * @Since:
 * @date：2021-12-22_周三 13:09
 **/
public class Factory1 {
    public  UserDao getUserDao(){
        return new UserDaoImpl();
    }
}

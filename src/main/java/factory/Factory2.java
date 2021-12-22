package factory;

import dao.UserDao;
import dao.impl.UserDaoImpl;
import dao.impl.UserDaoImpl1;

/**
 * @Author：Weiyu
 * @Version:
 * @Since:
 * @date：2021-12-22_周三 14:11
 **/
public class Factory2 {
    private static UserDao getUserDao(){
        return new UserDaoImpl();
    }

}

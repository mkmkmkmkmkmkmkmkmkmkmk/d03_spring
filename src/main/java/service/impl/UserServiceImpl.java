package service.impl;

import dao.UserDao;
import dao.impl.UserDaoImpl;
import factory.BeanFactory;
import org.junit.jupiter.api.Test;
import service.UserService;

/**
 * @Author：Weiyu
 * @Version:
 * @Since:
 * @date：2021-12-21_周二 21:49
 **/
public class UserServiceImpl implements UserService {
    //1.1向上转型
    //private UserDao userDao=new UserDaoImpl();
    //1.2根据id获取dao对象（需要转型）
    // private UserDao userDao= (UserDao) BeanFactory.getBean("userDao");
     //1.3根据id获取dao对象（不需要转型）
    private  UserDao userDao=BeanFactory.getBean("userDao",UserDao.class);
    public void regist(){
        userDao.saveUser();
    }

    @Test
   public void  userTest(){
    UserService userService=new UserServiceImpl();
    userService.regist();
   }
}

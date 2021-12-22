import dao.UserDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author：Weiyu
 * @Version:
 * @Since:
 * @date：2021-12-22_周三 09:58
 **/
public class SpringIocTest {
    /**
     * 2.不使用BeanFactory自己解耦dao层，通过org.springframework.context
     * 中方法解耦dao层
     */
    @Test
    public void SpringIocTest(){
        //初始化spring容器
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        //UserDao userDao= (UserDao) applicationContext.getBean("userDao");//1.按照名字
        //UserDao userDao= applicationContext.getBean("userDao", UserDao.class);//2.按照名字
        UserDao userDao= applicationContext.getBean(UserDao.class);//3.按照类型：具有局限性bean中id不允许重复：expected single matching bean but found 2: userDao,userDao1
        //从容器中获取想要的对象
        userDao.saveUser();
    }
}

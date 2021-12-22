import dao.UserDao;
import dao.impl.UserDaoImpl1;
import dao.impl.UserDaoImpl2;
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
     * 2.3.4.不使用BeanFactory自己解耦dao层，通过org.springframework.context
     * 中方法解耦dao层
     */
    @Test
    public void SpringIocdTest(){
        //初始化spring容器
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        //UserDao userDao= (UserDao) applicationContext.getBean("userDao");//1.按照名字
        UserDao userDao= applicationContext.getBean("userDao", UserDao.class);//2.按照名字
        //UserDao userDao= applicationContext.getBean(UserDao.class);//3.按照类型：具有局限性bean中id不允许重复：expected single matching bean but found 2: userDao,userDao1
        //从容器中获取想要的对象
        userDao.saveUser();
    }
    /**
     * 5.1.测试单例
     */
    @Test
    public void SingletonTest(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao= applicationContext.getBean("userDao",UserDao.class);
        UserDao userDao1= applicationContext.getBean("userDao",UserDao.class);
        System.out.println(userDao1==userDao);
    }
    /**
     * 5.2.测试多例
     */
    @Test
    public void PrototypeTest(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao= applicationContext.getBean("userDao",UserDao.class);
        UserDao userDao1= applicationContext.getBean("userDao",UserDao.class);
        System.out.println(userDao1==userDao);
    }
    /**
     * 6.测试对象生命周期:init-method,destroy-method
     * 看不到初始化结束为什么？
     */
    @Test
    public void LifeCycleTest(){
        //ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao= applicationContext.getBean("userDao",UserDao.class);
        UserDao userDao1= applicationContext.getBean("userDao",UserDao.class);
        System.out.println(userDao1 == userDao);
    }
    /**
     * 7.对象的数据注入:构造方法注入
     */
    @Test
    public void ConstructorTest(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDaoImpl1 userDao= applicationContext.getBean("userDao",UserDaoImpl1.class);
        System.out.println(userDao.getTime());
        System.out.println(userDao.getId());
    }
    /**
     * 8.对象的数据注入:set方法注入
     */
    @Test
    public void setInfuse(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDaoImpl2 userDao= applicationContext.getBean("userDao",UserDaoImpl2.class);
        System.out.println(userDao.getTime());
        System.out.println(userDao.getId());
    }
    /**
     * 8.对象的数据注入:p命名空间方法注入
     */
    @Test
    public void PnamespaceTest(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDaoImpl2 userDao= applicationContext.getBean("userDao",UserDaoImpl2.class);
        System.out.println(userDao.getTime());
        System.out.println(userDao.getId());
    }


}

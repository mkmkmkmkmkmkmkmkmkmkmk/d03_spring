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
        UserDao userDao= applicationContext.getBean("userDao", UserDao.class);
        //从容器中获取想要的对象
        userDao.saveUser();

    }
}

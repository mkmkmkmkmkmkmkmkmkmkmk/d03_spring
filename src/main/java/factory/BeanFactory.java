package factory;

import dao.UserDao;
import dao.impl.UserDaoImpl;
import org.dom4j.Document;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;

import java.io.InputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * IOC的核心功能
 */
public class BeanFactory {
    private static Map<String,Object> container= Collections.synchronizedMap(new HashMap<>());

    static {
        //1.读取xml文档
        ClassLoader classLoader= BeanFactory.class.getClassLoader();
        InputStream in= classLoader.getResourceAsStream("bean.xml");
        try {
            //2.解析xml文档中的所有bean元素
            SAXReader saxReader=new SAXReader();
            Document document= saxReader.read(in);
            List<Node> beanNodes= document.selectNodes("/beans/bean");
            //3.循环遍历:得到id和class (必须是普通的JavaBean）的取值
            for (Node beanNode:beanNodes) {
                String id=beanNode.valueOf("@id");//对象的名称
                String fullClassName=beanNode.valueOf("@class");//类的全名
                //4.创建对象存到容器中
                Class<?> clazz=Class.forName(fullClassName);
                Object object= clazz.newInstance();
                container.put(id,object);
            }
        } catch (Exception e){
            throw new RuntimeException("初始化容器失败");
        }
    }
    //1.2根据id获取dao对象（需要转型）
    public static Object getBean(String name){
        return container.get(name);
    }
    //1.3根据id获取dao对象（不需要转型）
    public static  <T> T getBean(String name,Class<T> clazz){
        return (T)container.get(name);
    }
    //1.1向上转型
    @Deprecated
    public static UserDao getUserDao(){
        return new UserDaoImpl();
    }
}

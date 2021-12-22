package factory;

/**
 *
 * 写出一个Singleton
 **/
public class Singleton {
    private static Singleton singleton=new Singleton();

    private Singleton(){}
    public static Singleton getInstance(){
        return singleton;
    }

}

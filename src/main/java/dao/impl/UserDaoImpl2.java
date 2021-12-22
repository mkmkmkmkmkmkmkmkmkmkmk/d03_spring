package dao.impl;

import dao.UserDao;

import java.util.*;

/**
 * @Author：Weiyu
 * @Version:
 * @Since:
 * @date：2021-12-22_周三 16:12
 **/
public class UserDaoImpl2 implements UserDao {
    private int id;

    @Override
    public String toString() {
        return "UserDaoImpl2{" +
                "id=" + id +
                ", time=" + time +
                ", myStr=" + Arrays.toString(myStr) +
                ", myList=" + myList +
                ", mySet=" + mySet +
                ", myProp=" + myProp +
                ", myMap=" + myMap +
                '}';
    }

    private Date time;
    private String[] myStr;
    private List<String> myList;
    private Set<String> mySet ;
    private Properties myProp;

    private Map<String,String> myMap;

    public String[] getMyStr() {
        return myStr;
    }

    public void setMyStr(String[] myStr) {
        this.myStr = myStr;
    }

    public List<String> getMyList() {
        return myList;
    }

    public void setMyList(List<String> myList) {
        this.myList = myList;
    }

    public Set<String> getMySet() {
        return mySet;
    }

    public void setMySet(Set<String> mySet) {
        this.mySet = mySet;
    }

    public Properties getMyProp() {
        return myProp;
    }

    public void setMyProp(Properties myProp) {
        this.myProp = myProp;
    }

    public Map<String, String> getMyMap() {
        return myMap;
    }

    public void setMyMap(Map<String, String> myMap) {
        this.myMap = myMap;
    }
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

    @Override
    public void saveUser() {

    }
}

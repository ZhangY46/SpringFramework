package com.jzk.simple.other;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * ClassName:CollectionClass
 * Package:com.jzk.simple.other
 * Description:
 *
 * @Date:2020/3/19 13:24
 * @Author:JiangZhikuan
 */
public class CollectionClass {

    private List<String> list;
    private Set set;
    private Map<String,String> map;
    private Properties properties;

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public Set getSet() {
        return set;
    }

    public void setSet(Set set) {
        this.set = set;
    }

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }



}

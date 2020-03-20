package com.jzk.simple.other;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;

/**
 * ClassName:ProperConfig
 * Package:com.jzk.simple.other
 * Description:
 *
 * @Date:2020/3/20 16:03
 * @Author:JiangZhikuan
 */

@Component
public class ProperConfig {

    private String url;
    private String username;
    private String password;

    @Autowired
    public ProperConfig(String url,String username,String password){
        this.url=url;
        this.username=username;
        this.password=password;
    }

    public String toString(){
        return "jdbc.url="+username+"  jdbc.username="+username+"  jdbc.password="+password;
    }
}

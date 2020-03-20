package com.jzk.simple.other;

import org.junit.validator.ValidateWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * ClassName:AppConfig
 * Package:com.jzk.simple.other
 * Description:
 *
 * @Date:2020/3/20 15:40
 * @Author:JiangZhikuan
 */

@Configuration
@ImportResource("properties-config.xml")
public class AppConfig {

    @Value("${jdbc.url}")
    private String url;

    @Value("${jdbc.username}")
    private String username;

    @Value("${jdbc.password}")
    private String password;

    @Bean
    public AnnotionTest annotionTest(){
        return new AnnotionTest();
    }

    @Bean
    public ProperConfig properConfig(){
        return new ProperConfig(url,username,password);
    }
}

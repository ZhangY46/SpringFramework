package com.jzk.simple.other;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * ClassName:AppConfig
 * Package:com.jzk.simple.other
 * Description:
 *
 * @Date:2020/3/20 15:40
 * @Author:JiangZhikuan
 */

@Configuration
public class AppConfig {

    @Bean
    public AnnotionTest annotionTest(){
        return new AnnotionTest();
    }
}

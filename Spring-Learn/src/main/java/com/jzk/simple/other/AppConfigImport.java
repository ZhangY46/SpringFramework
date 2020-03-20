package com.jzk.simple.other;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * ClassName:AppConfigImport
 * Package:com.jzk.simple.other
 * Description:
 *
 * @Date:2020/3/20 15:42
 * @Author:JiangZhikuan
 */

@Configuration
@Import(AppConfig.class)
public class AppConfigImport {

    @Bean
    public AnnotationIocTest annotationIocTest(){
        return new AnnotationIocTest();
    }
}

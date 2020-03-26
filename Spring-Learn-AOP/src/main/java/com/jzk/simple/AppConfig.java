package com.jzk.simple;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * ClassName:AppConfig
 * Package:com.jzk.simple
 * Description:
 *
 * @Date:2020/3/26 9:00
 * @Author:JiangZhikuan
 */

//java配置spring
@Configuration
@ComponentScan(value = "com.jzk.simple")  //扫描包
@EnableAspectJAutoProxy       //相当于开启代理代理功能更   aop使用
public class AppConfig {

}

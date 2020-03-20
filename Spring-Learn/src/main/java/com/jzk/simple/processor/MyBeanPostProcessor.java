package com.jzk.simple.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * ClassName:MyBeanPostProcessor
 * Package:com.jzk.simple.processor
 * Description:
 *              自定义处理器
 * @Date:2020/3/20 11:23
 * @Author:JiangZhikuan
 */
public class MyBeanPostProcessor implements BeanPostProcessor {

    //实例化、依赖注入完毕，
    //在调用显示的初始化之前完成一些定制的初始化任务
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessBeforeInitialization:" +beanName);
        return bean;
    }

    //实例化、依赖注入、初始化完毕时执行
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("Bean '"+beanName+"'created:"+bean.toString());

        return bean;
    }
}

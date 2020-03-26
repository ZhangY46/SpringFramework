package com.jzk.simple;

import com.jzk.simple.service.IFooService;
import com.jzk.simple.service.IFoodService;
import com.jzk.simple.service.impl.DefaultUsageTracked;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ClassName:testAOP
 * Package:com.jzk.simple
 * Description:
 *
 * @Date:2020/3/24 16:29
 * @Author:JiangZhikuan
 */

public class testAOP {

    //aop切面简单demo
    @Test
    public void testXmlAop(){
        ApplicationContext applicationContext=
                new ClassPathXmlApplicationContext("aop_plain.xml");
        IFoodService foodService=
                applicationContext.getBean("foodService",IFoodService.class);
        foodService.Save();
    }

    //后续学习补充
    @Test
    public void testAopDeclare(){
        ApplicationContext applicationContext=
                new ClassPathXmlApplicationContext("aop-declare.xml");
        DefaultUsageTracked usageTracked=
                applicationContext.getBean("defaultUsageTracked",DefaultUsageTracked.class);

        usageTracked.SaveUser();
    }

    //Java配置使用注解配置AOP
    @Test
    public void testJavaAnnotationAOP(){
        ApplicationContext applicationContext=
                new AnnotationConfigApplicationContext(AppConfig.class);
        IFooService fooService= applicationContext.getBean("fooService",IFooService.class);
        fooService.add(1,2);
    }

    @Test
    public void testXmlArgsAOP(){
        ApplicationContext applicationContext=
                new ClassPathXmlApplicationContext("aop_plain.xml");
        IFooService fooService=applicationContext.getBean("fooService",IFooService.class);
        System.out.println(fooService.add(1,2));
    }

}

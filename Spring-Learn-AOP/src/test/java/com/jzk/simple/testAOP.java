package com.jzk.simple;

import com.jzk.simple.service.IFoodService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
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

    @Test
    public void testXmlAop(){
        ApplicationContext applicationContext=
                new ClassPathXmlApplicationContext("aop_plain.xml");
        IFoodService foodService=
                applicationContext.getBean("foodService",IFoodService.class);
        foodService.Save();
    }

}

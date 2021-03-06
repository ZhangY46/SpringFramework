package com.jzk.simple;

import com.jzk.simple.dao.IAccountDao;
import com.jzk.simple.service.IAccountService;
import com.jzk.simple.service.impl.ClientService;
import com.jzk.simple.until.IMove;
import com.jzk.simple.until.IPeople;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ClassName:testAccountDao
 * Package:com.jzk.simple
 * Description:
 *
 * @Date:2020/3/18 8:53
 * @Author:JiangZhikuan
 */
public class testAccountDao {

    //配置dao  注入
    @Test
    public void testDao(){

        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("daos.xml");
        IAccountDao accountDao=applicationContext.getBean("accountDao",IAccountDao.class);
        accountDao.queryAccount();
    }

    //配置service配置到容器
    @Test
    public void testService(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("services.xml");
        IAccountService accountService=applicationContext.getBean("accountService",IAccountService.class);
        accountService.query();
    }

    //通过配置别名获取bean
    @Test
    public void testAliasService(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("services.xml");
        IAccountService service=applicationContext.getBean("service",IAccountService.class);
        service.delete();
    }

    //测试加载多个xml bean配置
    @Test
    public void test(){
        ApplicationContext applicationContext=
                new ClassPathXmlApplicationContext("daos.xml","services.xml");
        IAccountDao accountDao=applicationContext.getBean("accountDao",IAccountDao.class);
        IAccountService accountService=applicationContext.getBean("accountService",IAccountService.class);

        accountDao.updateAccount();
        accountService.save();
    }

    //静态方法创建beanFactory
    @Test
    public void testStaticFactory(){
        ApplicationContext applicationContext=
                new ClassPathXmlApplicationContext("staticService.xml");
        ClientService clientService=applicationContext.getBean("clientService",ClientService.class);
        clientService.test();
    }

    //非静态方法创建beanFactory
    @Test
    public void testFactory(){
        ApplicationContext applicationContext=
                new ClassPathXmlApplicationContext("staticService.xml");
        Integer integer= applicationContext.getBean("createInter",Integer.class);
        String string=applicationContext.getBean("createString",String.class);

        System.out.println(integer.toString());
        System.out.println(string+",length:"+string.length());
    }


    //通过构造函数创建bean对象
    @Test
    public void testConstructor(){
        ApplicationContext applicationContext=
                new ClassPathXmlApplicationContext("constructor.xml");
        IMove move=applicationContext.getBean("move",IMove.class);
        move.move();
        IPeople people=applicationContext.getBean("people",IPeople.class);
        people.peopleMove();

    }

}

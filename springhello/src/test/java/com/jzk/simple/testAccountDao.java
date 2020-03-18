package com.jzk.simple;

import com.jzk.simple.dao.IAccountDao;
import com.jzk.simple.service.IAccountService;
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

    @Test
    public void testDao(){

        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("daos.xml");
        IAccountDao accountDao=applicationContext.getBean("accountDao",IAccountDao.class);
        accountDao.queryAccount();
    }

    @Test
    public void testService(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("services.xml");
        IAccountService accountService=applicationContext.getBean("accountService",IAccountService.class);
        accountService.query();
    }

}

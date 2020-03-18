package com.jzk.simple.service.impl;

import com.jzk.simple.service.IClientService;

/**
 * ClassName:ClientService
 * Package:com.jzk.simple.service.impl
 * Description:
 *
 * @Date:2020/3/18 11:36
 * @Author:JiangZhikuan
 */
public class ClientService extends IClientService {

    private static ClientService clientService=new ClientService();
    private ClientService(){}

    public static ClientService CreateInstance(){
        return clientService;
    }



    public void test(){
        System.out.println("静态方法创建beanFactory实例化");
    }
}

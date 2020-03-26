package com.jzk.simple.service.impl;

import com.jzk.simple.service.IFooService;
import org.springframework.stereotype.Component;

/**
 * ClassName:FooService
 * Package:com.jzk.simple.service.impl
 * Description:
 *
 * @Date:2020/3/26 9:04
 * @Author:JiangZhikuan
 */

//配置bean
@Component
public class FooService implements IFooService {

    public int add(int a,int b) {
        System.out.println("FooService  function : save");
        return (a+b);
    }

}

package com.jzk.simple.service.impl;


/**
 * ClassName:DefaultServiceLocator
 * Package:com.jzk.simple.service.impl
 * Description:
 *
 * @Date:2020/3/18 13:03
 * @Author:JiangZhikuan
 */
public class DefaultServiceLocator {
     private static Integer integer=new Integer(21);
     private static String string=new String("string");

     public Integer CreateInter(){
         return integer;
     }

     public String CreateString(){
         return string;
     }
}

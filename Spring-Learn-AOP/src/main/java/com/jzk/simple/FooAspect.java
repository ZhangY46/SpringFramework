package com.jzk.simple;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Collection;

/**
 * ClassName:FooAspect
 * Package:com.jzk.simple
 * Description:
 *
 * @Date:2020/3/26 9:06
 * @Author:JiangZhikuan
 */


@Aspect         //配置切面
@Component      //配置bean
public class FooAspect {

    //配置切入点
    @Pointcut(value = "execution(* com.jzk.simple.service.impl.FooService.*(..))")
    public void fooService(){

    }

    /*//配置前置通知
    @Before(value = "fooService()&&args(a,b)",argNames = "a,b")
    public void before(int a,int b){
        System.out.println("a:"+a+"b:"+b);
        System.out.println("fooService  before");
    }

    //配置运行通知
    @AfterReturning(value = "fooService()",returning = "sum")
    public void afterReturning(int sum){
        System.out.println("fooService afterReturning,sum:" + sum);
    }

    //配置异常通知
    @AfterThrowing("fooService()")
    public void afterThrowing(){
        System.out.println("fooService AfterThrowing");
    }

    //配置最终通知
    @After("fooService()")
    public void after(){
        System.out.println("fooService after");
    }*/

    //配置环绕通知
    @Around(value = "fooService()&&args(a,b)")
    public Object around(ProceedingJoinPoint pjp,int a,int b) throws Throwable {
        System.out.println("before");
        System.out.println("afterRetuning,a:"+a+"b:"+b);
        Object retVal=pjp.proceed(new Object[]{a,b});
        System.out.println("after,sum:"+retVal);
        return retVal;
    }
}

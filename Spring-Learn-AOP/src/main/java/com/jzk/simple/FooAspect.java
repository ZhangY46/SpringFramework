package com.jzk.simple;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

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
    @Pointcut("execution(* com.jzk.simple.service.impl.FooService.*(..))")
    public void fooService(){

    }

  /*
    //配置前置通知
    @Before(value = "fooService()")
    public void before(){
        System.out.println("fooService  before");
    }

    //配置运行通知
    @AfterReturning(value = "fooService()",returning = "sum")
    public void afterReturning(String sum){
        System.out.println("fooService afterReturning,sum:"+sum);
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
    @Around("fooService()")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("before");
        System.out.println("afterRetuning");
        Object retVal=pjp.proceed();
        System.out.println("after");
        return retVal;
    }
}

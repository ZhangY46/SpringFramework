package com.jzk.simple;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.util.StopWatch;

/**
 * ClassName:SimpleProfiler
 * Package:com.jzk.simple
 * Description:
 *
 * @Date:2020/3/24 15:46
 * @Author:JiangZhikuan
 */
public class SimpleProfiler {

    public Object profile(ProceedingJoinPoint call) throws Throwable{
        StopWatch clock=new StopWatch();
        try {
            clock.start(call.toShortString());
            return call.proceed();
        }finally {
            clock.stop();
            System.out.println(clock.prettyPrint());
        }
    }

}

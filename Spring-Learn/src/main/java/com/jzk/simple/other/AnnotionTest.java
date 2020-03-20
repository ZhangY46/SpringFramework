package com.jzk.simple.other;

import org.springframework.stereotype.Component;

/**
 * ClassName:AnnotionTest
 * Package:com.jzk.simple.other
 * Description:
 *
 * @Date:2020/3/20 14:53
 * @Author:JiangZhikuan
 */

@Component(value = "annotationTest")
public class AnnotionTest {

    public void test(){
        System.out.println("AnnotationTest");
    }
}

package com.jzk.simple.other;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * ClassName:AnnotationIocTest
 * Package:com.jzk.simple.other
 * Description:
 *
 * @Date:2020/3/20 14:55
 * @Author:JiangZhikuan
 */

@Component
public class AnnotationIocTest {


    private AnnotionTest annotionTest;

    @Autowired
    public void setAnnotionTest(AnnotionTest annotionTest) {
        this.annotionTest = annotionTest;
    }

    public void testIOC(){
        annotionTest.test();
    }

}

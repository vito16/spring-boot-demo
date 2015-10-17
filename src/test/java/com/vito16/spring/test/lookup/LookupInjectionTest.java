/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved.
 */

/*
 * 修订记录：
 * muyu@yiji.com 2015-09-29 29:10:33 创建
 */
package com.vito16.spring.test.lookup;

import com.vito16.AppConfig;
import com.vito16.spring.lookup.Chain;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
 * Lookup方式注入测试<br>
 * 如果在一个singleton作用域的bean中注入一个prototype的bean,可以使用此种注入方式
 *
 * @author 木鱼 muyu@yiji.com
 * @version 2015-10-17
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {AppConfig.class})
public class LookupInjectionTest {

    @Autowired
    Chain chain;

    @Test
    public void testLook(){
        for(int i = 0;i<3;i++){
            chain.process();
        }
    }
}

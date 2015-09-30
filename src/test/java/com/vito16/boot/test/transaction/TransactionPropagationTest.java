/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved.
 */

/*
 * 修订记录：
 * muyu@yiji.com 2015-09-29 29:10:33 创建
 */
package com.vito16.boot.test.transaction;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.vito16.boot.AppConfig;
import com.vito16.boot.transaction.service.UserService;

/**
 * Spring注解事务传播级别测试<br>
 * 在Spring的注解事务中碰见一个比较坑的问题<br>
 * 如果在ClassA中的两个方法methodA调用methodB<br>
 * 当methodA的propagation为REQUIRED,methodB为REQUIRES_NEW时<br>
 * 在methodB中是未开启新事务的,还是使用的methodA的事务,最后一起提交<br>
 *
 * @author 木鱼 muyu@yiji.com
 * @version 2015-09-29
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {AppConfig.class})
public class TransactionPropagationTest {

    @Autowired
    UserService userService;

    @Test
    public void testSaveUser(){
        userService.doSaveUser();
    }

    @Test
    public void testSaveUserSelf(){
        userService.doSaveUserSelf();
    }

    @Test
    public void testSaveUserOther(){
        userService.doSaveUserOther();
    }
}

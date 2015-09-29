/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved.
 */

/*
 * 修订记录：
 * muyu@yiji.com 2015-09-29 29:10:33 创建
 */
package com.vito16.boot.test;

import com.vito16.boot.AppConfig;
import com.vito16.boot.entity.User;
import com.vito16.boot.repository.UserRepository;
import com.vito16.boot.service.TaskService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * @author 木鱼 muyu@yiji.com
 * @version 2015-09-29
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {AppConfig.class})
public class AppTest {

    @Autowired
    TaskService taskService;

    @Autowired
    UserRepository userRepository;

    @Test
    public void testDoTask(){
        taskService.doTask();
    }
}

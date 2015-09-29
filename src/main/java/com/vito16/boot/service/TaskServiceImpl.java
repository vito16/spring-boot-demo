/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved.
 */

/*
 * 修订记录：
 * muyu@yiji.com 2015-09-29 29:18:14 创建
 */
package com.vito16.boot.service;

import com.google.common.collect.Lists;
import com.vito16.boot.entity.User;
import com.vito16.boot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author 木鱼 muyu@yiji.com
 * @version 2015-09-29
 */
@Service
public class TaskServiceImpl implements TaskService {

    @Autowired
    UserRepository userRepository;

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void doTask() {
        List<User> userList = Lists.newArrayList(new User("1","1"),new User("2","2"),new User("3","3"));
        userRepository.save(userList.get(0));
        if(userList.size()==3){
//            throw new NullPointerException("123");
        }
        for(int i=0;i<3;i++){
            doTaskProcess(i);
        }
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    private void doTaskProcess(int i) {
        if(i==2){
//            throw new NullPointerException("发生错误了");
        }
        userRepository.save(new User("1"+i,"1"));
    }
}

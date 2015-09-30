/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved.
 */

/*
 * 修订记录：
 * muyu@yiji.com 2015-09-29 29:18:14 创建
 */
package com.vito16.boot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.vito16.boot.entity.User;
import com.vito16.boot.repository.UserRepository;

/**
 * @author 木鱼 muyu@yiji.com
 * @version 2015-09-29
 */
@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    OtherService otherService;

    @Transactional(propagation = Propagation.REQUIRED,noRollbackFor = NullPointerException.class)
    public void doSaveUser() {
        userRepository.save(new User("vito","zhou"));
        for(int i=0;i<3;i++){
            otherService.doTaskProcess(i);
        }
    }

}

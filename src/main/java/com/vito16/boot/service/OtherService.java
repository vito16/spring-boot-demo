/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved.
 */

/*
 * 修订记录：
 * muyu@yiji.com 2015-09-30 30:13:51 创建
 */
package com.vito16.boot.service;

import com.vito16.boot.entity.User;
import com.vito16.boot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author 木鱼 muyu@yiji.com
 * @version 2015-09-30
 */
@Service
public class OtherService {

    @Autowired
    UserRepository userRepository;
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void doTaskProcess(int i) {
        if(i==2){
            throw new NullPointerException("人为抛出异常...");
        }
        userRepository.save(new User("first" + i, "last"));
    }

}

/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved.
 */

/*
 * 修订记录：
 * muyu@yiji.com 2015-10-17 17:16:29 创建
 */
package com.vito16.spring.lookup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * @author 木鱼 muyu@yiji.com
 * @version 2015-10-17
 */
@Service
public class Chain {

    @Autowired
    @Qualifier("runCommand")
    private Command command;

    public void process(){
        command.action();
    }

}

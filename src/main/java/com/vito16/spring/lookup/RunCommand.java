/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved.
 */

/*
 * 修订记录：
 * muyu@yiji.com 2015-10-17 17:16:30 创建
 */
package com.vito16.spring.lookup;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author 木鱼 muyu@yiji.com
 * @version 2015-10-17
 */
@Component
@Scope("prototype")
public class RunCommand implements Command {
    @Override
    public void action() {
        System.out.println("跑起来...");
    }
}

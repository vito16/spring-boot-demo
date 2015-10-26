/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved.
 */

/*
 * 修订记录：
 * muyu@yiji.com 2015-10-26 26:13:53 创建
 */
package com.vito16.spring.lookup;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * @author 木鱼 muyu@yiji.com
 * @version 2015-10-26
 */
@Configuration
public class LookUpConfig {

    @Bean
    @Scope("prototype")
    public Command runCommand(){
        return new RunCommand();
    }

    @Bean
    public Chain chain(){
        return new Chain() {
            @Override
            protected Command createCommand() {
                return runCommand();
            }
        };
    }
}

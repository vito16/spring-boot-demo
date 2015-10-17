/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved.
 */

/*
 * 修订记录：
 * muyu@yiji.com 2015-09-29 29:23:56 创建
 */
package com.vito16.spring.transaction.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vito16.spring.transaction.entity.User;

/**
 * @author 木鱼 muyu@yiji.com
 * @version 2015-09-29
 */
@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    List<User> findByLastName(String lastName);
}

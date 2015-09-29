/*
 * www.yiji.com Inc.
 * Copyright (c) 2015 All Rights Reserved.
 */

/*
 * 修订记录：
 * muyu@yiji.com 2015-09-29 29:23:56 创建
 */
package com.vito16.boot.repository;

import com.vito16.boot.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 木鱼 muyu@yiji.com
 * @version 2015-09-29
 */
@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    List<User> findByLastName(String lastName);
}

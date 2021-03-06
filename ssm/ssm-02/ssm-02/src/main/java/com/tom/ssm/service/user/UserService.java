package com.tom.ssm.service.user;

import com.tom.ssm.entity.UserEntity;

import java.util.List;

/**
 * ClassName: UserService
 * Description:
 *
 * @author Mi_dad
 * @date 2019/10/10 21:50
 */
public interface UserService {
    /**
     * 查询所有的用户信息
     * @return
     */
    List<UserEntity> findAllUser();
}

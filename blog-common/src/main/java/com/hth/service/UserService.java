package com.hth.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hth.domain.entity.ResponseResult;
import com.hth.domain.entity.User;


/**
 * 用户表(User)表服务接口
 *
 * @author makejava
 * @since 2023-02-17 23:42:29
 */
public interface UserService extends IService<User> {

    ResponseResult userInfo();

    ResponseResult updateUserInfo(User user);

    ResponseResult register(User user);
}

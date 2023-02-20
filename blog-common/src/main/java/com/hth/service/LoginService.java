package com.hth.service;

import com.hth.domain.entity.ResponseResult;
import com.hth.domain.entity.User;

public interface LoginService {
    ResponseResult login(User user);

    ResponseResult logout();
}
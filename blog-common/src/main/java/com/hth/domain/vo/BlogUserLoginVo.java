package com.hth.domain.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
//登陆后返回前端
public class BlogUserLoginVo {

    private String token;
    private UserInfoVo userInfo;
}
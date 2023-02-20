package com.hth.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hth.domain.entity.UserRole;
import com.hth.mapper.UserRoleMapper;
import com.hth.service.UserRoleService;
import org.springframework.stereotype.Service;

/**
 * 用户和角色关联表(UserRole)表服务实现类
 *
 * @author makejava
 * @since 2023-02-20 13:09:12
 */
@Service("userRoleService")
public class UserRoleServiceImpl extends ServiceImpl<UserRoleMapper, UserRole> implements UserRoleService {

}

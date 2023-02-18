package com.hth.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hth.domain.entity.User;
import org.apache.ibatis.annotations.Mapper;


/**
 * 用户表(User)表数据库访问层
 *
 * @author makejava
 * @since 2023-02-17 23:42:29
 */
public interface UserMapper extends BaseMapper<User> {

}

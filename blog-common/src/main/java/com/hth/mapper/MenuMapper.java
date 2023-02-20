package com.hth.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hth.domain.entity.Menu;

import java.util.List;


/**
 * 菜单权限表(Menu)表数据库访问层
 *
 * @author makejava
 * @since 2023-02-20 09:23:00
 */
public interface MenuMapper extends BaseMapper<Menu> {


    List<String> selectPermsByUserId(Long id);

    List<Menu> selectAllRouterMenu();

    List<Menu> selectRouterMenuTreeByUserId(Long userId);

    List<Long> selectMenuListByRoleId(Long roleId);
}

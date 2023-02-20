package com.hth.controller;

import com.hth.domain.entity.LoginUser;
import com.hth.domain.entity.Menu;
import com.hth.domain.entity.ResponseResult;
import com.hth.domain.entity.User;
import com.hth.domain.vo.AdminUserInfoVo;
import com.hth.domain.vo.RoutersVo;
import com.hth.domain.vo.UserInfoVo;
import com.hth.enums.AppHttpCodeEnum;
import com.hth.exception.SystemException;
import com.hth.service.LoginService;
import com.hth.utils.BeanCopyUtils;
import com.hth.utils.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.hth.service.MenuService;
import com.hth.service.RoleService;

import java.util.List;

@RestController
public class LoginController {
    @Autowired
    private MenuService menuService;

    @Autowired
    private RoleService roleService;
    @Autowired
    private LoginService loginService;

    @PostMapping("/user/logout")
    public ResponseResult logout(){
        return loginService.logout();
    }

    @PostMapping("/user/login")
    public ResponseResult login(@RequestBody User user){
        if(!StringUtils.hasText(user.getUserName())){
            //提示 必须要传用户名
            throw new SystemException(AppHttpCodeEnum.REQUIRE_USERNAME);
        }
        return loginService.login(user);
    }
    @GetMapping("getInfo")
    public ResponseResult<AdminUserInfoVo> getInfo(){
        //获取当前登录的用户
        LoginUser loginUser = SecurityUtils.getLoginUser();
        //根据用户id查询权限信息
        List<String> perms = menuService.selectPermsByUserId(loginUser.getUser().getId());
        //根据用户id查询角色信息
        List<String> roleKeyList = roleService.selectRoleKeyByUserId(loginUser.getUser().getId());

        //获取用户信息
        User user = loginUser.getUser();
        UserInfoVo userInfoVo = BeanCopyUtils.copyBean(user, UserInfoVo.class);
        //封装数据返回

        AdminUserInfoVo adminUserInfoVo = new AdminUserInfoVo(perms,roleKeyList,userInfoVo);
        return ResponseResult.okResult(adminUserInfoVo);
    }

    @GetMapping("getRouters")
    public ResponseResult<RoutersVo> getRouters(){
        Long userId = SecurityUtils.getUserId();
        //查询menu 结果是tree的形式
        List<Menu> menus = menuService.selectRouterMenuTreeByUserId(userId);
        //封装数据返回
        return ResponseResult.okResult(new RoutersVo(menus));
    }

}
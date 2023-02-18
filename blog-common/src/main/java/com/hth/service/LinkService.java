package com.hth.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hth.domain.entity.Link;
import com.hth.domain.entity.ResponseResult;


/**
 * 友链(Link)表服务接口
 *
 * @author makejava
 * @since 2023-02-17 22:29:16
 */
public interface LinkService extends IService<Link> {

    ResponseResult getAllLink();
}

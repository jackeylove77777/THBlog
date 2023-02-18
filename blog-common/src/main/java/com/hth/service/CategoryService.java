package com.hth.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hth.domain.entity.Category;
import com.hth.domain.entity.ResponseResult;


/**
 * 分类表(ThCategory)表服务接口
 *
 * @author makejava
 * @since 2023-02-17 21:39:28
 */
public interface CategoryService extends IService<Category> {

    ResponseResult getCategoryList();
}

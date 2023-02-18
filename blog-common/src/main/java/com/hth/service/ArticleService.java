package com.hth.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hth.domain.entity.Article;
import com.hth.domain.entity.ResponseResult;

public interface ArticleService extends IService<Article> {
    ResponseResult hotArticleList();

    ResponseResult articleList(Integer pageNum, Integer pageSize, Long categoryId);

    ResponseResult getArticleDetail(Long id);

    ResponseResult updateViewCount(Long id);
}

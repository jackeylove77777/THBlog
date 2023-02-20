package com.hth.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hth.domain.dto.AddArticleDto;
import com.hth.domain.dto.ArticleDto;
import com.hth.domain.entity.Article;
import com.hth.domain.entity.ResponseResult;
import com.hth.domain.vo.ArticleVo;
import com.hth.domain.vo.PageVo;

public interface ArticleService extends IService<Article> {
    ResponseResult hotArticleList();

    ResponseResult articleList(Integer pageNum, Integer pageSize, Long categoryId);

    ResponseResult getArticleDetail(Long id);

    ResponseResult updateViewCount(Long id);

    ResponseResult add(AddArticleDto article);

    PageVo selectArticlePage(Article article, Integer pageNum, Integer pageSize);

    ArticleVo getInfo(Long id);

    void edit(ArticleDto article);
}

package com.hth.controller;

import com.hth.domain.dto.AddArticleDto;
import com.hth.domain.dto.ArticleDto;
import com.hth.domain.entity.Article;
import com.hth.domain.entity.ResponseResult;
import com.hth.domain.vo.ArticleVo;
import com.hth.domain.vo.PageVo;
import com.hth.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author 三更  B站： https://space.bilibili.com/663528522
 */
@RestController
@RequestMapping("/content/article")
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @PostMapping
    public ResponseResult add(@RequestBody AddArticleDto article){
        return articleService.add(article);
    }
    @GetMapping("/list")
    public ResponseResult list(Article article, Integer pageNum, Integer pageSize)
    {
        PageVo pageVo = articleService.selectArticlePage(article,pageNum,pageSize);
        return ResponseResult.okResult(pageVo);
    }

    @GetMapping(value = "/{id}")
    public ResponseResult getInfo(@PathVariable(value = "id")Long id){
        ArticleVo article = articleService.getInfo(id);
        return ResponseResult.okResult(article);
    }

    @PutMapping
    public ResponseResult edit(@RequestBody ArticleDto article){
        articleService.edit(article);
        return ResponseResult.okResult();
    }
    @DeleteMapping("/{id}")
    public ResponseResult delete(@PathVariable Long id){
        articleService.removeById(id);
        return ResponseResult.okResult();
    }

}
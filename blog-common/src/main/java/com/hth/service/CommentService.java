package com.hth.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hth.domain.entity.Comment;
import com.hth.domain.entity.ResponseResult;


/**
 * 评论表(Comment)表服务接口
 *
 * @author makejava
 * @since 2023-02-18 15:00:04
 */
public interface CommentService extends IService<Comment> {

    ResponseResult commentList(String commentType, Long articleId, Integer pageNum, Integer pageSize);

    ResponseResult addComment(Comment comment);
}

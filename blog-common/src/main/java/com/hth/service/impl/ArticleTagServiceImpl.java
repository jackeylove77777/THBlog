package com.hth.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hth.domain.entity.ArticleTag;
import com.hth.mapper.ArticleTagMapper;
import com.hth.service.ArticleTagService;
import org.springframework.stereotype.Service;
import com.hth.domain.entity.ArticleTag;
/**
 * 文章标签关联表(ArticleTag)表服务实现类
 *
 * @author makejava
 * @since 2023-02-20 12:07:46
 */
@Service("articleTagService")
public class ArticleTagServiceImpl extends ServiceImpl<ArticleTagMapper, ArticleTag> implements ArticleTagService {

}

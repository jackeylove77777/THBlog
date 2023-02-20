package com.hth.service;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.IService;
import com.hth.domain.dto.TagListDto;
import com.hth.domain.entity.ResponseResult;
import com.hth.domain.entity.Tag;
import com.hth.domain.vo.PageVo;
import com.hth.domain.vo.TagVo;
import org.springframework.util.StringUtils;

import java.util.List;


/**
 * 标签(Tag)表服务接口
 *
 * @author makejava
 * @since 2023-02-18 23:05:25
 */
public interface TagService extends IService<Tag> {


    ResponseResult<PageVo> pageTagList(Integer pageNum, Integer pageSize, TagListDto tagListDto);

    List<TagVo> listAllTag();
}

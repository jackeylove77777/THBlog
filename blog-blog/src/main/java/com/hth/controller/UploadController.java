package com.hth.controller;

import com.hth.domain.entity.ResponseResult;
import com.hth.service.UploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.Objects;

@RestController
public class UploadController {
    @Qualifier("ossService")
    @Autowired
    private UploadService uploadService;

    @PostMapping("/upload")
    public ResponseResult uploadImg(MultipartFile img){
//        System.out.println(img==null);
//        System.out.println(img.getOriginalFilename());
//        System.out.println(uploadService==null);
        return uploadService.uploadImg(img);
    }
}
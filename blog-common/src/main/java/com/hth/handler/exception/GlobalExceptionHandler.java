package com.hth.handler.exception;

import com.hth.domain.entity.ResponseResult;
import com.hth.enums.AppHttpCodeEnum;
import com.hth.exception.SystemException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

//RestControllerAdvice的作用范围是：
//        单个项目中所有使用了RequestMapping（像PostMapping底层是使用了RequestMapping注解的也支持）
//        的类都归他管

//RestControllerAdvice+ExceptionHandler这两个注解的组合，被用作项目的全局异常处理
@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    @ExceptionHandler(SystemException.class)
    public ResponseResult systemExceptionHandler(SystemException e){
        //打印异常信息
        log.error("出现了异常！ {}",e);
        //从异常对象中获取提示信息封装返回
        return ResponseResult.errorResult(e.getCode(),e.getMsg());
    }


    @ExceptionHandler(Exception.class)
    public ResponseResult exceptionHandler(Exception e){
        //打印异常信息
        log.error("出现了异常！ {}",e);
        //从异常对象中获取提示信息封装返回
        return ResponseResult.errorResult(AppHttpCodeEnum.SYSTEM_ERROR.getCode(),e.getMessage());
    }
}
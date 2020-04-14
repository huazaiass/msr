package com.msr.servicebase.exception;

import com.msr.commonutils.ExceptionUtil;
import com.msr.commonutils.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 全局异常类
 */
@ControllerAdvice
@Slf4j //添加@Slf4j后，可以使用日志对象，把日志输出到文件了,log
public class GlobalExceptionHandler{

    //全局异常
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public R error(Exception e){

        e.printStackTrace();
        return R.error().message("全局异常！！！");
    }

    //特定异常
    @ExceptionHandler(ArithmeticException.class)
    @ResponseBody
    public R error(ArithmeticException e){
        log.error(ExceptionUtil.getMessage(e));
        return R.error().message("算术异常！！！");
    }

    //自定义异常
    @ExceptionHandler(MSRException.class)
    @ResponseBody
    public R error(MSRException e){
        //当程序出现异常，则把异常信息保存到文件
        log.error(ExceptionUtil.getMessage(e));
        return R.error().code(e.getCode()).message(e.getMessage());
    }
}


package com.dade.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Dade on 2016/12/1.
 */
@ControllerAdvice
public class AppWideExceptionHandler {

    @ExceptionHandler(NullPointerException.class)
    @ResponseBody                           // 这里加上这个注解才能正常使用,RestController 里面有这个注解
    public String handlerException(){
        return "exception/controller";
    }

}

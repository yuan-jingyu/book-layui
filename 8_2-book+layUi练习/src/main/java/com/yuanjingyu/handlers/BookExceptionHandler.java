package com.yuanjingyu.handlers;

import com.yuanjingyu.dto.Message;
import com.yuanjingyu.dto.Result;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 统一异常处理类
 */
@ResponseBody
@ControllerAdvice  //===>拦截异常并统一处理注解
public class BookExceptionHandler {

    @ExceptionHandler(value = {Exception.class})
    public Result commonException(Exception e){
        e.printStackTrace();
        Result result = new Result();
        Message message = new Message();

        if (e instanceof ArithmeticException){
            message.setMsg("分母不能为0");
            message.setCode(1);
            result.setMessage(message);
        }else {
            message.setMsg("其他未知异常");
            message.setCode(-1);
            result.setMessage(message);
        }

        return result;
    }

}




























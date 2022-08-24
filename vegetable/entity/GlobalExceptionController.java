package com.vegetable.entity;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class GlobalExceptionController {
    /**
     * 全局异常捕捉处理
     * @param e
     * @return
     */
    @ResponseBody
    @ExceptionHandler(value = Exception.class)
    public Map errorHandler(Exception e) {
        System.out.println("用户异常调用测！");
        Map map = new HashMap();
        map.put("code", 100);
        map.put("msg", e.getMessage());
        return map;
    }

    /**
     * 拦截捕捉自定义异常 用户删除异常
     * @param ex
     * @return

    @ResponseBody
    @ExceptionHandler(value = UserDeleteException.class)
    public AjaxResult UserDeleteException(UserDeleteException ex) {
        return AjaxResult.error(ex.getMessage());
    }
*/
    /**
     * 拦截捕捉自定义异常 用户锁定异常
     * @param ex
     * @return

    @ResponseBody
    @ExceptionHandler(value = UserBlockedException.class)
    public AjaxResult UserBlockedException(UserBlockedException ex) {
        System.out.println("用户锁定异常调用！");
        return AjaxResult.error(ex.getMessage());
    }*/
}


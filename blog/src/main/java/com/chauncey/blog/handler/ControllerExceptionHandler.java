package com.chauncey.blog.handler;


import org.apache.coyote.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.web.HttpRequestHandler;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * @Description 拦截异常处理
 */

@ControllerAdvice
public class ControllerExceptionHandler {
    //将异常记录在日志中
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    /**
     * @Description 处理错误的信息
     * @param request：访问的异常URL
     * @param e：异常参数
     * @return 返回错误信息页面
     * @throws Exception 向上抛出异常
     */
    @ExceptionHandler(Exception.class)
    public ModelAndView exceptionHandler(HttpServletRequest request, Exception e) throws Exception{

        //记录异常信息
        logger.error("Request URL : {}, Exception : {}", request.getRequestURL(),e);

        //当标识状态码时不会拦截
        if(AnnotationUtils.findAnnotation(e.getClass(), ResponseStatus.class)!=null) {
            throw e;
        }

        //否则将异常信息返回给页面
        ModelAndView mv = new ModelAndView();
        mv.addObject("request URL : ",request.getRequestURL());
        mv.addObject("Exception : ",e);
        mv.setViewName("error/error");
        return mv;
    }
}

package com.chauncey.blog.aspect;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;

@Aspect
@Component
public class LogAspect {

    /**
     * @Description 获取日志信息
     */
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    /**
     * @Description 定义切面，申明log()是一个切面
     */
    @Pointcut(value = "execution(* com.chauncey.blog.controller.*.* (..))")
    public void log() {
    }


    @Before("log()")//在切面之前执行
    public void doBefore(JoinPoint joinPoint) {
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        assert attributes != null;
        HttpServletRequest request = attributes.getRequest();

        //获取URL，IP
        String url = request.getRequestURL().toString();
        String ip = request.getRemoteAddr();

        //获取请求方法
        String classMethod = joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName();
        //获取请求参数
        Object[] args = joinPoint.getArgs();
        //调用自定义的请求方法
        RequestLog requestLog = new RequestLog(url, ip, classMethod, args);
        logger.info("request log:{}", requestLog);
    }

    @After("log()")
    public void doAfter(){}

    /**
     * @Description 当目标函数返回之后拦截
     * @param result 目标函数返回的信息
     */
    @AfterReturning(returning = "result",pointcut = "log()")
    public void doAfterReturning(Object result){
        logger.info("result:{}",result);
    }
    private static class RequestLog {
        private String url;
        private String ip;
        private String classMethod;
        private Object[] args;

        public RequestLog(String url, String ip, String classMethod, Object[] args) {
            this.url = url;
            this.ip = ip;
            this.classMethod = classMethod;
            this.args = args;
        }

        @Override
        public String toString() {
            return "RequestLog{" +
                    "url='" + url + '\'' +
                    ", ip='" + ip + '\'' +
                    ", classMethod='" + classMethod + '\'' +
                    ", args=" + Arrays.toString(args) +
                    '}';
        }
    }
}

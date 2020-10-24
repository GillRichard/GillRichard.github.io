package com.chauncey.blog.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Description index page controller
 */
@Controller
public class IndexController {
    //通过get方式请求路径
    @GetMapping("/")
    public String index(){
        return "index";
    }
}

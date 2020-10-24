package com.chauncey.blog.controller.admin;

import com.chauncey.blog.model.User;
import com.chauncey.blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;

@RequestMapping("/admin")
@Controller
public class LoginController {

    @Autowired
    private UserService userService;

    /**
     * @Description 跳转登录页面
     * @return 返回登录页面
     */
    @RequestMapping(method = RequestMethod.GET)
    public String loginPage(){
        return "/admin/login";
    }

    /**
     * @Description 登录校验
     * @param username 用户名
     * @param password 用户密码
     * @param session http session域，可存储信息
     * @param attributes 返回页面消息
     * @return 成功返回登录成功页面，失败返回登录页面
     */
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        HttpSession session,
                        RedirectAttributes attributes){
        User user = userService.findUserByNameAndPasswd(username, password);
        if (user!=null){
            //security
            user.setPassword(null);
            session.setAttribute("user", user);
            return "/admin/index";
        }else{
            attributes.addFlashAttribute("message","username or password is wrong.");
            return "redirect:/admin";
        }
    }

    /**
     * @Description 用户注销登录
     * @param session session域
     * @return 用户登录页面
     */
    @RequestMapping(value = "/logout",method = RequestMethod.GET)
    public String logout(HttpSession session){
        session.removeAttribute("user");
        return "redirect:/admin";
    }


}

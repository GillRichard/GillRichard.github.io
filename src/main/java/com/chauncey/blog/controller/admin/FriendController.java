package com.chauncey.blog.controller.admin;


import com.chauncey.blog.model.Friend;
import com.chauncey.blog.service.FriendService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sun.javafx.logging.JFRInputEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.jws.WebParam;
import javax.validation.Valid;
import java.util.Date;
import java.util.List;

/**
 * @Description 友链处理器
 */
@RequestMapping("/admin")
@Controller
public class FriendController {
    @Autowired
    private FriendService friendService;


    /**
     * @Description 查看所有朋友
     * @param model 指定该类型的参数
     * @param pageNum 开始显示的页数
     * @return 友链网址页面
     */
    @RequestMapping(value = "/friend", method = RequestMethod.GET)
    public String friend(Model model, @RequestParam(defaultValue = "1", value = "pageNum") Integer pageNum){
        PageHelper.startPage(pageNum,10);
        List<Friend> friends = friendService.listFriendLink();
        PageInfo<Friend> friendPageInfo = new PageInfo<>(friends);
        model.addAttribute(friendPageInfo);
        return "admin/friendlinks";
    }


    @RequestMapping(value = "friend/{id}/delete",method = RequestMethod.GET)
    public String delete(@PathVariable Long id, RedirectAttributes attributes){
        friendService.deleteByPrimaryKey(id);
        attributes.addFlashAttribute("message", "delete successful!");
        return "redirect:/admin/friend";
    }

    //跳转新增友链页面
    @RequestMapping(value = "/friend/input", method = RequestMethod.GET)
    public String input(Model model){
        model.addAttribute(new Friend());
        return "admin/friendlinks-input";
    }

    //新增友链方法
    @RequestMapping(value = "/friend", method = RequestMethod.POST)
    public String insert(@Valid Friend friend, Model model, BindingResult result, RedirectAttributes redirectAttributes){
        Friend friendByBlogAddress = friendService.getFriendByBlogAddress(friend.getBlogaddress());
        if (friendByBlogAddress != null){
            redirectAttributes.addFlashAttribute("message", "Don't add this friend repeat");
            return "redirect:/admin/friend/input";
        }
        if (result.hasErrors()){
            return "admin/friendlinks-input";
        }

        friend.setCreateTime(new Date());

        int insert = friendService.insert(friend);
        if (insert == 0){
            redirectAttributes.addFlashAttribute("message", "新增失败");
        }else {
            redirectAttributes.addFlashAttribute("message","新增成功");
        }

//        return "redirect:/admin/friendlinks";
        return "admin/friendlinks";
    }

    //跳转修改友链
    @GetMapping(value = "/friend/{id}/input")
    public String postFriend(@PathVariable Long id, Model model){
        model.addAttribute("friendLinks",friendService.selectByPrimaryKey(id));
        return "admin/friendlinks-input";
    }

    //友链修改
    @PostMapping(value = "/friend/{id}")
    public String postFriend(@Valid Friend friend, RedirectAttributes attributes){
        int update = friendService.updateByPrimaryKey(friend);
        if (update==0){
            attributes.addFlashAttribute("message", "修改失败");
        }else {
            attributes.addFlashAttribute("message","修改成功");

        }
        return "redirect:/admin/friends";
    }


}

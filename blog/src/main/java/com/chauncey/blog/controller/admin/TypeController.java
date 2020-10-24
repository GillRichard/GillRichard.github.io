package com.chauncey.blog.controller.admin;

import com.chauncey.blog.model.Type;
import com.chauncey.blog.service.TypeService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/admin")
public class TypeController {

    @Autowired
    private TypeService typeService;

    //分页查询列表
    @GetMapping("/types")
    public String list(Model model, @RequestParam(defaultValue = "1", value = "pageNum") Integer pageNum) {
        String orderBy = "id desc";
        PageHelper.startPage(pageNum, 10, orderBy);
        List<Type> types = typeService.selectAllType();
        PageInfo<Type> pageInfo = new PageInfo<Type>(types);
        model.addAttribute("pageInfo", pageInfo);
        return "admin/types";
    }

    //返回新增分类属性
    @GetMapping("/types/input")
    public String input(Model model) {
        model.addAttribute("type", new Type());
        return "admin/types-input";
    }

    //添加新的分类
    @PostMapping("/types")
    public String post(@Validated Type type, RedirectAttributes attributes) {
        Type typeByName = typeService.getTypeByName(type.getName());
        if (typeByName != null) {
            attributes.addFlashAttribute("message", "This type is exist, please don't add repeatable!");
            return "redirect:/admin/types/input";
        }
        int insert = typeService.insert(type);
        if (insert==0){
            attributes.addFlashAttribute("message","新增失败");
        }else{
            attributes.addFlashAttribute("message", "新增成功");
        }

        return "redirect:/admin/types";
    }

    //跳转修改分类页面
    @RequestMapping(value = "/types/{id}/input", method = RequestMethod.GET)
    public String editInput(@PathVariable Long id, Model model){//PathVariable 获取URl中的数据
        model.addAttribute("type", typeService.selectByPrimaryKey(id));
        return "admin/types-input";
    }

    // 编辑修改分类页面
    @RequestMapping(value = "/types/{id}", method = RequestMethod.POST)
    public String editPost(@Validated Type type, RedirectAttributes attributes){
        if(typeService.getTypeByName(type.getName())!=null){
            attributes.addFlashAttribute("message", "不能重复添加分类");
            return "redirect:/admin/types/input";
        }

        int update = typeService.updateByPrimaryKeySelective(type);
        if (update==0){
            attributes.addFlashAttribute("message","修改失败");
        }else {
            attributes.addFlashAttribute("message", "修改成功");
        }
        return "redirect:/admin/types";
    }

    @RequestMapping(value = "types/{id}/delete", method = RequestMethod.GET)
    public String delete(@PathVariable Long id, RedirectAttributes attributes){
        typeService.deleteByPrimaryKey(id);
        attributes.addFlashAttribute("message","删除成功");
        return "redirect:/admin/types";
    }
}

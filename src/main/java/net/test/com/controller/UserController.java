package net.test.com.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import net.test.com.pojo.User;
import net.test.com.service.UserService;
import net.test.com.util.ListResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

/**
 * @program: springMvcDemo
 * @description: 用户控制器
 * @author: Mr.Liu
 * @create: 2018-12-06 18:46
 **/
@Controller
@RequestMapping("user")
public class UserController{
    @Autowired
    private UserService userService;
    @RequestMapping("page/{pn}/{ps}")
    @ResponseBody
    public ListResult getAll(@PathVariable(value = "pn") Integer pn,
                             @PathVariable(value = "ps")Integer ps, HttpServletRequest request){
        String orderBy ="id desc";
        PageHelper.startPage(pn,ps);
        List<User> list = userService.findAll();
        PageInfo page =new PageInfo(list,4);
        request.setAttribute("page",page);
       return ListResult.success().add("page",page);
    }
}
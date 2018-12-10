package net.test.com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: springMvcDemo
 * @description: demo
 * @author: Mr.Liu
 * @create: 2018-12-04 17:57
 **/
@Controller
public class Demo1Controller {
    @RequestMapping("demo1")
    public String  demo(Model model){
        System.out.println("控制器执行了");
        model.addAttribute( "model","搞啥子哦" );
        return "main";
    }
}
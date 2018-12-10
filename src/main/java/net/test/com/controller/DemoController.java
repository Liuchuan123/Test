//package net.test.com.controller;
//
//import net.test.com.pojo.User;
//import org.apache.commons.io.FileUtils;
//import org.aspectj.util.FileUtil;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.multipart.MultipartFile;
//import org.springframework.web.servlet.ModelAndView;
//
//import javax.servlet.ServletOutputStream;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//import java.util.List;
//import java.util.UUID;
//
///**
// * @program: springMvcDemo
// * @description: demo控制器
// * @author: Mr.Liu
// * @create: 2018-11-29 17:25
// **/
//@Controller
//public class DemoController {
//    @RequestMapping("/demo")
//    @ResponseBody
//    public User demo(User user){
//        System.out.println(user.toString());
//        return user;
//    }
//
//    @RequestMapping("demo1")
//    public String demo1(User user,@RequestParam(value = "hover")List<String> list){
//        System.out.println(user+"====="+list);
//        return "login";
//    }
//    @RequestMapping(value = "demo2")
//    @ResponseBody
//    public String demo2(HttpServletResponse response, HttpServletRequest request) throws IOException {
//        response.setContentType("text/html;charset=utf-8");
//        request.setCharacterEncoding("utf-8");
//        User u = new User();
//        u.setAge( 15 );
//        u.setName("张三");
//        return "中国";
//    }
//    @RequestMapping("/demo5")
//    public String test(HttpServletRequest req, HttpServletResponse resp, HttpSession session){
//        req.setAttribute( "req","req的" );
//        System.out.println(req.getAttribute("req"));
//        req.getSession().setAttribute("session","session的");
//        session.setAttribute( "session1","session1的" );
//        req.getServletContext().setAttribute("app","app的");
//        return "main";
//    }
//    @RequestMapping("demo6")
//    public ModelAndView demo6(Model model){
//        ModelAndView modelAndView = new ModelAndView("main");
//        modelAndView.addObject("model","modelde zhi ");
//        return modelAndView;
//    }
//    @RequestMapping("download")
//    public void download(String file,HttpServletResponse res,HttpServletRequest req) throws IOException {
//        res.setHeader("Content-Disposition","attachment;filename="+file);
//        ServletOutputStream outputStream = res.getOutputStream();
//        String path = req.getServletContext().getRealPath( "files" );
//        File file1 = new File(path,file);
//        FileInputStream inputStream = new FileInputStream(file1);
//        byte[] bytes = FileUtil.readAsByteArray( inputStream );
//        outputStream.write(bytes);
//        outputStream.flush();
//        outputStream.close();
//    }
//    @RequestMapping("upload")
//    public String upload(MultipartFile  file,String name) throws IOException {
//        String s = UUID.randomUUID().toString();
//        System.out.println(file);
//        String suffix = file.getOriginalFilename().substring( file.getOriginalFilename().lastIndexOf( "." ) );
//        System.out.println(suffix);
//        FileUtils.copyInputStreamToFile(file.getInputStream(),new File("D:/"+s+suffix));
//        return  "main";
//    }
//
//
//}
package net.test.com.test;

import com.github.pagehelper.PageInfo;
import net.test.com.pojo.User;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.context.WebApplicationContext;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @program: springMvcDemo
 * @description:
 * @author: Mr.Liu
 * @create: 2018-12-06 18:52
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = {"classpath:applicationContext.xml","classpath:springmvc.xml"})
public class TestPage {
    @Autowired
    WebApplicationContext context;
    MockMvc mockMvc = null;
    @Before
    public void init(){
        mockMvc=MockMvcBuilders.webAppContextSetup(context).build();
    }
    @Test
    public void testPage() throws Exception{
        MultiValueMap<String ,String>map = new LinkedMultiValueMap<>();
        map.set("pn","2");
        map.set("ps","5");
        MvcResult result = mockMvc.perform( MockMvcRequestBuilders.get( "/user/page" ).params(map)).andReturn();
        PageInfo page= (PageInfo) result.getRequest().getAttribute("page");
        System.out.println("当前页==="+page.getPageNum());
        System.out.println("总页码==="+page.getTotal());
        List<User> list = page.getList();
        for (User user : list) {
            System.out.println(user.getId()+"=========="+user.getUsername());
        }
        int[] navigatepageNums = page.getNavigatepageNums();
        for (int navigatepageNum : navigatepageNums) {
            System.out.print(" "+navigatepageNum);
        }

    }
}
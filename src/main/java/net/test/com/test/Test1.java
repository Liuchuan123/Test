package net.test.com.test;

import org.junit.Test;

import javax.servlet.http.HttpServletRequest;
import java.io.File;

/**
 * @program: springMvcDemo
 * @description:
 * @author: Mr.Liu
 * @create: 2018-12-06 16:45
 **/
public class Test1 {
    @Test
    public  void testFile(){
        File file = new File( "files" ,"file.xml");
    }
}
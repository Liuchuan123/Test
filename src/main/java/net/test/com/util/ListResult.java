package net.test.com.util;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: springMvcDemo
 * @description: 用户页面结果封装
 * @author: Mr.Liu
 * @create: 2018-12-07 00:19
 **/
public class ListResult {
    //100表示成功   200表示失败
    private Integer code;
    private String msg;
    private Map<String,Object> map = new HashMap<>();

    public  static ListResult   success(){
        ListResult listResult = new ListResult();
        listResult.setCode(200);
        listResult.setMsg("操作成功");
        return listResult;
    }
    public  static ListResult fail(){
        ListResult listResult = new ListResult();
        listResult.setCode(100);
        listResult.setMsg( "操作失败" );
        return listResult;
    }
    public  ListResult add(String key,Object value){
        this.getMap().put( key,value );
        return this;
    }
    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Map<String, Object> getMap() {
        return map;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }

    @Override
    public String toString() {
        return "ListResult{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", map=" + map +
                '}';
    }
}
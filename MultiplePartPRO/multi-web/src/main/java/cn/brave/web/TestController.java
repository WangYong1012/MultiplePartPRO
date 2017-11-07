package cn.brave.web;

import cn.brave.service.balance.IUserBalanceService;
import cn.brave.util.DateTool;
import cn.brave.web.anno.OwnAnnotation;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/test")
public class TestController
{
    @Autowired(required = false)
    private IUserBalanceService userBalanceService;
    
    @ResponseBody
    @RequestMapping(value = "/index")
    @OwnAnnotation(name = "operate", value = "测试操作")
    public String test()
    {
        System.out.println("Now Time is ：" + DateTool.getHoleDate());
    	
        
        return JSONObject.toJSONString(userBalanceService.getList());
    }
    
    
    
    
}
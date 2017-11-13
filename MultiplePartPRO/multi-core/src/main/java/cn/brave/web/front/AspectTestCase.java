package cn.brave.web.front;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectTestCase
{
    public AspectTestCase()
    {
        System.out.println("初始化完成..");
    }
    
    @Pointcut("execution(* cn.brave.service.balance.IUserBalanceService.getList(..))")
    private void pointCut()
    {
        //无任何方法调用
    }
    
    @Before("pointCut()")
    public void before(JoinPoint point)
    {
        System.out.println("测试切入点[Start]...");
        System.out.println(point.getArgs().length);
        System.out.println("测试切入点[End]...");
    }
    
    @After("pointCut()")
    public void after()
    {
        System.out.println("测试切入点完成..");
        
        
        
    }
    
    
    
    
    
}
package cn.brave.web.anno;

import cn.brave.web.TestController;
import org.springframework.context.annotation.Configuration;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedType;


@Configuration
public class UserCenter
{
    
    
    public static void main(String[] args)
    {
        //注解解析
        Class cls = OwnAnnotation.class;
        if(cls.isAnnotation())
        {
            Annotation[] annotations = cls.getAnnotations();
            //包含注解
            for(Annotation a : annotations)
            {
                System.out.println(a.annotationType().getName());
                
            }
            
            
            
        }
        
        
    }
    
}

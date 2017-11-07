package cn.brave.web.anno;

import org.springframework.stereotype.Component;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Target;

@Inherited
@Target({ElementType.METHOD})
@Component
public @interface OwnAnnotation
{
    String id() default "Multi-001001";
    
    String name();
    
    String value();
    
}

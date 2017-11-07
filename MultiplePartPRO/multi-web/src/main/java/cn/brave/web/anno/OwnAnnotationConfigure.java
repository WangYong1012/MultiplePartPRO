package cn.brave.web.anno;

import org.apache.log4j.Logger;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.beans.factory.support.BeanNameGenerator;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.annotation.Configuration;

/**
 * 2017年11月7日 17:06:28
 * 设置注解的翻译部分
 */
@Configuration
public class OwnAnnotationConfigure implements BeanDefinitionRegistryPostProcessor
{
    private String id;
    private String name;
    private String value;
    
    private static final Logger log = Logger.getLogger(OwnAnnotationConfigure.class);
    
    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException
    {
        log.info("postProcessBeanDefinitionRegistry ..");
        
        
        
        
    }
    
    //处理
    private void registerRequestProxyHandler(BeanDefinitionRegistry registry)
    {
        
        
        
        
        
    }
    
    
    
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory factory) throws BeansException
    {

        
        
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getValue() {
        return value;
    }
    public void setValue(String value) {
        this.value = value;
    }
}
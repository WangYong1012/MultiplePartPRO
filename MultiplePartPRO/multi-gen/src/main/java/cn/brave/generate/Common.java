package cn.brave.generate;

import org.mybatis.generator.api.ShellRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.*;
import java.net.URL;

/**
 * 2017年11月6日 13:19:02
 * 代码生成器类
 * 加载完成参数后，可以直接执行该部分代码
 */
public class Common
{
    //主函数
    public static void main(String[] args) throws IOException 
    {
        ClassLoader loader = ClassLoader.getSystemClassLoader();
        URL url = loader.getResource("");
        System.out.println(url.getPath());
        String[] params = new String[]{"-configfile", url.getPath() + "generatorConfig.xml"};
        ShellRunner.main(params);
    }
}
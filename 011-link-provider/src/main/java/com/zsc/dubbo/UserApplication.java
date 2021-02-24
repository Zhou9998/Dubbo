package com.zsc.dubbo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.io.IOException;

public class UserApplication {
    public static void main(String[] args) throws IOException {
        String path = "dubbo-link-provider.xml";
        //获取spring容器
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(path);
        
        //启动spring容器
        ((ClassPathXmlApplicationContext)applicationContext).start();

        //想让服务提供者程序一直处于运行状态
        System.in.read();
    }
}

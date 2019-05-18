package com.github.ltsopensource.example.springboot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class StringIOCUtil implements ApplicationContextAware {

    private static ApplicationContext context;

    public void setApplicationContext(ApplicationContext ctx) {
        context = ctx;
    }


    /**
     * 获取动态实体对象
     *
     * @param beanName : 类全路径
     * @return
     */
    public static Object getBean(String beanName) {
        if (context == null) {
            return null;
        }
        return context.getBean(beanName);
    }


    public static <T> T getBean(Class<T> clazz) {
        if (context == null || clazz == null) {
            return null;
        }
        return context.getBean(clazz);
    }
}
package com.github.ltsopensource.example.springboot;

import com.alibaba.fastjson.JSONObject;

import java.lang.reflect.Method;


public class FutureUtil {

    /**
     * 反射工具类
     *
     * @param className:类名
     * @param methodName：方法名
     * @param contJson：方法的执行参数 throws TranFailException
     */
    public static Object reflectUtil(String className, String methodName, JSONObject contJson){
        Object result = null;
        try {
            Class<?> clz = Class.forName(className); //加载类
            Object oTargetObject = StringIOCUtil.getBean(clz); //获取bean
            Method method; //获取动态执行方法
            if (oTargetObject != null) {
                method = oTargetObject.getClass().getMethod(methodName, new Class[]{String.class});
                result = method.invoke(oTargetObject, new Object[]{contJson.toString()});
            }
        } catch (Exception e) {
           e.printStackTrace();
        }
        return result;
    }
}
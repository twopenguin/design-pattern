package com.zcd.learn.designpattern.proxy.jdkproxy;

import com.zcd.learn.designpattern.proxy.IFunction;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created by zhangyida on 2017/9/11.
 */
public class JdkProxyEntrance {

    public static void main(String[] args) {
        IFunction function = new FunctionImpl();
        FunctionProxy proxy1 = new FunctionProxy(function);
        IFunction obj = (IFunction)getProxy(function, proxy1);
        int result = obj.function(3,2);
        System.out.println(result);
    }

    public static Object getProxy(Object target, InvocationHandler handler){
        return Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), target.getClass().getInterfaces(), handler);
    }


}

package com.zcd.learn.designpattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created by zcd on 2017/9/14.
 */
public class ProxyFactory {

    public Object getProxy(Object target, InvocationHandler handler) {
        return Proxy.newProxyInstance(Thread.currentThread()
                .getContextClassLoader(), target.getClass().getInterfaces(), handler);
    }

}

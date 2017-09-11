package com.zcd.learn.designpattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by zhangyida on 2017/9/11.
 */
public class FunctionProxy implements InvocationHandler{

    private IFunction target;

    public FunctionProxy(IFunction function) {
        this.target = function;
    }

    public Object getProxy() {
        return Proxy.newProxyInstance(Thread.currentThread()
                        .getContextClassLoader(), target.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object obj = method.invoke(target,args);
        after();
        return obj;
    }

    private void before(){
        System.out.println("before!");
    }

    private void after(){
        System.out.println("after!");
    }
}

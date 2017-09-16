package com.zcd.learn.designpattern.proxy.jdkproxy;

import com.zcd.learn.designpattern.proxy.IFunction;
import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created by zhangyida on 2017/9/11.
 */
public class JdkProxyEntrance {

    public static void main(String[] args) {
        IFunction function = new FunctionImpl();
        // FunctionProxy proxy1 = new FunctionProxy(function);
        // IFunction obj = (IFunction)getProxy(function, proxy1);
        // int result = obj.function(3,2);
        // System.out.println(result);
        generaterClassFile(function.getClass().getInterfaces());
    }

    public static Object getProxy(Object target, InvocationHandler handler){
        return Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), target.getClass().getInterfaces(), handler);
    }

    public static void generaterClassFile(Class[] interfaces){
        String proxyName = "com.sun.proxy.$Proxy0";
        byte[] proxyClassFile = ProxyGenerator.generateProxyClass(
                proxyName, interfaces);
        try {
            FileOutputStream var1 = new FileOutputStream(proxyName + ".class");
            var1.write(proxyClassFile);
            var1.close();
        } catch (IOException var2) {
            throw new InternalError("I/O exception saving generated file: " + var2);
        }
    }


}

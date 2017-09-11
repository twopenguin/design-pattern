package com.zcd.learn.designpattern.proxy;

/**
 * Created by zhangyida on 2017/9/11.
 */
public class Entrance {

    public static void main(String[] args) {
        IFunction function = new FunctionImpl();
        FunctionProxy proxy = new FunctionProxy(function);
        IFunction obj = (IFunction)proxy.getProxy();
        int result = obj.function(3,2);
        System.out.println(result);
    }

    
}

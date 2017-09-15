package com.zcd.learn.designpattern.proxy.cglibproxy;

import com.zcd.learn.designpattern.proxy.IFunction;

/**
 * Created by zhangyida on 2017/9/15.
 */
public class CglibProxyEntrance {
    public static void main(String[] args) {
        CglibProxy proxy = new CglibProxy();
        //通过生成子类的方式创建代理类
        CglibFunction proxyImp = (CglibFunction)proxy.getProxy(CglibFunction.class);
        proxyImp.funcA();
    }
}

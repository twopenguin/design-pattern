package com.zcd.learn.designpattern.proxy.cglibproxy;

import net.sf.cglib.proxy.Enhancer;

/**
 * Created by zhangyida on 2017/9/15.
 */
public class CglibProxyEntrance {
    public static void main(String[] args) {

        // System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "E:\\Bode");
        CglibProxy proxy = new CglibProxy();
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(CglibFunction.class);
        enhancer.setCallback(proxy);

        CglibFunction proxyImp = (CglibFunction)enhancer.create();
        proxyImp.funcA();
    }

}

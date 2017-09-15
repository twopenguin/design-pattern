package com.zcd.learn.designpattern.proxy.cglibproxy;

/**
 * Created by zhangyida on 2017/9/15.
 */
public class CglibFunction {
    public void funcA(){
        System.out.println("CglibFunction funcA");
    }

    public int funcB(int a, int b){
        System.out.println("CglibFunction funcB");
        return a + b;
    }
}

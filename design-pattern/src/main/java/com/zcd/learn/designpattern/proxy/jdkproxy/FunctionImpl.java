package com.zcd.learn.designpattern.proxy.jdkproxy;

import com.zcd.learn.designpattern.proxy.IFunction;

/**
 * Created by zhangyida on 2017/9/11.
 */
public class FunctionImpl implements IFunction {
    @Override
    public int function(int a, int b) {
        return a + b;
    }

    @Override
    public void print() {
        System.out.println("FunctionImpl print!");
    }
}

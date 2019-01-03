package com.shijian.proxyTest;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: K0370089
 * Date: 2018-12-14
 * Time: 10:15
 */
public class CarHandler implements InvocationHandler {
    private Car car;

    public CarHandler(Car car) {
        this.car = car;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("befort invoke");
        method.invoke(car, args);
        System.out.println("after invoke");
        return null;
    }
}

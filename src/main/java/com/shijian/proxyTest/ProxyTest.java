package com.shijian.proxyTest;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Proxy;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: K0370089
 * Date: 2018-12-14
 * Time: 10:20
 */
public class ProxyTest {
    public static void main(String[] args) {
        Car testCar = (Car) Proxy.newProxyInstance(Car.class.getClassLoader(), new Class<?>[]{Car.class}, new CarHandler(new Lanbogini()));
        testCar.desc();
    }
}

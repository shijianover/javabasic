package com.shijian.genericTest;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: K0370089
 * Date: 2018-12-28
 * Time: 14:48
 */
public interface LookUp<T> {
    T find(String name);
}

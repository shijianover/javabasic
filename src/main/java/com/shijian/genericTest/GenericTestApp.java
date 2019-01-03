package com.shijian.genericTest;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: K0370089
 * Date: 2018-12-28
 * Time: 14:45
 */
public class GenericTestApp {
    public static void main(String[] args){
        LookUp<Integer> lookUp = new IntegerLookUp();
        String[] names = {"shijian","shijian1"};
        ((IntegerLookUp) lookUp).processValues(names,lookUp);
    }

}

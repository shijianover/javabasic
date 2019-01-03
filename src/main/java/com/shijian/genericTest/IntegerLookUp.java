package com.shijian.genericTest;


/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: K0370089
 * Date: 2018-12-28
 * Time: 14:49
 */
public class IntegerLookUp implements LookUp<Integer> {

    private String[] names;
    private Integer[] values;

    public Integer find(String name) {
        for (int i = 0; i < names.length; i++) {
            if (names[i].equals(name)) {
                return values[i];
            }
        }
        return null;
    }

    void processValues(String[] names, LookUp<?>table){
        return;
    }

}


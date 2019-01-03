package com.shijian.aopTest.service;

import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: K0370089
 * Date: 2018-12-14
 * Time: 11:35
 */
@Service
public class AopTest {
    public void add() {
        System.out.println("do add");
    }

    public void delete() {
        System.out.println("do delete");
    }

    public void edit() {
        System.out.println("edit");
    }

    public boolean query() {
        System.out.println("do query");
        return false;
    }
}

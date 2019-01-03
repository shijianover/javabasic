package com.shijian.aopTest;

import com.shijian.aopTest.service.AopTest;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: K0370089
 * Date: 2018-12-14
 * Time: 11:39
 */
public class AopTestApplication {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:smart-context.xml");
        AopTest aopTest = context.getBean(AopTest.class);
        aopTest.add();
        aopTest.query();
    }
}

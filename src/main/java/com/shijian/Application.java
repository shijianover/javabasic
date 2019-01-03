package com.shijian;

import com.shijian.bean.SimpleBean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: K0370089
 * Date: 2018-12-11
 * Time: 19:26
 */
public class Application {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("smart-context.xml");
        SimpleBean bean = context.getBean(SimpleBean.class);
        bean.test();
        context.close();
    }
}

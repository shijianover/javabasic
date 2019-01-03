package com.shijian.constructorTest;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: K0370089
 * Date: 2018-12-28
 * Time: 15:34
 */
public class Constructor {

    static{
        System.out.println("执行了静态初始化块");
    }
    private static long id = 0;
    {
        //id++;
        System.out.println("i:"+id);
    }
    public Constructor(){
        System.out.println("调用了无参构造器");
    }

    public Constructor(String name){
        this();//显式调用无参构造器
        System.out.println("调用了有参构造器");
    }

    public static void testStaticMethod(){
        System.out.println("调用了静态方法");
    }

    public static void testVariableArg(String... agrs){

        for(String obj : agrs){
            System.out.println(obj);
        }
    }
}

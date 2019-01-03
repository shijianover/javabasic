package com.shijian.aopTest;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: K0370089
 * Date: 2018-12-14
 * Time: 11:18
 */
@Component
@Aspect
public class Operator {
    //    第一个*表示匹配任意的方法返回值，..(两个点)表示零个或多个，上面的第一个..表示service包及其子包,第二个*表示所有类,第三个*表示所有方法，第二个..表示方法的任意参数个数
    @Pointcut("execution(* com.shijian.aopTest.service..*.*(..))")
    public void pointCut() {
    }

    @Before("pointCut()")
    public void doBefore() {
        System.out.println("do before");
    }

    @After("pointCut()")
    public void doAfter() {
        System.out.println("do after");
    }

    @AfterReturning(value = "pointCut()", returning = "returnVal")
    public void afterReturn(JoinPoint joinPoint, Object returnVal) {
        System.out.println("afterReturn:" + returnVal);
    }

    @AfterThrowing(value = "pointCut()", throwing = "error")
    public void afterThrowing(JoinPoint joinPoint, Throwable error) {
        System.out.println("afterThrowing:" + error.getMessage());
    }

    @Around(value = "pointCut()")
    public void around(ProceedingJoinPoint pjp) {
        System.out.println("AOP Aronud before...");
//        做环绕通知的时候，调用ProceedingJoinPoint的proceed()方法才会执行目标方法。
        try {
            pjp.proceed();
        } catch (Throwable e) {
            e.printStackTrace();
        }
        System.out.println("AOP Aronud after...");
    }
}

package cn.itcast.aop;

import org.aspectj.lang.ProceedingJoinPoint;

//import org.aspectj.lang.ProceedingJoinPoint;
public class MyBook {
    public void before1(){
        System.out.println("前置增强（增强类中的方法，在原类原add方法之前执行==========）");
    }
    public void after1(){
        System.out.println("后置增强（增强类中的方法，在原类原add方法之后执行==========）");
    }

    public void around1(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
//        方法之前
        System.out.println("环绕增强（增强类中的方法，在原类原add方法执行前执行==========）");
//        执行方法
        proceedingJoinPoint.proceed();
//        方法之后
        System.out.println("环绕增强（增强类中的方法，在原类原add方法执行前执行==========）");
    }
}

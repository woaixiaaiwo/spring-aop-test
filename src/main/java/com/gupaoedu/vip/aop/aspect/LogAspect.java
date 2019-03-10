package com.gupaoedu.vip.aop.aspect;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;

/**
 *  一个切面类
 */
public class LogAspect {
	
	public void before(JoinPoint joinPoint){
		System.out.println("调用方法之前执行" + joinPoint);
	}
	
	public void after(JoinPoint joinPoint){
		System.out.println("调用之后执行" + joinPoint);
	}
	
	public void afterReturn(JoinPoint joinPoint){
		System.out.println("调用获得返回值之后执行" + joinPoint);
	}
	
	
	public void afterThrow(JoinPoint joinPoint){
		System.out.println("抛出异常之后执行" + joinPoint);
	}
}

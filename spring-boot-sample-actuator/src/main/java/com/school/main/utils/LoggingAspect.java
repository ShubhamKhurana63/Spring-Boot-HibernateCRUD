package com.school.main.utils;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {

	@Before("allMethods()")
	public void beforEntering(JoinPoint joinPoint) {
		System.out.println("Entering" + joinPoint.toString());
	}

	@Before("args(name) && allMethods()")
	public void checkArgs(String name) {
		System.out.println("this  is the argument hta has been passed" + name);
	}

	@AfterThrowing(pointcut="allMethods()",throwing="ex")
	public void afterEntering(JoinPoint joinPoint,Exception ex) {
		System.out.println("Exiting" + joinPoint.toLongString());
	    System.out.println("the exception is  thrown"+ex.getMessage());
	}
	@Pointcut("within(com.school.main..*)")
	public void allMethods() {
	}
}

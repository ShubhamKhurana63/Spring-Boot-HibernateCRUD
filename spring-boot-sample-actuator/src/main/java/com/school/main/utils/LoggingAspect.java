package com.school.main.utils;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {

	@Before("allMethods()")
	public void beforEntering(JoinPoint joinPoint) {
		System.out.println("Entering" + joinPoint.toString());
	}
	@After("allMethods()")
	public void afterEntering(JoinPoint joinPoint) {
    System.out.println("Exiting"+joinPoint.toLongString());
	}
	@Pointcut("within(com.school.main.controller.CheckController)")
	public void allMethods() {
	}

}

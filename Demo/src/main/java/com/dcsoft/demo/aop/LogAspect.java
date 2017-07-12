package com.dcsoft.demo.aop;

import java.lang.reflect.Method;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogAspect {
	
	/*@Pointcut("@annotation(com.java.demo.aop.Action)")
	public void annotationPointCut(){};
	
	@After("annotationPointCut()")
	public void after(JoinPoint joinPoint){
		MethodSignature signature = (MethodSignature) joinPoint.getSignature();
		
		Method method = signature.getMethod();
		Action action = method.getAnnotation(Action.class);
		System.out.println("注释方式拦截"+action.name());
	}*/
	
	
	@Before("execution(* com.dcsoft.demo.service.impl.UserServiceImpl.saveUser(..))")
	public void before(JoinPoint joinPoint){
		MethodSignature signature = (MethodSignature) joinPoint.getSignature();
		
		Method method = signature.getMethod();
		 
		System.out.println("方法规则Before方式拦截"+method.getName());
	}

	@After("execution(* com.dcsoft.demo.service.impl.UserServiceImpl.saveUser(..))")
	public void after(JoinPoint joinPoint){
		MethodSignature signature = (MethodSignature) joinPoint.getSignature();
		
		Method method = signature.getMethod();
		 
		System.out.println("方法规则After方式拦截"+method.getName());
	}
	
	@AfterReturning("execution(* com.dcsoft.demo.service.impl.UserServiceImpl.saveUser(..))")
	public void afterReturning(JoinPoint joinPoint){
		MethodSignature signature = (MethodSignature) joinPoint.getSignature();
		
		Method method = signature.getMethod();
		 
		System.out.println("方法规则AfterReturning方式拦截"+method.getName());
	}
	
	
	@AfterThrowing("execution(* com.dcsoft.demo.service.impl.UserServiceImpl.saveUser(..))")
	public void afterThrowing(JoinPoint joinPoint){
		MethodSignature signature = (MethodSignature) joinPoint.getSignature();
		
		Method method = signature.getMethod();
		 
		System.out.println("方法规则AfterThrowing方式拦截"+method.getName());
	}
}

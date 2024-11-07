package com.gentech.dept.aop;

import java.util.Date;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import com.gentech.dept.entity.Department;

@Aspect
@Component
public class DepartmentAspect {

	@Before(value = "execution(* com.gentech.dept.controller.DepartmentController.*(..))")
	public void beforeAdvice(JoinPoint joinPoint)
	{
		System.out.println("The Execution of "+joinPoint.getSignature()+" controller functionlatity has started at :"+new Date());
	}

	@After(value = "execution(* com.gentech.dept.controller.DepartmentController.*(..))")
	public void afterAdvice(JoinPoint joinPoint)
	{
		System.out.println("The Execution of "+joinPoint.getSignature()+" controller functionlatity has ended at :"+new Date());
	}
	// Service Layer AOP Implementation
	@Before(value = "execution(* com.gentech.dept.serviceimpl.DepartmentServiceImpl.*(..))")
	public void beforeAdviceforService(JoinPoint joinPoint)
	{
		System.out.println("The Execution of "+joinPoint.getSignature()+" Service functionlatity has started at :"+new Date());
	}

	@After(value = "execution(* com.gentech.dept.serviceimpl.DepartmentServiceImpl.*(..))")
	public void afterAdviceforservice(JoinPoint joinPoint)
	{
		System.out.println("The Execution of "+joinPoint.getSignature()+" service functionlatity has ended at :"+new Date());
	}

	// AfterReturning AOP
	@AfterReturning(value = "execution(* com.gentech.dept.serviceimpl.DepartmentServiceImpl.*(..))", returning = "department")
	public void afterReturningAdviceforservice(JoinPoint joinPoint, Department department)
	{
		System.out.println("The Execution of return method "+joinPoint.getSignature()+" service functionlatity has completed with response :"+department.getDeptName());
	}

	// AfterReturning AOP
	@AfterThrowing(value = "execution(* com.gentech.dept.serviceimpl.DepartmentServiceImpl.*(..))", throwing = "exception")
	public void afterExceptionAdviceforservice(JoinPoint joinPoint, Exception exception)
	{
		System.out.println("The Execution of method "+joinPoint.getSignature()+" service functionlatity has completed with Exception :"+exception);
	}
}

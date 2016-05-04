/*
 * 个人主页：http://hinylover.space
 *
 * Creation Date: 2016年4月7日 下午2:29:42
 */
/*
 * 个人主页：http://hinylover.space
 *
 * Creation Date: 2016年4月7日 下午2:29:42
 */
package demo.learn.aop.spring.annotation;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;


/**
 * @author xialei
 * @version 1.0 2016年5月4日下午10:12:56
 */
@Component
@Aspect
public class MyInterceptor {
	
	@Pointcut("execution(* demo.learn.aop.spring.annotation.IStudent.addStudent(..))")
	public void pointCut() {
		
	}
	
	/**
	 * 前置
	 * @param method
	 * @param args
	 * @param target
	 * @throws Throwable
	 */
	@Before("pointCut()")
	public void before()
			throws Throwable {
		System.out.println( "这是BeforeAdvice类的before方法.");
	}

	@AfterReturning("pointCut()")
	public void after() throws Throwable {
		System.out.println("这是AfterAdvice类的afterReturning方法.");
	}
}

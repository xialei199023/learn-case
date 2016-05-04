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
package demo.learn.aop.spring.config;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;


/**
 * @author xialei
 * @version 1.0 2016年5月4日下午10:12:56
 */
public class MyInterceptor {
	
	/**
	 * 前置
	 * @param method
	 * @param args
	 * @param target
	 * @throws Throwable
	 */
	public void before()
			throws Throwable {
		System.out.println( "这是BeforeAdvice类的before方法.");
	}
	
//	public Object invoke() throws Throwable {
//		System.out.println("这是CompareInterceptor类的invoke方法. ");
//		Object result = null;
//		String stu_name = invocation.getArguments()[0].toString();
//		if (stu_name.equals("dragon")) {
//			
//			// 如果学生是dragon时,执行目标方法,
//			result = invocation.proceed();
//
//		} else {
//			System.out.println("此学生是" + stu_name + "而不是dragon,不批准其加入.");
//		}
//
//		return result;
//	}

	@After("pointCut()")
	public void after() throws Throwable {
		System.out.println("这是AfterAdvice类的afterReturning方法.");
	}
}

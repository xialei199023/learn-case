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
package demo.learn.aop.spring.bean;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * @author xialei
 * @version 1.0 2016年5月4日下午9:56:59
 */
public class CompareInterceptor implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		System.out.println("这是CompareInterceptor类的invoke方法. ");
		Object result = null;
		String stu_name = invocation.getArguments()[0].toString();
		if (stu_name.equals("dragon")) {
			
			// 如果学生是dragon时,执行目标方法,
			result = invocation.proceed();

		} else {
			System.out.println("此学生是" + stu_name + "而不是dragon,不批准其加入.");
		}

		return result;
	}

}

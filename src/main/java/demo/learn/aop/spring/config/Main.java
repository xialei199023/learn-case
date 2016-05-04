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

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author xialei
 * @version 1.0 2016年5月4日下午10:01:29
 */
public class Main {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("/aop/applicationContext-aop-config.xml");
		IStudent person = (IStudent) ctx.getBean("student");
		person.addStudent("dragon1");
		ctx.close();
	}
}

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
package demo.learn.jmx.spring;

import java.io.IOException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 基于方法列表和接口定制的MBean管理，可以自定义需要暴露的方法。
 * @author xialei
 * @version 1.0 2016年4月7日下午10:05:29
 */
public class AssemblerMain {

	public static void main(String[] args) throws IOException {
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:jmx/spring/spring-jmx-assembler.xml");
		System.in.read();
	}
}

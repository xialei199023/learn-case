/**
 * 
 */
package demo.learn.jmx.spring;

import java.io.IOException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 利用MBeanExporter自动探测应用中的MBean，无需主动向MBean Server主动注册。
 * @author xialei
 * @version 1.0 2016年4月7日下午9:51:35
 */
public class BeanMain {

	public static void main(String[] args) throws IOException {
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:jmx/spring/spring-jmx-bean.xml");
		System.in.read();
	}
}

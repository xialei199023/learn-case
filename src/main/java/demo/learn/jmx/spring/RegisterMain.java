/**
 * 
 */
package demo.learn.jmx.spring;

import java.io.IOException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 向spring容器主动注册MBean。 这种方法不需要实现特定的MBean接口，一般的Bean类也可以注册成MBean。
 * @author xialei
 * @version 1.0 2016年4月7日下午10:00:32
 */
public class RegisterMain {

	public static void main(String[] args) throws IOException {
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:jmx/spring/spring-jmx-register.xml");
		System.in.read();
	}
}

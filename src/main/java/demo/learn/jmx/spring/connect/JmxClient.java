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
package demo.learn.jmx.spring.connect;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import demo.learn.jmx.spring.annotation.MyInterface;

/**
 * @author xialei
 * @version 1.0 2016年4月7日下午10:27:07
 */
public class JmxClient {
	
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(  
                "classpath:jmx/spring/spring-jmx-annotation-connect-client.xml");  
		MyInterface proxy = (MyInterface) ctx.getBean("proxy");  
        String message = proxy.show();  
        System.out.println(message);
	}
	
}

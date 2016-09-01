package demo.learn.dubbo.spring;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 服务提供者启动类。
 * @author xialei
 *
 * @version 1.0 2016年9月1日 上午10:27:23
 */
public class DubboProducterMain {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:dubbo/spring-dubbo-producter.xml");
		applicationContext.start();
		
		System.out.println("服务启动");
		
		try {
			System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

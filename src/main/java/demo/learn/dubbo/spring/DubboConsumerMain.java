package demo.learn.dubbo.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Dubbo消费者启动类
 * 
 * @author xialei
 *
 * @version 1.0 2016年9月1日 上午10:02:09
 */
public class DubboConsumerMain {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:dubbo/spring-dubbo-consumer.xml");
		Student student = (Student)applicationContext.getBean("student");
		student.dosomething();
		applicationContext.close();
	}
}

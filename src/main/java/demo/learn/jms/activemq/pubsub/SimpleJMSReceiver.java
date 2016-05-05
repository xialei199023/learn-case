/*
 * 个人主页：http://hinylover.space
 *
 * Creation Date: 2016年4月29日 上午9:49:10
 * $Id$
 */
package demo.learn.jms.activemq.pubsub;

import java.io.IOException;

import javax.jms.JMSException;
import javax.jms.TextMessage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jms.JmsException;

/**
 *
 * @author xialei (xialei199023@163.com)
 * @date 2016年4月29日 上午9:49:10
 * @since JDK 1.7
 */
public class SimpleJMSReceiver {

	public static void main(String[] args) throws IOException {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"classpath:jms/activemq/springcontext-pubsub-consumer.xml");
		System.in.read();
	}

	public void receive(TextMessage message) throws JmsException, JMSException {
		//System.out.println(message.getStringProperty("phrCode"));
		System.out.println(message.getText());
	}

}

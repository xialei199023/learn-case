/*
 * 个人主页：http://hinylover.space
 *
 * Creation Date: 2016年4月29日 上午9:47:03
 * $Id$
 */
package demo.learn.jms.activemq.pubsub;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;

/**
 *
 * @author xialei (xialei199023@163.com)
 * @date 2016年4月29日 上午9:47:03
 * @since JDK 1.7
 */
public class SimpleJMSSender {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"classpath:jms/activemq/springcontext-pubsub-producer.xml");

		JmsTemplate jmsTemplate = (JmsTemplate) ctx.getBean("myJmsTemplate");
		for (int i = 0; i < 10; i++) {
			jmsTemplate.send(new MessageCreator() {
				public Message createMessage(Session session)
						throws JMSException {
					TextMessage msg = session.createTextMessage();
					// 设置消息属性
					msg.setStringProperty("phrCode", "C001");
					// 设置消息内容
					msg.setText("Hello World!");
					return msg;
				}
			});
		}
	}

}

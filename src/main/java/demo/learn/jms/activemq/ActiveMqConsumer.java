/*
 * 个人主页：http://hinylover.space
 *
 * Creation Date: 2016年4月26日 下午12:06:05
 * $Id$
 */
package demo.learn.jms.activemq;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.MessageConsumer;
import javax.jms.Session;

import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.ActiveMQConnectionFactory;

/**
 *
 * @author xialei (xialei199023@163.com)
 * @date 2016年4月26日 下午12:06:05
 * @since JDK 1.7
 */
public class ActiveMqConsumer {

	public static void main(String[] args) {  
        // ConnectionFactory ：连接工厂，JMS 用它创建连接  
        ConnectionFactory connectionFactory;  
        // Connection ：JMS 客户端到JMS Provider 的连接  
        Connection connection = null;  
        // Session： 一个发送或接收消息的线程  
        Session session;  
        // Destination ：消息的目的地;消息发送给谁.  
        Destination destination;  
        // 消费者，消息接收者  
        MessageConsumer consumer;  
        connectionFactory = new ActiveMQConnectionFactory(  
                ActiveMQConnection.DEFAULT_USER,  
                ActiveMQConnection.DEFAULT_PASSWORD, "tcp://10.100.112.105:61616");  
        try {  
            // 构造从工厂得到连接对象  
            connection = connectionFactory.createConnection();  
            // 启动  
            connection.start();  
            // 获取操作连接  
            session = connection.createSession(Boolean.FALSE,  
                    Session.AUTO_ACKNOWLEDGE);  
            // 获取session注意参数值xingbo.xu-queue是一个服务器的queue，须在在ActiveMq的console配置  
            destination = session.createQueue("ota_queue");  
            consumer = session.createConsumer(destination);  
            //while (true) {  
                // 设置接收者接收消息的时间，为了便于测试，这里谁定为100s  
                Object message = consumer.receive(100000);  
                
                if (null != message) {  
                    System.out.println("收到消息" + message.toString());  
                    System.out.println("getClass=="+message.getClass());
                } else {  
                    //break;  
                }  
            //}  
        } catch (Exception e) {  
            e.printStackTrace();  
        } finally {  
            try {  
                if (null != connection)  
                    connection.close();  
            } catch (Throwable ignore) {  
            }  
        }  
    }  

}

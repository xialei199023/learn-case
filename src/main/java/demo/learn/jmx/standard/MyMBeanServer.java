package demo.learn.jmx.standard;

import java.io.IOException;
import java.lang.management.ManagementFactory;
import java.rmi.registry.LocateRegistry;

import javax.management.InstanceAlreadyExistsException;
import javax.management.MBeanRegistrationException;
import javax.management.MBeanServer;
import javax.management.MalformedObjectNameException;
import javax.management.NotCompliantMBeanException;
import javax.management.ObjectName;
import javax.management.remote.JMXConnectorServer;
import javax.management.remote.JMXConnectorServerFactory;
import javax.management.remote.JMXServiceURL;

/**
 *
 * @author xialei (lei.xia@pp.plateno.cc)
 * @date 2016年4月7日 下午2:19:51
 * @since JDK 1.7
 */
public class MyMBeanServer {

	public static void main(String[] args)
			throws InstanceAlreadyExistsException, MBeanRegistrationException,
			NotCompliantMBeanException, MalformedObjectNameException,
			IOException {

		MBeanServer mBeanServer = ManagementFactory.getPlatformMBeanServer();

		// 创建MBean
		MyMBean controller = new My();

		// 将MBean注册到MBeanServer中
		mBeanServer.registerMBean(controller, new ObjectName(
				"MyappMBean:name=My"));
		
		// 创建一个连接器，使得远程客户端可以连接并且管理MBeanServer所注册MBean。
		JMXServiceURL url = new JMXServiceURL("rmi", "127.0.0.1", 9589, "/jndi/rmi://localhost:" + 1099 + "/app");  
		System.out.println(url);

		// start()和stop()来启动和停止 JMXConnectorServer  
        JMXConnectorServer jmxServer = JMXConnectorServerFactory.newJMXConnectorServer(url, null, mBeanServer);    
        // 在RMI上注册  
        LocateRegistry.createRegistry(1099);  
        jmxServer.start();  
	}
}

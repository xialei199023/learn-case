/*
 * 个人主页：http://hinylover.space
 *
 * Creation Date: 2016年4月7日 下午2:28:54
 * $Id$
 */
package demo.learn.jmx.standard;

/**
 * MBean接口，接收MBeanServer的管理。接口名必须为xxxMBean。
 * @author xialei (xialei199023@163.com)
 * @date 2016年4月7日 下午2:28:54 
 * @since JDK 1.7
 */
public interface MyMBean {

	/**
	 * 设置name
	 * @param name
	 */
    public void setName(String name);  
    
    /**
     * 返回name
     * @return
     */
    public String getName();  
      
      
    //操作  
    /** 
     * 获取当前信息 
     * @return 
     */  
    public String status();  
    public void start();  
    public void stop(); 
}


/*
 * 个人主页：http://hinylover.space
 *
 * Creation Date: 2016年4月7日 下午2:29:42
 * $Id$
 */
package demo.learn.jmx.standard;


/**
 * 实现了MyMBean。注意，类名必须为My,这是MBean的标准写法。
 * @author xialei (xialei199023@163.com)
 * @date 2016年4月7日 下午2:29:42 
 * @since JDK 1.7
 */
public class My implements MyMBean {
	
	private String name;  

	public void setName(String name) {  
        this.name = name;  
    }  
  
    public String getName() {  
        return this.name;  
    }  
      
    public String status() {  
        return "this is a Controller MBean,name is " + this.name;  
    }  
  
    public void start() {  
        System.out.println("do start");
    }  
  
  
    public void stop() {  
    	System.out.println("do stop");
    }
}


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
package demo.learn.jmx.spring.annotation;

import org.springframework.jmx.export.annotation.ManagedAttribute;
import org.springframework.jmx.export.annotation.ManagedOperation;
import org.springframework.jmx.export.annotation.ManagedResource;

/**
 * 定义一个使用注解的Bean。
 * 
 * @ManagedResource表示指定该类的实例作为MBean注册到MBean Server中，然后可以通过对属性和方法分别使用@ManagedAttribute和@ManagedOperation来指定暴露的属性和方法。
 * @author xialei
 * @version 1.0 2016年4月7日下午10:10:24
 */
@ManagedResource(objectName = "annojmx:myjao=AnnotationObject", description = "MyJavaAnnotationObject")  
public class MyJavaAnnotationObject {

	    private long id;  
	    private String name;  
	  
	    public MyJavaAnnotationObject() {  
	        super();  
	    }  
	  
	    public MyJavaAnnotationObject(long id, String name) {  
	        super();  
	        this.id = id;  
	        this.name = name;  
	    }  
	  
	    @ManagedAttribute  
	    public long getId() {  
	        return id;  
	    }  
	  
	    public void setId(long id) {  
	        this.id = id;  
	    }  
	  
	    public String getName() {  
	        return name;  
	    }  
	  
	    @ManagedAttribute  
	    public void setName(String name) {  
	        this.name = name;  
	    }  
	  
	    @ManagedOperation  
	    public String show() {  
	        StringBuffer sb = new StringBuffer().append("id=").append(id).append(  
	                ", name=").append(name);  
	        System.out.println(sb.toString());
	        return sb.toString();  
	    } 
}

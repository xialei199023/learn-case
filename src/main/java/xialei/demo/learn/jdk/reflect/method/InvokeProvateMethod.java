package xialei.demo.learn.jdk.reflect.method;

import java.lang.reflect.Method;

/**
 * 使用泛型调用类的私有方法
 *
 * @author xialei (lei.xia@pp.plateno.cc)
 * @date 2016年3月22日 上午9:53:14 
 */
public class InvokeProvateMethod {

	public static void main(String[] args) throws Exception {
		Class<IncludePrivateMethodClass> clazz = IncludePrivateMethodClass.class;
		Method method = clazz.getDeclaredMethod("privateMethodParamInt", int.class);
		method.setAccessible(true); // 设置为可访问
		
		IncludePrivateMethodClass instance = clazz.newInstance();
		String result = (String)method.invoke(instance, 23);
		System.out.println(result);
	}
}

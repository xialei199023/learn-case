package demo.learn.jdk.reflect.method;

import java.lang.reflect.Method;

/**
 * ʹ�÷��͵������˽�з���
 *
 * @author xialei (lei.xia@pp.plateno.cc)
 * @date 2016��3��22�� ����9:53:14 
 */
public class InvokeProvateMethod {

	public static void main(String[] args) throws Exception {
		Class<IncludePrivateMethodClass> clazz = IncludePrivateMethodClass.class;
		Method method = clazz.getDeclaredMethod("privateMethodParamInt", int.class);
		method.setAccessible(true); // ����Ϊ�ɷ���
		
		IncludePrivateMethodClass instance = clazz.newInstance();
		String result = (String)method.invoke(instance, 23);
		System.out.println(result);
	}
}

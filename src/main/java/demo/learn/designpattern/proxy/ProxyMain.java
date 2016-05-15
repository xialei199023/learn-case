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
package demo.learn.designpattern.proxy;

/**
 * 代理模式，为其他对象提供一种代理，以控制对这个对象的访问。
 * @author xialei
 * @version 1.0 2016年5月15日下午7:54:38
 */
public class ProxyMain {

	public static void main(String[] args) {
		Subject subject = new ConcreteSubject();
		Proxy proxy = new Proxy(subject);
		proxy.request();
	}
}

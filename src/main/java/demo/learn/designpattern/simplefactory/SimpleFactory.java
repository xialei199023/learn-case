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
package demo.learn.designpattern.simplefactory;

/**
 * @author xialei
 * @version 1.0 2016年5月15日下午9:05:13
 */
public class SimpleFactory {

	public static Production createProduction(String type) {
		if ("具体工厂".equals(type)) {
			return new ConcreteProduction();
		} else {
			return null;
		}
	}
}

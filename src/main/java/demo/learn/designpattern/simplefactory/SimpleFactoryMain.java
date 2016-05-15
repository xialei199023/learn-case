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
 * @version 1.0 2016年5月15日下午9:06:23
 */
public class SimpleFactoryMain {

	public static void main(String[] args) {
		Production production = SimpleFactory.createProduction("具体工厂");
		production.operate();
	}
}

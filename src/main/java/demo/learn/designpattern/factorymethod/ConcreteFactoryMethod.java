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
package demo.learn.designpattern.factorymethod;

/**
 * @author xialei
 * @version 1.0 2016年5月15日下午9:11:08
 */
public class ConcreteFactoryMethod implements FactoryMethod {

	@Override
	public Production createProduction() {
		return new ConcreteProduction();
	}

}

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
 * 工厂方法模式，定义一个创建对象的接口，让子类决定实例化哪个类。工厂方法使类的实例化延迟到子类中。
 * 
 * 与简单工厂的区别：无需在工厂中选择判断该实例化哪个类，将选择权交给客户端完成。
 * @author xialei
 * @version 1.0 2016年5月15日下午8:58:32
 */
public class FactoryMethodMain {

	public static void main(String[] args) {
		FactoryMethod factoryMethod = new ConcreteFactoryMethod();
		Production production = factoryMethod.createProduction();
		production.operate();
	}
}

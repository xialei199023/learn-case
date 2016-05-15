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
package demo.learn.designpattern.decorator;

/**
 * 装饰器模式，动态地给对象增加一些额外职责，就增加功能来说，装饰模式比继承更加灵活。
 * @author xialei
 * @version 1.0 2016年5月15日下午7:31:13
 */
public class DecoratorMain {

	public static void main(String[] args) {
		Component component = new ConcreteComponent();
		Decorator decorator = new ConcreateDecorator(component);
		decorator.operate();
	}
}

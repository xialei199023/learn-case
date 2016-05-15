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
 * @author xialei
 * @version 1.0 2016年5月15日下午7:28:50
 */
public abstract class Decorator implements Component {
	
	private Component component;
	
	public Decorator(Component component) {
		this.component = component;
	}

	@Override
	public void operate() {
		System.out.println("被装饰了");
		this.component.operate();
	}

	/**
	 * 装饰器增强方法，用以增加一些额外职责。
	 */
	public abstract void decorate();
}

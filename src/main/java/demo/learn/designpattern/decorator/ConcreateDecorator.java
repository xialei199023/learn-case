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
 * @version 1.0 2016年5月15日下午7:47:42
 */
public class ConcreateDecorator extends Decorator {

	/**
	 * @param component
	 */
	public ConcreateDecorator(Component component) {
		super(component);
	}
	

	@Override
	public void operate() {
		super.operate();
		this.decorate();
	}



	@Override
	public void decorate() {
		System.out.println("装饰器A ");
	}

}

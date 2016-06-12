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
package demo.learn.designpattern.template;

/**
 * @author xialei
 * @version 1.0 2016年6月12日下午10:00:15
 */
public abstract class AbstractTemplate {

	public void operate() {
		System.out.println("算法开始");
		primitiveMethod1();
		primitiveMethod2();
	}
	
	protected abstract void primitiveMethod1();
	
	protected abstract void primitiveMethod2();
}

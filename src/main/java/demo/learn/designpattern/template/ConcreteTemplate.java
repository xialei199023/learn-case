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
 * @version 1.0 2016年6月12日下午10:01:46
 */
public class ConcreteTemplate extends AbstractTemplate {

	/* (non-Javadoc)
	 * @see demo.learn.designpattern.template.AbstractTemplate#primitiveMethod1()
	 */
	@Override
	protected void primitiveMethod1() {
		System.out.println("基本方法1");
	}

	/* (non-Javadoc)
	 * @see demo.learn.designpattern.template.AbstractTemplate#primitiveMethod2()
	 */
	@Override
	protected void primitiveMethod2() {
		System.out.println("基本方法2");
	}

}

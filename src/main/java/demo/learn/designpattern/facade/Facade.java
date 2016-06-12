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
package demo.learn.designpattern.facade;

/**
 * @author xialei
 * @version 1.0 2016年6月12日下午10:07:20
 */
public class Facade {

	private Subsystem1 subsystem1;
	
	private Subsystem2 subsystem2;
	
	public Facade() {
		this.subsystem1 = new Subsystem1();
		this.subsystem2 = new Subsystem2();
	}
	
	public void operate1() {
		this.subsystem1.method1();
		this.subsystem2.method2();
	}
	
	public void operate2() {
		this.subsystem2.method2();
		this.subsystem1.method1();
	}
}

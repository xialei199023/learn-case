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
 * 为众多的子系统提供一个统一的界面，此模式定义个高层接口，这个接口使得使用起来更加容易。
 * 实际上就是client与子系统之间解耦。
 * 
 * @author xialei
 * @version 1.0 2016年6月12日下午10:10:05
 */
public class FacadeMain {

	public static void main(String[] args) {
		Facade facade = new Facade();
		facade.operate1();
		facade.operate2();
	}
}

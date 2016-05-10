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
package demo.learn.designpattern.strategy;

/**
 * 策略模式：定义算法家族，分别封装起来，让它们之间可以相互替换，
 * 此模式让算法的变化，不会影响到使用算法的客户。
 * @author xialei
 * @version 1.0 2016年5月10日下午10:58:56
 */
public class StrategyMain {

	public static void main(String[] args) {
		Strategy strategy = new ConcreteStrategy();
		Context context = new Context(strategy);
		context.operate();
	}
}

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
 * 模板模式，定义一个算法中的操作骨架，将一些步骤延迟到子类中实现。模板方式使得子类可以不改变
 * 一个算法的结构即可重定义该算法的步骤。
 * @author xialei
 * @version 1.0 2016年6月12日下午10:02:27
 */
public class TemplateMain {

	public static void main(String[] args) {
		AbstractTemplate template = new ConcreteTemplate();
		template.operate();
	}
}

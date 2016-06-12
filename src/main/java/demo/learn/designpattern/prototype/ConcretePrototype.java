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
package demo.learn.designpattern.prototype;

/**
 * @author xialei
 * @version 1.0 2016年6月12日下午9:52:48
 */
public class ConcretePrototype extends Prototype {

	/**
	 * @param id
	 */
	public ConcretePrototype(String id) {
		super(id);
	}

	@Override
	public Prototype clone() {
		return new ConcretePrototype(this.id);
	}

}

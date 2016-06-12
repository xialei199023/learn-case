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
 * 原型模式，用原型实例指定创建对象的种类，并且通过拷贝这些原型对象创建新的对象。
 * 
 * @author xialei
 * @version 1.0 2016年6月12日下午9:51:04
 */
public abstract class Prototype {

	protected String id;
	
	public Prototype(String id) {
		this.id = id;
	}
	
	public Prototype clone() {
		return this;
	}
}

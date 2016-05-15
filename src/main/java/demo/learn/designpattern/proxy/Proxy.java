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
package demo.learn.designpattern.proxy;

/**
 * @author xialei
 * @version 1.0 2016年5月15日下午7:41:57
 */
public class Proxy implements Subject {
	
	private Subject subject;
	
	public Proxy(Subject subject) {
		this.subject = subject;
	}

	@Override
	public void request() {
		subject.request();
	}
}

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
package demo.learn.aop.spring.bean;

/**
 * @author xialei
 * @version 1.0 2016年5月4日下午9:53:29
 */
public class StudentImpl implements IStudent {

	/* (non-Javadoc)
	 * @see demo.learn.aop.spring.bean.IStudent#addStudent(java.lang.String)
	 */
	@Override
	public void addStudent(String name) {
		System.out.println( " 欢迎  " + name + "  你加入Spring家庭! " );
	}

}

/*
 * 版权所有 (C) 2016 铂涛集团。
 * 本文件可能包含有铂涛集团的机密或专有信息。
 * 未经许可不得擅自公开、复制这些机密资料及其中任何部分，
 * 只可按照其使用许可协议，在铂涛集团内部使用。
 * 
 * 公司主页：http://www.plateno.com/
 *
 * Creation Date: 2016年3月31日 下午6:04:57
 * $Id$
 */
package xialei.demo.learn.jvm.objectsize;

/**
 *
 * @author xialei (lei.xia@pp.plateno.cc)
 * @date 2016年3月31日 下午6:04:57 
 * @since JDK 1.7
 */
public class ObjectSizeCalculter {

	public static void main(String[] args) {
		MySizeOf.sizeOf(new Object());
	}
}


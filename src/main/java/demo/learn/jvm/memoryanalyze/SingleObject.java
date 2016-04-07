package demo.learn.jvm.memoryanalyze;

import java.util.ArrayList;
import java.util.List;


/**
 * 做内存使用量大小分析。应用单个对象
 * 
 * JVM参数：-Xmx10m -XX:+HeapDumpOnOutOfMemoryError
 * 
 * @author xialei
 *
 */
public class SingleObject {

	public static void main(String[] args) {
		List<Person> list = new ArrayList<Person>();
		while (true) {
			list.add(new Person(1, 1));
		}
	}
}

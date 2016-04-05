package test.demo.jvm.memoryanalyze;

public class Person {

	private int height;
	
	private int age;

	public Person(int height, int age) {
		super();
		this.height = height;
		this.age = age;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}

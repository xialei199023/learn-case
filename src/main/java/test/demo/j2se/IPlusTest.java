package test.demo.j2se;

public class IPlusTest {

	public static void main(String[] args) {
		int j = 0;
		for (int i = 0; i < 50; i++) {
			j = j++;
		}
		System.out.println(j);
	}
}

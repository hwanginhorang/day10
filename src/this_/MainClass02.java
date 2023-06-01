package this_;
class Ex02{
	int num = 111;
	public void test() {
		int num = 100;
		System.out.println("test : " + num);
		System.out.println("test.this : " + this.num);
		test2();
	}
	public void test2() {
		System.out.println("test2 : " + num);
	}
}
public class MainClass02 {
	public static void main(String[] args) {
		Ex02 e = new Ex02();
		e.test();
	}
}

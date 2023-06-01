package variable;

class Ex01{
	public int test1() {
		int num = 100;
		System.out.println("test1 : "+num);
		return num;
	}
	public void test2(int num) {
		System.out.println("test2 : "+num);
	}
}
public class MainClass02 {
	public static void main(String[] args) {
		Ex01 ex = new Ex01();
		int n = ex.test1();
		ex.test2(n);
	}
}

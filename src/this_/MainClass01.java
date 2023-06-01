package this_;
/*
  this
  -클래스 자기 자신의 정보를 가지고 있는 변수
  -메소드를 생성하면 메소드의 0번째 매개변수로 자동으로 만들어 진다
 */
class Ex01{
	int num;
	public void test() {
		System.out.println("this : "+this);
		System.out.println(this.num);
		this.test2();
	}
	public void test2() {
		System.out.println("test222");
	}
}
public class MainClass01 {
	public static void main(String[] args) {
		 Ex01 e = new Ex01();
		 System.out.println(e);
		 e.num=1000;
		 e.test();
	}
}

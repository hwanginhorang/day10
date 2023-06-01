package variable;
/*
  생성시기
  클래스 변수 : 클래스가 메모리에 올라갈 때
  instance variable(인스턴스 변수)
   - 인스턴스 : 객체
   - 객체가 생성될 때 만들어진다
   지역변수(local variable)
    - 메소드 안에서 만들어지는 변수
    - 메소드가 호출이 될 때 생성된다
 */
public class MainClass01 {
	public static void main(String[] args) {
		int num = 100;
		if(true) {
			int a = 1;
			System.out.println(num);
			num=111;
		}
		System.out.println(num);
	}
}

package variable;
class Ex05{
	static int num;
}
public class MainClass05 {
public static void main(String[] args) {
	Ex05.num = 100;
	Ex05 e = new Ex05();
	System.out.println(e.num);
	System.out.println(Ex05.num);
}
}

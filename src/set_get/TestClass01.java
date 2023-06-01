package set_get;
//연산하는곳
public class TestClass01 {
	private String name;
	private String addr;
	private int age;
	
	public void setName(String n) {
		name = n;
	}
	public String getName() {
		return name;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getAddr() {
		return addr;
	}
	
	public void setAge(int a) {
		age = a;
	}
	public int getAge() {
		return age;
	}
}

package homework;

import java.util.Scanner;

class Ex01{
	static int a, b, c;
	int sum;
	int avg;
	public void input() {
		Scanner scan = new Scanner(System.in);
		System.out.println("국어 점수 입력: ");
		a = scan.nextInt();
		System.out.println("영어 점수 입력: ");
		b = scan.nextInt();
		System.out.println("수학 점수 입력: ");
		c = scan.nextInt();
	}
	public void test() {
		sum = a+b+c;
		avg = (a+b+c)/3;
	}
	public void output() {
		System.out.println("국어 점수: "+a);
		System.out.println("영어 점수: "+b);
		System.out.println("수학 점수: "+c);
		System.out.println("합산 점수: "+sum);
		System.out.println("평균 점수: "+avg);
		if(avg>=90) {
			System.out.println("A등급");
		}else if(avg>=80&&avg<90) {
			System.out.println("B등급");
		}else {
			System.out.println("C등급");
		}
	}
}
public class HW {
	public static void main(String[] args) {
		Ex01 e = new Ex01();
		e.input();
		e.test();
		e.output();
	}
}

package homework;

import java.lang.reflect.Member;
import java.util.Scanner;

public class MainClass01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		TestClass01 t = new TestClass01();
		String name, grade;
		int kor, eng, math, sum, num;
		double avg;
		
		while(true) {
			System.out.println("1입력");
			System.out.println("2출력");
			System.out.println("3종료");
			System.out.println(">>>");
			num = scan.nextInt();
			switch(num) {
			case 1:
				System.out.println("이름 입력: ");
				name = scan.next();
				System.out.println("국어 점수 입력: ");
				kor = scan.nextInt();
				System.out.println("영어 점수 입력: ");
				eng = scan.nextInt();
				System.out.println("수학 점수 입력: ");
				math = scan.nextInt();
				
				sum = kor+eng+math;
				avg = (kor+eng+math)/3;
				
				if(avg>=90) {
					grade = "A";
				}else if(avg<=80&&avg>90) {
					grade = "B";
				}else {
					grade = "C";
				}
				
				t.setName(name);
				t.setKor(kor);
				t.setEng(eng);
				t.setMath(math);
				t.setSum(sum);
				t.setAvg(avg);
				t.setGrade(grade);
				System.out.println("등록성공!!");
				break;
			case 2:
				System.out.println("이름: "+t.getName());
				System.out.println("국어점수: "+t.getKor());
				System.out.println("영어점수: "+t.getEng());
				System.out.println("수학점수: "+t.getMath());
				System.out.println("합산점수: "+t.getSum());
				System.out.println("평균점수: "+t.getAvg());
				System.out.println("등급: "+t.getGrade());
				break;
			case 3:
				System.out.println("종료");break;
			}
		}
	}
}

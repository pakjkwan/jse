package switchcase;

import java.util.Scanner;

public class ReportCard {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("학생이름 :");
		String name = sc.next();

		System.out.println("국어 점수 :");
		int kor = sc.nextInt();
		System.out.println("영어 점수 :");
		int eng = sc.nextInt();
		System.out.println("수학 점수 :");
		int math = sc.nextInt();
		System.out.println("과학 점수 :");
		int sci = sc.nextInt();

		int total = kor + eng + math + sci;
		double avg = total/4;
		String result = "";
		/*
		if (avg >= 90.0) {
			result = "장학생";
		} else if(avg >= 60){
			result = "합격";
		}else{
			result = "불합격";
		}
		*/
		
		int key = (int) (avg/10); // 지역변수의 초기화
		String result2 = "";
		
		switch (key) {
		case 9: case 10:
			result2 = "장학생입니다.";
			break;
		case 6:case 7:case 8:
			result2 = "합격입니다.";
			break;
		default:
			result2 = "불합격입니다.";
			break;
		}
		
		System.out.println(result + result2);
		
	}
}












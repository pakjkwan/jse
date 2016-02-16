package operation;

import java.util.Scanner;

public class Kaup {
	/**
	 * 이름 입력 name 키를 입력하세요 height 몸무게를 입력하세요 weight 카우푸 인덱스 index = (몸무게 /
	 * (키*키))*10000 index > 30 비만 > 24 과체중 => if( ) > 20 정상 > 15 저체중 >13 마름 > 10
	 * 영양실조 소모증
	 * 
	 * 결과 : 홍길동님은 과체중 입니다.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String name = "";
		System.out.println("이름을 입력하세요 :");
		name = scanner.next();

		double height = 0.0;// 키
		double weight = 0.0;// 몸무게
		System.out.println("키를 입력하세요 : ");
		height = scanner.nextDouble();
		System.out.println("몸무게를 입력하세요 : ");
		weight = scanner.nextDouble();

		int index = (int) ((weight / (height * height)) * 10000);
		String state = "";
		if (index > 30) {
			state = "비만";
		} else if (index > 24) {
			state = "과체중";
		} else if (index > 20) {
			state = "정상";
		} else if (index > 15) {
			state = "저체중";
		} else if (index > 13) {
			state = "마름";
		} else if (index > 10) {
			state = "영양실조";
		} else {
			state = "소모증";
		}
		System.out.println(name + "님은 " + state + " 입니다");
	}
}

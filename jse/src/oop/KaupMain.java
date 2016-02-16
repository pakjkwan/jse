package oop;

import java.util.Scanner;

public class KaupMain {
	/**
	 * 이름 입력 name 키를 입력하세요 height 몸무게를 입력하세요 weight 카우푸 인덱스 index = (몸무게 /
	 * (키*키))*10000 index > 30 비만 > 24 과체중 => if( ) > 20 정상 > 15 저체중 >13 마름 > 10
	 * 영양실조 소모증
	 * 
	 * 결과 : 홍길동님은 과체중 입니다.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// 참조변수타입 인스턴스(객체) = new 생성자;
		KaupService service = new KaupServiceImpl2();
		String name = "",result = "";
		System.out.println("이름을 입력하세요 :");
		name = scanner.next();

		double height = 0.0;// 키
		double weight = 0.0;// 몸무게
		System.out.println("키를 입력하세요 : ");
		height = scanner.nextDouble();
		System.out.println("몸무게를 입력하세요 : ");
		weight = scanner.nextDouble();
		result = service.getState(height,weight);
		System.out.println(name + "님은 " +result+ " 입니다");
	}
}

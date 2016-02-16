package operation;

import java.util.Scanner;

public class TimeCalc {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("*** 초를 시간과 분과 초로 바꾸어 주는 프로그램 ***");
		System.out.println("초를 입력하세요");

		int hour = 0;// 시
		int min = 0;// 분
		int sec = 0;// 초
		sec = scanner.nextInt();

		hour = sec / 3600;
		min = sec % 3600 / 60;
		sec = sec % 3600 % 60;

		if (hour > 0) {
			System.out.println(hour + "시간" + min + "분" + sec + "초 입니다.");
		} else if (min > 0) {
			System.out.println(min + "분" + sec + "초 입니다.");
		} else {
			System.out.println(sec + "초 입니다.");
		}

	}
}

package operation;

import java.util.Scanner;

public class Variable {
	public static void main(String[] args) {
		boolean b = true;
		int i = 3;
		double d = 3.3d;
		String s = "결과값 : ";
		System.out.println("결과값 : "+i);
		
		System.out.println("얼마입니까?");
		Scanner scanner = new Scanner(System.in);
		int price = scanner.nextInt();
		System.out.println(price +"원 입니다.");
		
		System.out.println("이것은 무엇입니까?");
		String what = scanner.next();
		System.out.println(what + "입니다.");
	}
}

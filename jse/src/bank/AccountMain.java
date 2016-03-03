package bank;

import java.util.Scanner;

public class AccountMain {
	public static void main(String[] args) {
		AdminService service = new AdminServiceImpl(100);
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름 , 비번");
		System.out.println(service.open(scanner.next(), scanner.nextInt()));
	}
}

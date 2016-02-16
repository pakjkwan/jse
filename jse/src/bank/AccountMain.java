package bank;

import java.util.Scanner;

public class AccountMain {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름 , 비번");
		AccountService service = new AccountServiceImpl();
		System.out.println(service.open(scanner.next(), scanner.nextInt()));
	}
}

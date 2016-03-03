package bank;

public class MinusAccount extends AccountServiceImpl{
	private int accountNo;
	private String name;
	private int money;
	private int password;
	public static final String BANK = "러시앤캐시";
	
	@Override
	public String withdraw(int money) {
		if (money > this.money) {
			System.out.println("잔액을 소진한 잔액은 대출로 전환 합니다");
		} else {

		}
		return super.withdraw(money);
	}
	public String loan(){
		System.out.println("대출가능합니다");
		return "300만원 대출";
	}
	
}

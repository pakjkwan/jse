package bank;

public class AccountServiceImpl implements AccountService{
	AccountBean account = new AccountBean();
	@Override
	public String open(String name, int password) {
		// 1. 통장개설
		
		account.setName(name);
		account.setPassword(password);
		return account.toString();
	}

	@Override
	public String deposit(int money) {
		// 2. 입금
		
		return null;
	}

	@Override
	public String withdraw(int money) {
		// 3. 출금
		
		return null;
	}

	@Override
	public String search() {
		// 4. 잔액조회
		return null;
	}
}

package bank;

public interface AccountService {
	// Database 에서 CRUD
	// create
	// read
	// update
	// delete
	
	
	// 2. 입금
	public String deposit(int money);
	// 3. 출금
	public String withdraw(int money);
	// 4. 잔액조회
	public String search();
}


public abstract class Account implements Transaction {
	private Integer accountNumber;
	private Long balance = 10000l;
	
	public Account() {
	}
	
	
	public Account(Integer accountNumber) {
		super();
		this.accountNumber = accountNumber;
	}


	public Integer getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(Integer accountNumber) {
		this.accountNumber = accountNumber;
	}
	public Long getBalance() {
		return balance;
	}
	public void setBalance(Long balance) {
		this.balance = balance;
	}
	
	
}

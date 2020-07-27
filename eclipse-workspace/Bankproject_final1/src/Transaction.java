
public interface Transaction {
	
	public void deposit(Long amount);
	public void withdraw(Long amount);
	public Long balanceCheck();

}

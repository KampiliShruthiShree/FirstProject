
public class CurrentAccount extends Account {

	public CurrentAccount(Integer accountNumber) {
		super(accountNumber);
	}
	
	@Override
	public void deposit(Long amount) {
		Long updatedBalance = amount + super.getBalance();
		super.setBalance(updatedBalance);
	}

	@Override
	public void withdraw(Long amount) {
		if(super.getBalance() < amount) {
			System.out.println("Insufficient Balance");
		}else {
			Long updatedBalance = super.getBalance() - amount;
			super.setBalance(updatedBalance);
			System.out.println("Transaction completed");
		}
	}

	@Override
	public Long balanceCheck() {
		return super.getBalance();
	}

}

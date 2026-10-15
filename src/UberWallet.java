
public class UberWallet {
	private double balance;

	public UberWallet(double balance) {
		this.balance = balance;
	}

	public void deposit(double balance) {
		if (balance >= 0) {
			this.balance += balance;
			System.out.println("Deposited successfully: " + balance);
		}

	}
	
	public void withdraw(double balance)
	{
		
		if(this.balance>=balance)
		{
			this.balance-=balance;
			System.out.println (balance);
			return;
		}
		else {
			System.out.println("Insufficient balance");
		}
	
		
	}
	public double currentBalance()
	{
		return this.balance;
	}
}

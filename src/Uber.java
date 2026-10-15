
public class Uber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UberWallet user1=new UberWallet(100.00);
		user1.deposit(200);
		System.out.println("Current balance: "+user1.currentBalance());
		user1.withdraw(500);
		System.out.println("Current balance: "+user1.currentBalance());
	}

}

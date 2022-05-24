package task4;
//Account Balance
public class AccountBalanceBelow1000 extends Exception {
	float balance; 
	public AccountBalanceBelow1000(float balance) {
		// TODO Auto-generated constructor stub
		this.balance = balance;
		System.out.println("the balance is "+balance);
	}

}

package task4;

public class TransactionAbove1Lakhs extends Exception {

	int amount;
	public void Transactionabove1Lakhs(int amount) {
		// TODO Auto-generated constructor stub
		this.amount = amount;
		System.out.println("the total transacted amount is "+amount);
	}

	

}

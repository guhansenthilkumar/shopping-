package task4;

public class TransactionAbove3 extends Exception{

	int count;
	public TransactionAbove3(int count) {
		// TODO Auto-generated constructor stub
		this.count =count;
		System.out.println("this is your "+count+" transaction");
	}


}

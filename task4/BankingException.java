package task4;

	import java.util.*;

	public class BankingException {
		int transactionCount = 0;
		int transactionAmount =0;
		float accountBalance;
		Scanner obj = new Scanner(System.in);
		BankingException(float accountBalance){
			this.accountBalance = accountBalance;
		}
		
		public void WithDraw() {
			System.out.println("enter the amount to be withdrawn ");
			int withDrawAmount = obj.nextInt();
			try {
				if(accountBalance < 1000) {
					throw new AccountBalanceBelow1000(accountBalance);
				}
			}		
			catch(AccountBalanceBelow1000 e) {
				System.out.println("alret! account balance below 1000");
			}
			try {
				if(transactionCount >3) {
					throw new TransactionAbove3(transactionCount);
				}
			}
			catch(TransactionAbove3 e) {
				System.out.println("alret! you have already done 3 transactions");
			}
			
			try {
				if(transactionAmount > 100000) {
					throw new TransactionAbove1Lakhs();
				}
			}
			catch(TransactionAbove1Lakhs e) {
				System.out.println("alret! transaction amount more than 100000");
			}

			try {
				if(accountBalance < withDrawAmount ) {
					throw new InsufficientBalance(withDrawAmount-accountBalance);
					
				}
				else {
					accountBalance= accountBalance - withDrawAmount;
					System.out.println("balance after transaction is "+accountBalance);
					transactionCount++;
					transactionAmount = transactionAmount+withDrawAmount;
					try {
						if(accountBalance < 1000) {
							throw new AccountBalanceBelow1000(accountBalance);
						}
					}		
					catch(AccountBalanceBelow1000 e) {
						System.out.println("alret! account balance below 1000");
					}
					
				}
			}
			catch(InsufficientBalance e) {
				System.out.println("alret! not enogh money");
			}
		}

}

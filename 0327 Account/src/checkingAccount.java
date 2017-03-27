public class checkingAccount extends Account {
	private double credit_limit;
	private double interest;
	private double loan_interest;
	private double withdrawable;
	
	public checkingAccount(double bal, double a, double b, double c){
		super(bal);
		credit_limit = a;
		interest = b;
		loan_interest = c;
		withdrawable = credit_limit + balance;
	}
	
	@Override
	public void debit(double a){
		withdrawable = balance + credit_limit;
		if(withdrawable<0){
			System.out.print("Over credit limit!\n");
		}else{
			balance = balance-a;
			/*if(balance < 0){
				System.out.print("You have minus balance!\n");
			}*/
		}
	}
	
	@Override
	public double  getWithdrawableAccount(){
		withdrawable = balance + credit_limit;
		if(withdrawable < 0){
			withdrawable = 0;
		}
		return withdrawable;
	}
	
	@Override
	public void passTime(int a){

		if(balance < 0){
			balance = balance + a * balance * loan_interest;
			withdrawable = balance + credit_limit;
		}else{
			balance = balance + a * balance * interest;
			withdrawable = balance + credit_limit;
		}

	}
	
	public boolean isBankrupted(){
		if(withdrawable<0){
			withdrawable = 0;
			return false;
		}else{
			return true;
		}
	}
}

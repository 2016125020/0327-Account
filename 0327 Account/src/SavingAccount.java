public class SavingAccount extends Account {
	private double interest;
	private double withdrawal;
	private int month;
	
	public SavingAccount(double a, double b){
		super(a);
		interest = b;
		month = 0;
		withdrawal = 0;
	}
	
	public void debit(double a){
		if(month < 12){
			withdrawal = 0;
			System.out.println("아직 출금할 수 없습니다.");
		}else{
			withdrawal = balance;
			if(withdrawal<0){
				System.out.print("Over credit limit!\n");
			}else{
				balance = balance-a;
				withdrawal = balance;
				/*if(balance < 0){
					System.out.print("You have minus balance!\n");
				}*/
			}
		}
	}
	
	@Override
	public double getWithdrawableAccount() {
		return withdrawal;
	}

	@Override
	public void passTime(int a) {
		month = month + a;
		withdrawal = balance;
		if(month < 12){
			withdrawal = 0;
		}else if(month == 12){
			balance = balance * Math.pow((1+interest),month);
			withdrawal = balance;
		}else{
			withdrawal = balance;
		}
	}
}

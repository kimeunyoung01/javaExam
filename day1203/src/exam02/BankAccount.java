package exam02;

public class BankAccount {
	private int balance;

	public void deposit(int amount)
	{
		balance += amount;
		System.out.println(amount+"를 입금하여 잔액이 "+ balance+"가 되었어요!");
	}
	
	public void withdraw(int amount)
	{
		try {		
			if(amount > balance)
			{
				throw new NegativeBalanceException("잔액이 부족합니다.");
			}
			
			balance -= amount;
			System.out.println(amount+"를 인출하여 잔액이 "+ balance+"가 되었어요!");
		}catch(Exception e)
		{
			System.out.println("예외발생:"+e.getMessage());
		}		
	}
		
	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public BankAccount(int balance) {
		super();
		this.balance = balance;
		System.out.println("계좌를 개설하였습니다. 초기입금:"+balance);
	}

	public BankAccount() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}

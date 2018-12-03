package exam02;

public class BankAccount {
	private int balance;

	public void deposit(int amount)
	{
		balance += amount;
		System.out.println(amount+"�� �Ա��Ͽ� �ܾ��� "+ balance+"�� �Ǿ����!");
	}
	
	public void withdraw(int amount)
	{
		try {		
			if(amount > balance)
			{
				throw new NegativeBalanceException("�ܾ��� �����մϴ�.");
			}
			
			balance -= amount;
			System.out.println(amount+"�� �����Ͽ� �ܾ��� "+ balance+"�� �Ǿ����!");
		}catch(Exception e)
		{
			System.out.println("���ܹ߻�:"+e.getMessage());
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
		System.out.println("���¸� �����Ͽ����ϴ�. �ʱ��Ա�:"+balance);
	}

	public BankAccount() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
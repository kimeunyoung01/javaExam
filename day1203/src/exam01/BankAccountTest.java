package exam01;

import exam02.BankAccount;

public class BankAccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BankAccount ba = new BankAccount(10000);
		ba.deposit(10000);
		ba.withdraw(5000);
		ba.withdraw(20000);
		System.out.println("�����ܾ�:"+ba.getBalance());
	}
}

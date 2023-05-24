
package com.shristic.absdemos;

public class Current extends Bank{

	double balance=super.getBalance();
		public Current(double balance) {
			super(balance);
			// TODO Auto-generated constructor stub
		}

		@Override
		void withDraw(double amount) {
			System.out.println("you are withdrawing from current account");
			balance=balance-amount;
			super.balance=balance;
		}

		@Override
		void deposit(double amount) {
			System.out.println("You are depositing to current account");
			balance=balance+amount;
			super.balance=balance;
			
		}
		
	

}


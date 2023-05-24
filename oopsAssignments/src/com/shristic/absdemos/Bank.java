package com.shristic.absdemos;

public abstract class Bank {
	
		double balance;

		public Bank(double balance) {
			super();
			this.balance = balance;
		}
		abstract void withDraw(double amount);
		abstract void deposit(double amount);
		double getBalance()
		{
			return balance;
		}

	}

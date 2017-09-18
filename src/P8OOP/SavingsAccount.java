package P8OOP;

import P6OOP.Account;

public class SavingsAccount extends Account
{
	public SavingsAccount()
	{
		super();
	}

	public SavingsAccount(int id, double balance)
	{
		super(id, balance);
	}

	@Override
	public void withdraw(double ammount)
	{
		double balance = getbalance();
		if (balance < ammount)
		{
			System.out.println("Your current balance is" + balance + " You have attempted to withdraw " + ammount
					+ "This transaction cannot be completed. Your balance is unchanged.");
		} else
		{
			super.withdraw(ammount);
		}
	}
}
package P8OOP;

import P6OOP.Account;

public class CheckingAccount extends Account
{
	private double overdraftLimit;

	public CheckingAccount()
	{
		super();
	}

	public CheckingAccount(int id, double balance)
	{
		super(id, balance);
		overdraftLimit = 1000;
	}

	public double getOverdraftLimit()
	{
		return overdraftLimit;
	}

	public void setOverdraftLimit(double overdraftLimit)
	{
		this.overdraftLimit = overdraftLimit;
	}

	@Override
	public double getMonthlyInterest()
	{
		return (getbalance() > 0) ? super.getMonthlyInterest() : 0;
	}

	@Override
	public void withdraw(double amount)
	{
		if (getbalance() - amount < -1 * overdraftLimit)
			System.out.printf("\tYour current balance is $%.2f. " + "Your overdraft limit is $%.2f."
					+ "\n\tYou have attempted to withdraw $%.2f." + "\n\tThis transaction cannot be completed. "
					+ "Your balance is unchanged.\n", getbalance(), overdraftLimit, amount);
		else
			super.withdraw(amount);
	}

	@Override
	public String toString()
	{
		return "id = " + getid() + ", balance = " + getbalance() + ", overdraft limit = " + overdraftLimit
				+ ", date created = " + getdateCreated();
	}

}

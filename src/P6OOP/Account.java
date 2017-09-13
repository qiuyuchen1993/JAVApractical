package P6OOP;

import java.util.Date;

public class Account
{
	private int id;
	private double balance;
	private static double annualInterestRate;
	private Date dateCreated;

	// Construct an account
	public Account()
	{
		id = 0;
		balance = 0.0;
		dateCreated = new Date();
	}

	// Construct an account with id and balance
	public Account(int id, double balance)
	{
		this.id = id;
		this.balance = balance;
		dateCreated = new Date();
	}

	public int getid()
	{
		return id;
	}

	public double getbalance()
	{
		return balance;
	}

	public double getannualIntersetRate()
	{
		return annualInterestRate;
	}

	public void setid(int id)
	{
		this.id = id;
	}

	public void setbalance(double balance)
	{
		this.balance = balance;
	}

	public void setannualIntersetRate(double annualIntersetRate)
	{
		this.annualInterestRate = annualIntersetRate;
	}

	public Date getdateCreated()
	{
		return dateCreated;
	}

	public double getMonthlyInterest()
	{
		return balance * annualInterestRate / 12;
	}

	public void withdraw(double amount)
	{
		balance = balance - amount;
	}

	public void deposit(double amount)
	{
		balance = balance - amount;
	}

	@Override
	public String toString()
	{
		return "id: " + id + "\n" + "balance: " + balance + "\n" + "created date: " + dateCreated;
	}

}

package P8OOP;

public class subclassaccounttest
{
	public static void main(String[] args)
	{
		// Create a new account with the specified id and balance
		SavingsAccount savingsAccount = new SavingsAccount(1111, 2500);
		CheckingAccount checkingAccount = new CheckingAccount(2222, 2500);

		// Set the annual interest rate
		checkingAccount.setannualIntersetRate(0.045);
		// savingsAccount.setannualIntersetRate(0.045);

		// Invoke the toString methods
		System.out.println("Savings account: " + savingsAccount.toString());
		System.out.println("Checking account: " + checkingAccount.toString() + "\n");

		// Withdraw $2,000 from the savings account and display the balance
		System.out.println("Savings account: withdraw $2,000...");
		savingsAccount.withdraw(2000);
		System.out.println("Savings account balance: " + savingsAccount.getbalance());

		// Withdraw a further $2,000 from the savings account and display the
		// balance
		System.out.println("Savings account: withdraw a further $2,000...");
		savingsAccount.withdraw(2000);
		System.out.println("Savings account balance: " + savingsAccount.getbalance() + "\n");

		// Withdraw $3,200 from the checking account and display the balance
		System.out.println("Checking account: withdraw $3,200...");
		checkingAccount.withdraw(3200);
		System.out.println("Checking account balance: " + checkingAccount.getbalance());

		// Withdraw a further $800 from the checking account and display the
		// balance
		System.out.println("Checking account: withdraw a further $800...");
		checkingAccount.withdraw(800);
		System.out.println("Checking account balance: " + checkingAccount.getbalance());

		// Deposit $100 into the checking account, set the overdraft limit to
		// $1,400, try again to withdraw $800, and display the balance.
		System.out.println("Checking account: deposit $100...");
		checkingAccount.deposit(100);
		System.out.println("Checking account: set the overdraft limit to $1,400...");
		checkingAccount.setOverdraftLimit(1400);
		System.out.println("Checking account: withdraw $800...");
		checkingAccount.withdraw(800);
		System.out.println("Checking account balance: " + checkingAccount.getbalance());
	}
}
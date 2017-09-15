package P6OOP;

public class TestAccount
{
	public static void main(String[] args)
	{
		Account a1 = new Account(1122, 20000);
		a1.setannualIntersetRate(0.045);
		a1.withdraw(2500);
		a1.deposit(3000);
		System.out.println(a1.toString());
	}

}

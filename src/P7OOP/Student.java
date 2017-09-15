package P7OOP;

public class Student
{
	private int id;
	private BirthDate birthDate;

	public Student(int ssn, int year, int month, int day)
	{
		id = ssn;
		birthDate = new BirthDate(year, month, day);
	}

	public int getId()
	{
		return id;
	}

	public BirthDate getBirthDate()
	{
		return birthDate;
	}

	public String toString()
	{
		return "id: " + id + "\nbirth date: " + birthDate;
	}
}
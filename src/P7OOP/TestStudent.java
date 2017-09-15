package P7OOP;

public class TestStudent
{
	public static void main(String[] args)
	{
		Student student = new Student(111223333, 1970, 5, 3);
		BirthDate date = student.getBirthDate();

		System.out.println(student.toString());
		date.setYear(2010);
		System.out.println(student.toString());
	}
}
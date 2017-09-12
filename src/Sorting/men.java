package Sorting;

public class men implements Comparable<men>
{
	private String name;
	private int age;

	public men(String name, int age)
	{
		this.name = name;
		this.age = age;
	}

	// redefine compareTo
	// if the ages are the same, order with the Letter
	// if the ages are different, order with the age

	@Override
	public int compareTo(men that)
	{
		if (this.age < that.age)
			return -1;
		else if (this.age > that.age)
			return 1;
		else
			return this.name.compareTo(that.name);
	}

	@Override
	public String toString()
	{
		return "this man: " + this.name + " " + Integer.toString(this.age);
	}
}
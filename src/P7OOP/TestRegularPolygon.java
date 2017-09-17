package P7OOP;

public class TestRegularPolygon
{
	public static void main(String[] args)
	{
		RegularPolygon a = new RegularPolygon(3, 10, 2.5, 8);
		RegularPolygon b = new RegularPolygon(6, 4, 0, 0);
		RegularPolygon c = new RegularPolygon(3, 1);
		RegularPolygon d = new RegularPolygon(10, 5);
		RegularPolygon e = new RegularPolygon(4, 6, 3, 6.8);
		RegularPolygon[] p = new RegularPolygon[5];
		p[0] = a;
		p[1] = b;
		p[2] = c;
		p[3] = d;
		p[4] = e;

		// print out all
		for (int i = 0; i < p.length; i++)
		{
			System.out.printf("Polygon %d: %s\n", (i + 1), p[i].toString());
			System.out.printf("\tPerimeter: %.2f\n", p[i].getPerimeter());
			System.out.printf("\tArea: %.2f\n\n", p[i].getArea());
		}

		// Find and print the polygon with the smallest perimeter
		System.out.println("The polygon with the smallest perimeter: " + getSmallestPerimenter(p).toString() + "\n");

		// Find and print the polygon with the largest area
		System.out.println("The polygon with the largest area: " + getLargestArea(p).toString() + "\n");
	}

	// Return a reference to the polygon in the array with the smallest
	// perimeter
	public static RegularPolygon getSmallestPerimenter(RegularPolygon[] arr)
	{
		int index = 0;
		for (int i = 1; i < arr.length; i++)
			if (arr[i].getPerimeter() < arr[index].getPerimeter())
				index = i;

		return arr[index];
	}

	// Return a reference to the polygon in the array with the largest area
	public static RegularPolygon getLargestArea(RegularPolygon[] arr)
	{
		int index = 0;
		for (int i = 1; i < arr.length; i++)
			if (arr[i].getArea() > arr[index].getArea())
				index = i;

		return arr[index];
	}

}
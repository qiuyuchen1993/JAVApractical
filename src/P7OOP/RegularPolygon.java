package P7OOP;

public class RegularPolygon
{
	private int n;
	private double length;
	private double x;
	private double y;

	public RegularPolygon()
	{
		n = 3;
		length = 1;
		x = 0;
		y = 0;
	}

	// A constructor that creates a polygon with the specified number of sides
	// and length of side, centered at (0, 0)
	public RegularPolygon(int n, double length)
	{
		this(n, length, 0.0, 0.0);
	}

	// A constructor that creates a polygon with the specified number of sides,
	// length of side, and x- and y-coordinates
	public RegularPolygon(int n, double length, double x, double y)
	{
		this.n = n;
		this.length = length;
		this.x = x;
		this.y = y;
	}

	// Return n
	public int getN()
	{
		return n;
	}

	// Set a new n
	public void setN(int n)
	{
		this.n = n;
	}

	// Return the side length
	public double getLength()
	{
		return length;
	}

	// Set a new side length
	public void setLength(double length)
	{
		this.length = length;
	}

	// Return the x-coordinate
	public double getX()
	{
		return x;
	}

	// Set a new x-coordinate
	public void setX(double x)
	{
		this.x = x;
	}

	// Return the y-coordinate
	public double getY()
	{
		return y;
	}

	// Set a new y-coordinate
	public void setY(double y)
	{
		this.y = y;
	}

	// Return the perimeter
	public double getPerimeter()
	{
		return n * length;
	}

	// Return the area
	public double getArea()
	{
		return n * length * length / (4 * Math.tan(Math.PI / n));
	}

	// Return a String representation of the polygon
	public String toString()
	{
		return "number of sides = " + n + ", side length = " + length + ", center point = (" + x + ", " + y + ")";
	}
}

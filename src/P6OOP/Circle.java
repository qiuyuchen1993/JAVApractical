package P6OOP;

public class Circle
{
	private double radius; // The radius
	private double x;// The position x
	private double y;// The position y
	private static int numberOfObjects = 0; // Number of the objects created

	// Construct a circle with radius 1
	public Circle()
	{
		radius = 1.0;
		x = 0;
		y = 0;
		numberOfObjects++;
	}

	// Construct a circle with the specified radius
	public Circle(double radius)
	{
		this.radius = radius;
		numberOfObjects++;
	}

	// Construct a circle with radius and position
	public Circle(double radius, double x, double y)
	{
		this.radius = radius;
		this.x = x;
		this.y = y;
		numberOfObjects++;
	}

	// Return the radius
	public double getRadius()
	{
		return radius;
	}

	// Set a new radius
	public void setRadius(double radius)
	{
		this.radius = radius;
	}

	public void move(double x, double y)
	{
		this.x = x;
		this.y = y;
	}

	// Return the number of objects created
	public static int getNumberOfObjects()
	{
		return numberOfObjects;
	}

	// Return the area
	public double getArea()
	{
		return radius * radius * Math.PI;
	}

	public double getDistance(Circle c2)
	{
		return Math.sqrt(Math.pow(this.x - c2.x, 2) + Math.pow(this.y - c2.y, 2));
	}

	// Return a string representation
	public String toString()
	{
		return "radius = " + radius;
	}
}
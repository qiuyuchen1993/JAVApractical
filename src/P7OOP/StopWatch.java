package P7OOP;

public class StopWatch
{
	private long startTime; // The start time
	private long endTime; // The end time

	// A no-arg constructor
	public StopWatch()
	{
		startTime = System.currentTimeMillis();
	}

	// return a start time
	public long getStartTime()
	{
		return startTime;
	}

	// return a end time
	public long getEndTime()
	{
		return endTime;
	}

	// reset a start time
	public void start()
	{
		startTime = System.currentTimeMillis();
	}

	// set a end time
	public void stop()
	{
		endTime = System.currentTimeMillis();
	}

	// Return the elapsed time
	public long getElapsedTime()
	{
		return endTime - startTime;
	}

}

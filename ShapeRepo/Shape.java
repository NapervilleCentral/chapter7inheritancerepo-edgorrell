import TurtleGraphics.Pen;

public abstract class Shape
{
	private double xPos, yPos;

	public Shape (double x, double y)
	{


	}

	// you must write these methods here
	public double getXpos()
	{
	}
	public double getYpos()
	{
	}
	//public void move(double xLoc, double yLoc);
	// increase the size by the factor
	//public void stretchby (double factor);

	public abstract double getArea();

	public abstract void draw (Pen p);

	//toString should display xpos, ypos
	public String toString()
	{
	}

}//end of Shape
//Name
//Date
//program
//Program Description

import TurtleGraphics.Pen;

public class Circle extends Shape
{
	private double radius;


	public void draw(Pen p)
	{
		double side = 2.0 * Math.PI * radius / 120.0;
		p.up();
		p.move (xPos + radius, yPos - side / 120.0);
		p.setDirection (90);
		p.down();
		for (int i = 0; i<120; i++)
		{
			p.move (side);
			p.turn(3);
		}

	}


	public double getRadius()
	{
	}

	public String toString()
	{
	}






}//end of Circle